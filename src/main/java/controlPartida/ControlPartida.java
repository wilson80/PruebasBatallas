

package controlPartida;

import Tienda.Mascotas;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugador1;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugador2IA;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugadores;

/**
 *
 * @author Jonwil
 */
public class ControlPartida {
    private  Jugadores jugador1;
    private  Jugadores jugadorIA;
//    private int rondas=1;
    MenuEntreBatallas EntreBatallasIA;
    MenuEntreBatallas EntreBatallasJugador1;
//    private Mascotas[] equipo;
    private Batalla mandarJugadores;
    
    public ControlPartida() {
        jugador1 = new Jugador1();
        jugadorIA = new Jugador2IA();
        EntreBatallasIA = new MenuEntreBatallas();
        EntreBatallasJugador1 = new MenuEntreBatallas();
//        equipo = new Mascotas[5];
        

    }
    
    
    public void ModoArena(){
        jugadorIA.setOroInicial(11);  
        jugador1.setOroInicial(11);
        EntreBatallasJugador1.menuEntreBatallas(jugadorIA);
        EntreBatallasIA.menuEntreBatallas(jugador1);
        mandarJugadores = new Batalla(jugador1,jugadorIA);
            mandarJugadores.BatallaRonda();
            
        
        

        
    }

    
//    public Jugadores getJugador1() {
//        return jugador1;
//    }
    
    
    
    
    
    
    
    
    
}
