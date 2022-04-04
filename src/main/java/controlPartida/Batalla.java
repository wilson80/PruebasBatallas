
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
    private Mascotas[] equipoJugador1 =new Mascotas[6];

    public Batalla(Jugadores jugador1, Jugadores jugadorIA) {
        this.jugador1 = jugador1;
        this.jugadorIA = jugadorIA;
        equipoIA = jugadorIA.getEquipoMascotas();
        equipoJugador1 = jugador1.getEquipoMascotas();
    }
    
    public void BatallaRonda(){
        
      enterContinuar();
        imprimirEquipoMascotas();//imprimeEquipos
      enterContinuar();
        ubicarJugadoresPosicionAtaque(equipoJugador1);
        ubicarJugadoresPosicionAtaque(equipoIA);
        imprimirEquipoMascotas();//imprimeEquipos
        System.out.println("Primer Ataque");
        realizarAtaques();
        if(jugador1.getGanoPerdio()){
            System.out.println("Has Ganado!!!");
        }else{
            System.out.println("Has Perdido");
        }
        
        System.out.println("Fin de la Ronda");
        
        
        
        
        
    }


    public void realizarAtaques(){  //Todos los Ataque en una Ronda
//        boolean noHayBajas=
        boolean mascotaPataAtacarJugador1=true;
        boolean mascotaPataAtacarIA=true;

        while(equipoJugador1[5].estaVivo() && equipoIA[5].estaVivo()){    
            double ataqueJ=equipoJugador1[5].atacar();
            equipoIA[5].recibirDano(ataqueJ);
            double ataquiIA=equipoIA[5].atacar();
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
            
                if(equipoJugador1[5]==null){
                    mascotaPataAtacarJugador1=false;
                    jugador1.setGanoPerdio(false);
                    break;
                }
            
                if(equipoIA[5]==null){
                    mascotaPataAtacarIA=false;
                    jugador1.setGanoPerdio(true);
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
    
    
   
    
    
    public boolean casiaVacia(){
        
        return false;
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

    
    
    
    
}
