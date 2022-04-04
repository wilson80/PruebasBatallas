
package controlPartida;

import Tienda.Tienda;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugador1;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugador2IA;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugadores;
import java.util.Scanner;

/**
 *
 * @author Jonwil
 */
public class MenuEntreBatallas {
    private Tienda tienda;
//    private int ronda;      //////////////;
//    private int experiencia;
//    private int nivel;
    private int contador=0;
    private int compras=0;
    private int accion=0;
    
    private ControlPartida control;
//    private Jugadores jugadores;
          

    public MenuEntreBatallas() {
        tienda = new Tienda();
    }
    
    public void menuEntreBatallas(Jugadores jugadores, int ronda){
        while(accion!=4){
            if(compras==0){
            tienda.llenarLaTiendaRondas(ronda, jugadores);  // Llena la Tienda
            }
                mostrarEquipo_TiendaInstrucciones(jugadores, ronda);       //Muestra el equipo y la tienda
            compras++;
            accion=jugadores.seleccioneAccion();
            switch(accion){
                case 1://1.Comprar en la Tienda 
                    comprar_enLaTienda(jugadores);
                    break;
                case 2://2.Seleccionar una Mascota de tu Equipo 
                    seleccionarMascotaEquipo(jugadores);
                    break;
                case 3://3.Recargar la Tienda
                    tienda.llenarLaTiendaRondas(ronda, jugadores); 
                    break;
                case 4://4.Ir a Batalla!!!
                    for (int i = 0; i < 40; i++){
                        System.out.println(""); 
                    }
                    jugadores.setOroInicial(0);
                    //mandando el Clone a Batalla
                    System.out.println("Saliendo De MenuEntreBatallas");
                    break;
            }
        }
        
    }
    
    private void comprar_enLaTienda(Jugadores jugadores){
        instruccionesDentroMenu(jugadores, 1);
        int posicionTienda= jugadores.seleccioneAccion();
        if(posicionTienda>0 && posicionTienda<=5){
                int posicionInstruccion=1;
               instruccionesDentroMenu(jugadores, 2);
        }else{
              instruccionesDentroMenu(jugadores, 3);
        }
        int posicionAInsertar= jugadores.seleccioneAccion();
        jugadores.comprarMascotasAlimentos(posicionAInsertar, tienda.darMascota(posicionTienda));
    }
    
    private void seleccionarMascotaEquipo(Jugadores jugadores){
        instruccionesDentroMenu(jugadores, 4);
        int mascotaSeleccionada= jugadores.seleccioneAccion();
        instruccionesDentroMenu(jugadores, 5);
        int accion=jugadores.seleccioneAccion();
        if(accion==1){
            instruccionesDentroMenu(jugadores, 6);
            int posicion_A_Cambiar=jugadores.seleccioneAccion();
            jugadores.cambiarPosicionMascota(mascotaSeleccionada, posicion_A_Cambiar);
        }
        if(accion==2){
            jugadores.venderMascotas(mascotaSeleccionada);
        }
        
        
    }
      
    private void instruccionesDentroMenu(Jugadores jugadores, int accionMenu){
//        if(jugadores instanceof Jugador1){
            switch(accionMenu){
                case 1:
                    System.out.println("Ingresa la posicion de la Mascota o Alimento a Comprar");                    
                    break;
                case 2:
                    System.out.println("Ingrese La posicion a Insertar la Mascota");
                    break;
                case 3:
                    System.out.println("Seleccione la Mascota a dar el alimento");
                    break;
                case 4:
                    System.out.println("ingresa la posicion de una de tus Mascotas");
                    break;
                case 5:
                    System.out.println("1.Cambiar de Posicion \t 2.Vender Mascota");
                    break;
                case 6:
                    System.out.println("Ingrese la poscicion ha hacer el cambio");
                    break;
                case 7:
                    break;
            }
            
//        }
                  
        
    }
    
    
    private void mostrarEquipo_TiendaInstrucciones(Jugadores jugadores, int ronda) { 
//        if(jugadores instanceof Jugador1)  {             //IA_noInterfaz
            for (int i = 0; i < 28; i++){
                System.out.println("");                //limpiar Pantalla
            }
            System.out.println("------------------------------------------------------------------------MENU ENTRE BATALLAS------------------------------------------------------------------------------------------");
            imprimirDatosPartida(jugadores, ronda);
            jugadores.imprimirEquipo();         
            tienda.imprimirMascotasAVender();
            opcionesMenu(jugadores);
//        }else{
//            System.out.println("IA");
            
//        }        
        
    }
    private void imprimirDatosPartida(Jugadores jugadores, int ronda){         //Para el Modo Creativo
            adornos();
            
            System.out.print(String.format("| Oro %d | Vidas/derrotas %d /%d | Victorias %d/10 | Ronda %d |",jugadores.getOroInicial()
                                                                                                            ,jugadores.getVidas()
                                                                                                            ,jugadores.getDerrotas()
                                                                                                            ,jugadores.getVictorias()
                                                                                                            ,ronda));
            
            System.out.println("");
            adornos();
    }
    private void opcionesMenu(Jugadores jugadores) {
//        if(jugadores instanceof Jugador1){
            System.out.println("");
            System.out.print("\t1.Comprar en la Tienda \t   2.Seleccionar una Mascota de tu Equipo\t");
            System.out.print("     3.Recargar la Tienda\t   4.Ir a Batalla!!!\n");
            System.out.println("seleccione una accion");
//        }
        
    }
    private void adornos(){
        for (int i = 0; i < 200; i++){ //           adornos
            System.out.print("_");
            }
        System.out.println("");
    }
    
    



    
}
