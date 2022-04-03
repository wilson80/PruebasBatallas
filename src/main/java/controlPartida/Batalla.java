
package controlPartida;

import Tienda.Mascotas;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugadores;

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
    
    public void iniciandoBatalla(){
        System.out.println("primera Prueba");
        
    }


    
    public void realizarAtaques(){
        
    }   
    
    
    public void ubicarJugadores(){
        
        
    }
        
        
        
    public void imprimirMascotas(){
        
    } 
    
    
    
    
    
}
