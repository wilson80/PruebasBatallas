
package ModoDeJuego;

import controlPartida.ControlPartida;
import java.util.Scanner;



/**
 *
 * @author Jonwil
 */
public class InicioJuego {
//clone    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlPartida con = new ControlPartida();
        System.out.println("Entrando al Modo Arena ");
        System.out.println("Presione enter para Continuar.............. ");
        scanner.nextLine();
        con.ModoArena();
        
                
                
    }
    
   
    
    
        


        
    
}
