
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
    private Mascotas guardarmascotasJ1;
    private Mascotas guardarmascotasJ2;
    private Mascotas guardarmascotasJ3;
    private Mascotas guardarmascotasJ4;
    private Mascotas guardarmascotasJ5;
    
    private Mascotas guardarmascotasIA1;
    private Mascotas guardarmascotasIA2;
    private Mascotas guardarmascotasIA3;
    private Mascotas guardarmascotasIA4;
    private Mascotas guardarmascotasIA5;
    
    private int ronda;
    private MenuEntreBatallas entreBatallas;
    
    private  double[] guardarVidaJugador= new double[6];
    private double[] guardarVidaIA=new double[6];
   

    public Batalla(Jugadores jugador1, Jugadores jugadorIA, int ronda) {
        this.jugador1 = jugador1;
        this.jugadorIA = jugadorIA;
        this.ronda = ronda;
        equipoIA = jugadorIA.getEquipoMascotas();
        equipoJugador1 = jugador1.getEquipoMascotas();
    }
    

    
        
    public void BatallaRonda(){
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
        setVida();
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

    private void guardarVida() {
         for (int i = 1; i < 6; i++){
             if(equipoJugador1[i]!=null){
                 guardarVidaJugador[i]=equipoJugador1[i].getUnidadesDeVidaInicial();
             }
            
        }
         for (int i = 1; i < 6; i++){
             if(equipoIA[i]!=null){
                 guardarVidaIA[i]=equipoIA[i].getUnidadesDeVidaInicial();
             }
            
        }
         guardarmascotasJ1=equipoJugador1[1];
         guardarmascotasJ2=equipoJugador1[2];
         guardarmascotasJ3=equipoJugador1[3];
         guardarmascotasJ4=equipoJugador1[4];
         guardarmascotasJ5=equipoJugador1[5];

         guardarmascotasIA1=equipoIA[1];
         guardarmascotasIA2=equipoIA[2];
         guardarmascotasIA3=equipoIA[3];
         guardarmascotasIA4=equipoIA[4];
         guardarmascotasIA5=equipoIA[5];
        
    }
    private void setVida(){
        
         equipoJugador1[1]= guardarmascotasJ1;
         equipoJugador1[2]=guardarmascotasJ2;
         equipoJugador1[3]=guardarmascotasJ3;
         equipoJugador1[4]=guardarmascotasJ4;
         equipoJugador1[5]=guardarmascotasJ5;

         equipoIA[1]=guardarmascotasIA1;
         equipoIA[2]=guardarmascotasIA2;
         equipoIA[3]=guardarmascotasIA3;
         equipoIA[4]=guardarmascotasIA4;
         equipoIA[5]=guardarmascotasIA5;
         for (int i = 1; i < 6; i++){
            if(equipoJugador1[i]!=null){
                equipoJugador1[i].setUnidadesDeVidaInicial(guardarVidaJugador[i]);
            }
            
        }
         for (int i = 1; i < 6; i++){
             if(equipoIA[i]!=null){
                 equipoIA[i].setUnidadesDeVidaInicial(guardarVidaIA[i]);
             }
            
        }
         
    }
    
    

    
    
    
    
    
}
