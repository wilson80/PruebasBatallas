
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
        seleccionModo();
    }
    
   
    
    public static void seleccionModo(){
        ControlPartida con = new ControlPartida();
//        con.ModoArena(); 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a Super Auto Pets");
        System.out.println("1.Modo Arena\n2.Modo Versus\n3.Modo Creativo");
        System.out.println("Para Salir Escriba 4");
        
        int seleccion = scanner.nextInt();
        
        switch(seleccion){
            case 1:
                con.ModoArena();                
                break;
            case 2:
                con.modoVersus();
                seleccionModo();
                break;
            case 3:
                con.modoCreativo();
                seleccionModo();
                break;
            case 4:
                System.out.println("Saliendo........."); 
                break;
        }
            
    }


    
}
