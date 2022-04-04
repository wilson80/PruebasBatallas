
package controlPartida;

import Tienda.Mascotas;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugadores;
import java.util.Scanner;

/**
 *
 * @author Jonwil
 */
public class Batalla {
    private Jugadores jugador1;
    private Jugadores jugadorIA;
    
    private Mascotas[] equipoIA = new Mascotas[6];
    private Mascotas[] equipoJugador1 = new Mascotas[6];
    
    private int ronda;
    private MenuEntreBatallas entreBatallas;
    
//    private  double[] guardarVidaJugador;
//    private double[] guardarVidaIA;
    double VidaIA1,VidaIA2,VidaIA3,VidaIA4,VidaIA5;
    double VidaJ1,VidaJ2,VidaJ3,VidaJ4,VidaJ5;

    public Batalla(Jugadores jugador1, Jugadores jugadorIA, int ronda) {
        this.jugador1 = jugador1;
        this.jugadorIA = jugadorIA;
        this.ronda = ronda;
        
    }
    
    ///nada
        
//        
    
        
    public void BatallaRonda(){
//        guardarVida();
        equipoIA = jugadorIA.getEquipoMascotas().clone();
        equipoJugador1 = jugador1.getEquipoMascotas().clone();
        guardarVida();
        enterContinuar();
        imprimirEquipoMascotas();//imprimeEquipos
      enterContinuar();
        ubicarJugadoresPosicionAtaque(equipoJugador1);
        ubicarJugadoresPosicionAtaque(equipoIA);
        //////////////
        imprimirEquipoMascotas();//imprimeEquipos
        System.out.println("Primer Ataque");
        realizarAtaques();                      //realizar pelea
        if(jugador1.getGanoPerdio()){
            System.out.println("Has Ganado!!!");
        }else{
            System.out.println("Has Perdido");
        }
        System.out.println("Fin de la Ronda "+ronda);
        setVidaDanoDespuesCombate();
        enterContinuar();
        
        
    }


    public void realizarAtaques(){  //Todos los Ataque en una Ronda
        boolean mascotaPataAtacarJugador1=true;
        boolean mascotaPataAtacarIA=true;

        while(equipoJugador1[5].estaVivo() && equipoIA[5].estaVivo()){    
            double ataqueJ=equipoJugador1[5].atacar();    //ataque Jugador 1
            
            equipoIA[5].recibirDano(ataqueJ);           
            double ataquiIA=equipoIA[5].atacar();         //ataque Jugador 1
            
            equipoJugador1[5].recibirDano(ataquiIA);
            enterContinuar();
            imprimirEquipoMascotas();
            enterContinuar();
            if(equipoJugador1[5].haMuerto()){
                equipoJugador1[5]=null;
                ubicarJugadoresPosicionAtaque(equipoJugador1);
            }
            if(equipoIA[5].haMuerto()){
                equipoIA[5]=null;
                ubicarJugadoresPosicionAtaque(equipoIA);
            }
            imprimirEquipoMascotas();
            
                if(equipoJugador1[5]==null){            //verifica si el jugador aun tiene Mascotas Disponibles
                    mascotaPataAtacarJugador1=false;
                    jugador1.setGanoPerdio(false, ronda);   
                    break;
                }
            
                if(equipoIA[5]==null){                  //verifica si la IA aun tiene Mascotas Disponibles
                    mascotaPataAtacarIA=false;
                    jugador1.setGanoPerdio(true, ronda);
                    break;
                }
         }  
       
    }   
    
    

    public void ubicarJugadoresPosicionAtaque(Mascotas[] equipoMascotas){
//        Mascotas[] equipoJugadores
        for (int j = 1; j <=4; j++){
            for (int i = 1; i <=4; i++){
                if(equipoMascotas[i]!=null){
                    if(equipoMascotas[i+1]==null){
                        equipoMascotas[i+1]=equipoMascotas[i];
                        equipoMascotas[i+1].setPosicion(i+1);
                        equipoMascotas[i]=null;
                    }
                }
            }
        }   
        
    }    
    
    

        
    public void imprimirEquipoMascotas(){
        for (int i = 0; i < 50; i++){
            System.out.println("");
        }
        System.out.println("\t\t\tMapa seleccionado 1\t\t\t\t\t\t\t\tMapa seleccionado 2\n\n\n\n");
        
                 //imprimir Nivel y experiencia
        imprimirNivelExpJugador1();
        imprimirNivelExpIA();
        System.out.println("");
        
        System.out.print("  ");             //imprimir Mascotas
        for (int i = 1; i < 6; i++){
            if(equipoJugador1[i]!=null){
                System.out.print(String.format("%d[ %s ]   ",equipoJugador1[i].getPosicion()
                                            ,equipoJugador1[i].getNombreMascota()));
            }else{
                System.out.printf("%d[           ]",i);
            }
        }
        
        System.out.print("<----->");
        System.out.print("   ");
        for (int i = 5; i > 0; i--){
            if(equipoIA[i]!=null){
                System.out.print(String.format("%d[ %s ]   ",equipoIA[i].getPosicion()
                                                                  ,equipoIA[i].getNombreMascota()));
            }else{
                System.out.printf("%d[           ]",i);
            }
        }
        System.out.println("");
                                           ///imprimir Vida y Dano
        imprimirDanoVidaJugador1();
        imprimirDanoVidaIA();
                                                            
        System.out.println("\n\n\n\n");
                
        
    } 
    
    
    
    
    private void imprimirDanoVidaJugador1(){                 //imprime dano/vida
        System.out.print("    ");
        for (int j = 1; j < 6; j++){
            if(equipoJugador1[j]!=null){
                System.out.print(String.format("%.2f/%.2f      ",equipoJugador1[j].getUnidadesDeDanoInicial(), equipoJugador1[j].getUnidadesDeVidaInicial()));
            }else{
                System.out.print("             ");
            }
        }
    }
    private void imprimirDanoVidaIA(){
        System.out.print("\t        ");
        for (int j = 5; j > 0; j--){                                        //imprime dano/vida
            if(equipoIA[j]!=null){
                System.out.print(String.format("%.2f/%.2f",equipoIA[j].getUnidadesDeDanoInicial(), equipoIA[j].getUnidadesDeVidaInicial()));
                if(j<=5 && j>=2){
                    System.out.print("      ");
                }
            }else{
                System.out.print("             ");
            }
        }
    }       
    
    
        
        private void imprimirNivelExpJugador1(){
            System.out.print("    ");
            for (int i = 1; i < 6; i++){
                if(equipoJugador1[i]!=null){
                    int nivel=equipoJugador1[i].getNivel();
                    int experiencia=equipoJugador1[i].getExperiencia();
                    String mostrarExperiencia;
                    if(experiencia==1){
                        mostrarExperiencia="--";
                    }else if(experiencia==2){
                        mostrarExperiencia="*-";
                    }else if(experiencia==3){
                        mostrarExperiencia="---";
                    }else if(experiencia==4){
                        mostrarExperiencia="*--";
                    }else if(experiencia==5){
                        mostrarExperiencia="**-";
                    }else if(experiencia==6){
                            mostrarExperiencia="***";
                    }else{
                        mostrarExperiencia="";
                    }
                    System.out.print(String.format("Lvl %d %s       ", nivel, mostrarExperiencia));
                }else{
                    System.out.print("               ");     
                }
            }
        }
        private void imprimirNivelExpIA(){
            System.out.print("           ");
            for (int i = 5; i > 0; i--){
                if(equipoIA[i]!=null){
                    int nivel=equipoIA[i].getNivel();
                    int experiencia=equipoIA[i].getExperiencia();
                    String mostrarExperiencia;
                    if(experiencia==1){
                        mostrarExperiencia="--";
                    }else if(experiencia==2){
                        mostrarExperiencia="*-";
                    }else if(experiencia==3){
                        mostrarExperiencia="---";
                    }else if(experiencia==4){
                        mostrarExperiencia="*--";
                    }else if(experiencia==5){
                        mostrarExperiencia="**-";
                    }else if(experiencia==6){
                            mostrarExperiencia="***";
                    }else{
                        mostrarExperiencia="";
                    }
                    System.out.print(String.format("Lvl %d %s       ", nivel, mostrarExperiencia));
                }else{
                    System.out.print("                 ");     
                }
            }
        }
        
    private void enterContinuar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione Enter para continuar");
        scanner.nextLine();
    }

    public void guardarVida() {
                if(equipoIA[1]!=null){
                    VidaIA1=equipoIA[1].getUnidadesDeVidaInicial();
                }
                if(equipoIA[2]!=null){
                    VidaIA2=equipoIA[2].getUnidadesDeVidaInicial();
                }
                if(equipoIA[3]!=null){
                    VidaIA3=equipoIA[3].getUnidadesDeVidaInicial();
                }
                if(equipoIA[4]!=null){
                    VidaIA4=equipoIA[4].getUnidadesDeVidaInicial();
                }
                if(equipoIA[5]!=null){
                    VidaIA5=equipoIA[5].getUnidadesDeVidaInicial();
                }
                
                
                if(equipoJugador1[1]!=null){
                    VidaJ1=equipoJugador1[1].getUnidadesDeVidaInicial();
                }
                if(equipoJugador1[2]!=null){
                    VidaJ2=equipoJugador1[2].getUnidadesDeVidaInicial();
                }
                if(equipoJugador1[3]!=null){
                    VidaJ3=equipoJugador1[3].getUnidadesDeVidaInicial();
                }
                if(equipoJugador1[4]!=null){
                    VidaJ4=equipoJugador1[4].getUnidadesDeVidaInicial();
                }
                if(equipoJugador1[5]!=null){
                    VidaJ5=equipoJugador1[5].getUnidadesDeVidaInicial();
                }
                
    }
    
    public void setVidaDanoDespuesCombate(){
            if(equipoIA[1]!=null){
                equipoIA[1].setUnidadesDeVidaInicial(VidaIA1);
            }
            if(equipoIA[2]!=null){
                equipoIA[3].setUnidadesDeVidaInicial(VidaIA2);
            }
            if(equipoIA[3]!=null){
                equipoIA[3].setUnidadesDeVidaInicial(VidaIA3);
            }
            if(equipoIA[4]!=null){
                equipoIA[4].setUnidadesDeVidaInicial(VidaIA4);
            }
            if(equipoIA[5]!=null){
                equipoIA[5].setUnidadesDeVidaInicial(VidaIA5);
            }
            
            
            if(equipoJugador1[1]!=null){
                equipoJugador1[1].setUnidadesDeVidaInicial(VidaJ1);
            }
            if(equipoJugador1[2]!=null){
                equipoJugador1[2].setUnidadesDeVidaInicial(VidaJ2);
            }
            if(equipoJugador1[3]!=null){
                equipoJugador1[3].setUnidadesDeVidaInicial(VidaJ3);
            }
            if(equipoJugador1[4]!=null){
                equipoJugador1[4].setUnidadesDeVidaInicial(VidaJ4);
            }
            if(equipoJugador1[5]!=null){
                equipoJugador1[5].setUnidadesDeVidaInicial(VidaJ5);
            }
            
    }
    
    
}
