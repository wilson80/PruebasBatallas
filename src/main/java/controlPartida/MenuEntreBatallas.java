
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
    private Tienda tiendaIA;
    private int contador=0;
    private int compras=0;
    private int accion=0;
    
    private ControlPartida control;
//    private Jugadores jugadores;
          

    public MenuEntreBatallas() {
       tienda = new Tienda();
    }
        
        
    public void menuEntreBatallas(Jugadores jugadores, int ronda) {
         
        if(ronda==1){
            instruccionesDentroMenu(jugadores, 7);
            int seleccioneCampo=jugadores.seleccioneAccion();
            tienda.seleccionarCampo(seleccioneCampo);
        }
        
        while(accion!=4){
            if(compras==0){
            tienda.llenarLaTiendaRondas(ronda, jugadores);  // Llena la Tienda
            }
                mostrarEquipo_TiendaInstrucciones(jugadores, ronda);       //Muestra el equipo y la tienda
            compras++;
            accion=jugadores.seleccioneAccion();
            switch(accion){
                case 1://1.Comprar en la Tienda 
//                    tienda = new Tienda();
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
    
    private void comprar_enLaTienda(Jugadores jugadores) {
        instruccionesDentroMenu(jugadores, 1);
        int posicionTienda= jugadores.seleccioneAccion();
        if(posicionTienda>0 && posicionTienda<=5){
               instruccionesDentroMenu(jugadores, 2);
        }else{
              instruccionesDentroMenu(jugadores, 3);
        }
        int posicionAInsertar= jugadores.seleccioneAccion();
        jugadores.comprarMascotasAlimentos(posicionAInsertar, tienda.darMascota(posicionTienda));
    }
    
    private void seleccionarMascotaEquipo(Jugadores jugadores) {
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
      
    private void instruccionesDentroMenu(Jugadores jugadores, int accionMenu) {
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
                    mostrarCamposDeJuego();
                    break;
            }
 
        
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
    
    
    private void mostrarCamposDeJuego(){
        System.out.println("Debido a que existen diferentes tipos de mascotas, al iniciar una batalla puede seleccionarse un\n" +
        "tipo de campo el cual dará una bonificación a todos los animales de un tipo específico, los campos por\n" +
        "defecto son:\n" +
        " 1. Pantano: \n            Los animales tipo reptil ganarán (+1/+1) por cada animal reptil en batalla\n" +
        " 2. Nubes: \n            Los animales tipo volador ganarán (+1/+1) por cada animal volador en batalla\n" +
        " 3. Mar: \n            Los animales de tipo acuático ganarán (+1/+1) por cada animal acuático en batalla\n" +
        " 4. Bosque: \n            Los animales tipo terrestre/mamífero tendrán un buff de (+2/0) por cada tipo terrestre\n" +
        "            (aplica solo a terrestres) y (0/+2) por cada tipo mamífero (aplica solo a mamíferos), los animales\n" +
        "            tipo solitario serán nerfeados tal que su daño al atacar será reducido en un 20%.\n" +
        " 5. Granja: \n            buff a doméstico/mamífero -> nerfeo a solitario\n" +
        " 6. <Sin campo> : \n            Los solitarios ganan una bonificación de (+3/+3) si solo hay uno en el equipo.\n" +
        " 7. Sabana: \n            Los Desérticos ganan (0/+1) extra por cada alimento que se les de.");
    }


    
}
