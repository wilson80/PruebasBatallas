

package controlPartida;

import Tienda.Mascotas;
import Tienda.Tienda;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugador1;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugador2IA;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugadores;
import java.util.Scanner;

/**
 *
 * @author Jonwil
 */
public class ControlPartida {
    private  Jugadores jugador1;
    private  Jugadores jugadorIA;
    private int ronda=0;
    MenuEntreBatallas entreBatallasIA;
    MenuEntreBatallas entreBatallasJugador1;
//    private Mascotas[] equipoJugador1 = new Mascotas[6];
//    private Mascotas[] equipoIA=new Mascotas[6];
    private Batalla mandarJugadores;
    
//    private double[] guardarVidaJugador= new double[6];
//    private double[] guardarVidaIA= new double[6];
    
    public ControlPartida() {
        jugador1 = new Jugador1();
        jugadorIA = new Jugador2IA();
//        ronda=entreBatallasIA.getRonda();
    }
    
    

    
    public void ModoArena(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modo Arena");
        System.out.println("Presione Enter para Continuar");
        scanner.nextLine();
        Tienda tienda = new Tienda();
//        tienda.imprimirMascotasDisponibles();
//        tienda.seleccionarFormaOrdenar();
        tienda.seleccionarCampo();
        do{
//            guardarVida();
             entreBatallasIA = new MenuEntreBatallas();
             entreBatallasJugador1 = new MenuEntreBatallas();
            ronda++;
            jugadorIA.setOroInicial(11);  
            jugador1.setOroInicial(11);
            
            entreBatallasJugador1.menuEntreBatallas(jugadorIA,ronda);
            entreBatallasIA.menuEntreBatallas(jugador1,ronda);
            mandarJugadores = new Batalla(jugador1,jugadorIA, ronda);
            mandarJugadores.BatallaRonda();
            
//            setVidaDanoDespuesCombate();
            
      }while(jugador1.getVidas()>=1);           ///maneja Las Rondas      
        
    }
    
    public void modoCreativo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modo Creativo");
        Tienda tienda = new Tienda();
        tienda.imprimirMascotasDisponibles();
        tienda.seleccionarFormaOrdenar();
        tienda.seleccionarCampo();
    }
    
    
    public void modoVersus(){
        System.out.println("Modo Versus");
        do{
//            guardarVida();
             entreBatallasIA = new MenuEntreBatallas();
             entreBatallasJugador1 = new MenuEntreBatallas();
            ronda=7;
            jugadorIA.setOroInicial(11);  
            jugador1.setOroInicial(11);
            
            entreBatallasJugador1.menuEntreBatallas(jugadorIA,ronda);
            entreBatallasIA.menuEntreBatallas(jugador1,ronda);
            mandarJugadores = new Batalla(jugador1,jugadorIA, ronda);
            mandarJugadores.BatallaRonda();
            
//            setVidaDanoDespuesCombate();
            
      }while(jugador1.getVidas()>=1);
        
        
    }

    

    
    
    
    
    
    
    
    
    
}
//    public void guardarVida(){
//        equipoJugador1 = jugador1.getEquipoMascotas();
//        equipoIA = jugadorIA.getEquipoMascotas();
//        for (int i = 1; i < 6; i++){
//            if(equipoJugador1[i]!=null){
//                guardarVidaJugador[i]=equipoJugador1[i].getUnidadesDeVidaInicial();
//            }
//        }
//        
//        for (int i = 6; i < 6; i++){
//            if(equipoIA[i]!=null){
//                guardarVidaIA[i]=equipoIA[i].getUnidadesDeVidaInicial();
//            }
//        }
//    }
    
//    public void setVidaDanoDespuesCombate(){
//        for (int i = 1; i < 6; i++){
//            if(equipoJugador1[i]!=null){
//                equipoJugador1[i].setUnidadesDeVidaInicial(guardarVidaJugador[i]);
//            }
//        }
//        for (int i = 1; i < 6; i++){
//            if(equipoIA[i]!=null){
//                equipoIA[i].setUnidadesDeVidaInicial(guardarVidaIA[i]);
//            }
//        }
//    }
    