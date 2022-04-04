
package Tienda;

import AnimalesTier1.Caballo;
import AnimalesTier1.CasillaVacia;
import AnimalesTier1.Castor;
import AnimalesTier1.Escarabajo;
import AnimalesTier1.Grillo;
import AnimalesTier1.Hormiga;
import AnimalesTier1.Mosquito;
import AnimalesTier1.Nutria;
import AnimalesTier1.Pescado;
import AnimalesTier2.Arana;
import AnimalesTier2.Dodo;
import AnimalesTier2.Elefante;
import AnimalesTier2.PavoReal;
import AnimalesTier2.PuercoEspin;
import AnimalesTier2.Rata;
import AnimalesTier2.Sapo;
import AnimalesTier2.Zorro;
import AnimalesTier3.Buey;
import AnimalesTier3.Buho;
import AnimalesTier3.Camello;
import AnimalesTier3.Canguro;
import AnimalesTier3.Caracol;
import AnimalesTier3.Conejo;
import AnimalesTier3.Jirafa;
import AnimalesTier3.Lobo;
import AnimalesTier3.Mapache;
import AnimalesTier3.Oveja;
import AnimalesTier3.Tortuga;
import AnimalesTier4.Ardilla;
import AnimalesTier4.Ballena;
import AnimalesTier4.Delfin;
import AnimalesTier4.Hipopotamo;
import AnimalesTier4.Llama;
import AnimalesTier4.Loro;
import AnimalesTier4.Puma;
import AnimalesTier4.Venado;
import AnimalesTier5.Chompipe;
import AnimalesTier5.Cocodrilo;
import AnimalesTier5.Escorpion;
import AnimalesTier5.Foca;
import AnimalesTier5.Jaguar;
import AnimalesTier5.Mono;
import AnimalesTier5.Rinoceronte;
import AnimalesTier5.Vaca;
import AnimalesTier6.Gato;
import AnimalesTier6.Gorila;
import AnimalesTier6.Leopardo;
import AnimalesTier6.Mamut;
import AnimalesTier6.Mosca;
import AnimalesTier6.Panda;
import AnimalesTier6.Pulpo;
import AnimalesTier6.Serpiente;
import AnimalesTier6.Tigre;
import AnimalesTier7.Camaleon;
import AnimalesTier7.Quetzal;
import com.mycompany.proyecto1wilsonchay.Jugadores.Jugadores;
import controlPartida.CamposDeJuego;
import controlPartida.MenuEntreBatallas;
import java.awt.BorderLayout;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jonwil
 */
public class Tienda {
    
    private Mascotas[] mascotasDisponibles;
    private Mascotas[] mascotasEnVenta;
    private Mascotas[] mascotasEnVentaCloneABatalla;
    private Mascotas mascotas;///nose para q es

    public Tienda() {
        mascotasDisponibles = new Mascotas[55];
        mascotasEnVenta = new Mascotas[6];    
        mascotasEnVentaCloneABatalla = new Mascotas[6];    
        todasLasMascotasDisponibles();
        mascotasEnVenta [0] = mascotasDisponibles[0];
        mascotasEnVenta [1] = mascotasDisponibles[0];
        mascotasEnVenta [2] = mascotasDisponibles[0];
        mascotasEnVenta [3] = mascotasDisponibles[0];
        mascotasEnVenta [4] = mascotasDisponibles[0];
        mascotasEnVenta [5] = mascotasDisponibles[0];
    }

    
    public Mascotas darMascota(int posicionMascotaEnVenta){
        Mascotas guardarMascota = mascotasEnVenta[posicionMascotaEnVenta];
        mascotasEnVenta[posicionMascotaEnVenta]=mascotasEnVenta[0]; //Quitando la Mascota comprada de la Tienda 
        return guardarMascota;
    }
    
    public void todasLasMascotasDisponibles(){
        mascotasDisponibles[0]= new CasillaVacia();
        mascotasDisponibles[1]= new Hormiga();//TIER1      
        mascotasDisponibles[2]= new Pescado();
        mascotasDisponibles[3]= new Mosquito();
        mascotasDisponibles[4]= new Grillo();
        mascotasDisponibles[5]= new Castor();
        mascotasDisponibles[6]= new Caballo();
        mascotasDisponibles[7]= new Nutria();
        mascotasDisponibles[8]= new Escarabajo();
        mascotasDisponibles[9]= new Sapo();//TIER2
        mascotasDisponibles[10]= new Dodo();
        mascotasDisponibles[11]= new Elefante();
        mascotasDisponibles[12]= new PuercoEspin();
        mascotasDisponibles[13]= new PavoReal();
        mascotasDisponibles[14]= new Rata();
        mascotasDisponibles[15]= new Zorro();
        mascotasDisponibles[16]= new Arana();
        mascotasDisponibles[17]= new Camello();//TIER3
        mascotasDisponibles[18]= new Mapache();
        mascotasDisponibles[19]= new Jirafa();
        mascotasDisponibles[20]= new Tortuga();
        mascotasDisponibles[21]= new Caracol();
        mascotasDisponibles[22]= new Oveja();
        mascotasDisponibles[23]= new Conejo();
        mascotasDisponibles[24]= new Lobo();
        mascotasDisponibles[25]= new Buey();
        mascotasDisponibles[26]= new Canguro();
        mascotasDisponibles[27]= new Buho();
        mascotasDisponibles[28]= new Venado();  //tier4 28-35
        mascotasDisponibles[29]= new Loro();
        mascotasDisponibles[30]= new Hipopotamo();
        mascotasDisponibles[31]= new Delfin();
        mascotasDisponibles[32]= new Puma();
        mascotasDisponibles[33]= new Ballena();
        mascotasDisponibles[34]= new Ardilla();
        mascotasDisponibles[35]= new Llama();
        mascotasDisponibles[36]= new Foca();     //tier5 36-42
        mascotasDisponibles[37]= new Jaguar();     
        mascotasDisponibles[38]= new Escorpion();     
        mascotasDisponibles[39]= new Rinoceronte();     
        mascotasDisponibles[40]= new Mono();     
        mascotasDisponibles[41]= new Cocodrilo();     
        mascotasDisponibles[42]= new Vaca();     
        mascotasDisponibles[43]= new Chompipe();        
        mascotasDisponibles[44]= new Panda();    //Tier6  44-52  
        mascotasDisponibles[45]= new Gato();      
        mascotasDisponibles[46]= new Tigre();      
        mascotasDisponibles[47]= new Serpiente();      
        mascotasDisponibles[48]= new Mamut();      
        mascotasDisponibles[49]= new Leopardo();      
        mascotasDisponibles[50]= new Gorila();      
        mascotasDisponibles[51]= new Pulpo();      
        mascotasDisponibles[52]= new Mosca();      
        mascotasDisponibles[53]= new Quetzal();   //tier7 53-54      
        mascotasDisponibles[54]= new Camaleon();         
        
    } 

    
    public Mascotas[] mascotasAVender(){
        return mascotasEnVenta;
    }    

    public Mascotas[] getMascotasDisponibles() {
        return mascotasDisponibles;
    }
    
    
    
    public void llenarLaTiendaRondas(int ronda, Jugadores jugadores) { //crea una copia por si en el equipo se usan dos mascotas iguales    
        jugadores.pagarRacargaTienda();
        if(ronda<=3){
            for (int i = 1; i < 4; i++) { //Ronda 1, 2, y 3 habrán únicamente 3 animales en tienda
                try{
                    mascotasEnVenta[i]= (Mascotas)seleccionarMascotaPorTier(ronda).clone();
                } catch (Exception e){
                }
            }
        }
        if(ronda>=4 && ronda<=6){ 
            for (int i = 1; i < 5; i++) { //Ronda 4, 5 y 6 habrán únicamente 4 animales en tienda
                try{
                    mascotasEnVenta[i]= (Mascotas)seleccionarMascotaPorTier(ronda).clone();
                } catch (Exception e){
                }
            }
        }
        if(ronda>=7){
            for (int i = 1; i < 6; i++) { //Ronda 7+ habrán 5 animales en tienda
                try{
                    mascotasEnVenta[i]= (Mascotas)seleccionarMascotaPorTier(ronda).clone();
                } catch (Exception e){
                }
            }
        }
    }
    
        //  1-8 Tier1              9-16 Tier2
    private Mascotas seleccionarMascotaPorTier(int ronda) {
        Random random = new Random();
        int mascotaAleatoriaporRonda;
        if(ronda==1){ // Tier1
            mascotaAleatoriaporRonda = random.nextInt(8)+1;
            return mascotasDisponibles[mascotaAleatoriaporRonda];
        }
        if(ronda==2 || ronda==3){// Desbloque Tier2
            mascotaAleatoriaporRonda = random.nextInt(16)+1;
            return mascotasDisponibles[mascotaAleatoriaporRonda];
        }
        if(ronda==4 || ronda==5){//Desbloque Tier3
            mascotaAleatoriaporRonda = random.nextInt(27)+1;
            return mascotasDisponibles[mascotaAleatoriaporRonda];
        }
        if(ronda==6 || ronda==7){// Desbloque Tier4
            mascotaAleatoriaporRonda = random.nextInt(27)+1;
            return mascotasDisponibles[mascotaAleatoriaporRonda];
        }
        if(ronda==8 || ronda==9){// Desbloque Tier5
            mascotaAleatoriaporRonda = random.nextInt(27)+1;
            return mascotasDisponibles[mascotaAleatoriaporRonda];
        } 
        if(ronda==10 || ronda==11){//Desbloque Tier6
            mascotaAleatoriaporRonda = random.nextInt(27)+1;
            return mascotasDisponibles[mascotaAleatoriaporRonda];
        }
        if(ronda>=12){            // DesbloqueTier7
            mascotaAleatoriaporRonda = random.nextInt(27)+1;
            return mascotasDisponibles[mascotaAleatoriaporRonda];
        }else{
            return mascotasDisponibles[0];
        }
    }
    
    public void imprimirMascotasAVender() {
        int contador=0;
        for (int i = 0; i < 200; i++){
            System.out.print("-");
        }
        System.out.println("");
        System.out.print("\t\t\t\t\t            ");
        for (int i = 1; i < 6; i++) {               //muestra de que tier es la Mascota
            System.out.print(String.format("Tier %s       ",mascotasEnVenta[i].getTier()));
            
        }
        System.out.println("");
        System.out.print("\tTIENDA>>>>  3 de Oro por c/Mascota\t");
        for (int i = 1; i < 6; i++){                //imprime las mascotas que el Jugador podra Comprar
            contador++;
                System.out.print(String.format("%d[%s]----",contador,mascotasEnVenta[i].getNombreMascota()));
        }
        
        System.out.println("");
        System.out.print("\t\t\t\t\t\t     ");
        for (int i = 1; i < 6; i++){                 //imprime el Dano/vida 
                    System.out.print(String.format("%.0f/%.0f           ",mascotasEnVenta[i].getUnidadesDeDanoInicial(),mascotasEnVenta[i].getUnidadesDeVidaInicial()));
        }
        
        System.out.println("");
        for (int i = 0; i < 200; i++){
            System.out.print("-");
        }
    }
  
    
    public void imprimirMascotasDisponibles(){      //MODOD CREATIVO
        for (Mascotas mascotasDisponible : mascotasDisponibles) {
            mascotasDisponible.imprimirDatos();
        }
    }
    
    public void seleccionarFormaOrdenar(){          //MODOD CREATIVO
        System.out.println("Estas son Todas las Mascotas Disponiobles");
        System.out.println("Seleccione la forma a Ordenar las Mascotas");
        System.out.println("1.Ordenar por Tier\t2.Ordenar por Vida\t3.Ordenar por Dano");
        Scanner scanner = new Scanner(System.in);
        int formaAOrdenar=scanner.nextInt();
        switch(formaAOrdenar){
            case 1:
                ordenarMascotasPorTier(mascotasDisponibles);
                imprimirMascotasDisponibles();
                break;
            case 2:
                ordenarMascotasPorVida(mascotasDisponibles);
                imprimirMascotasDisponibles();
                break;
            case 3:
                ordenarMascotasPorDano(mascotasDisponibles);
                imprimirMascotasDisponibles();
                break;
            default:
                System.out.println("Ingreso una opcion incorrecta");
                break;
        }
                
    }
    public void seleccionarCampo(){
        CamposDeJuego camDeJuego = new CamposDeJuego(mascotasDisponibles);
                camDeJuego.aplicarEfectosCampoJuego();
                imprimirMascotasDisponibles();
    }
    
    private void ordenarMascotasPorTier(Mascotas[] ArregloMascotas){
        System.out.println("Mascotas Ordenadas por Tier de Menor a Mayor");
        int tamno= ArregloMascotas.length;
        int ordenamientoCompletado=1;
        //BUBBLE SORT
        for (int i = 0; i < tamno && ordenamientoCompletado==1; i++) {
            ordenamientoCompletado=0; //si no entra en el if es por que no hubo ninguna
                                        //modificacion en esa vuelta
            for (int j = 0; j < (tamno-1); j++) {
                if(ArregloMascotas[j].getTier()>ArregloMascotas[j+1].getTier()){
                    ordenamientoCompletado=1;       
                    //realizando el Cambio
                    Mascotas temp=ArregloMascotas[j+1];
                    ArregloMascotas[j+1]=ArregloMascotas[j];
                    ArregloMascotas[j]=temp;
                }
            }
        }
    }
    
    private void ordenarMascotasPorVida(Mascotas[] ArregloMascotas){
        System.out.println("Mascotas Ordenadas por Vida de Menor a Mayor");
        int tamno= ArregloMascotas.length;
        int ordenamientoCompletado=1;
        //BUBBLE SORT
        for (int i = 0; i < tamno && ordenamientoCompletado==1; i++) {
            ordenamientoCompletado=0; //si no entra en el if es por que no hubo ninguna
                                        //modificacion en esa vuelta
            for (int j = 0; j < (tamno-1); j++) {
                if(ArregloMascotas[j].getUnidadesDeVidaInicial()>ArregloMascotas[j+1].getUnidadesDeVidaInicial()){
                    ordenamientoCompletado=1;       
                    //realizando el Cambio
                    Mascotas temp=ArregloMascotas[j+1];
                    ArregloMascotas[j+1]=ArregloMascotas[j];
                    ArregloMascotas[j]=temp;
                }
            }
        }
    }
    private void ordenarMascotasPorDano(Mascotas[] ArregloMascotas){
        System.out.println("Mascotas Ordenadas por Dano de Menor a Mayor");
        int tamno= ArregloMascotas.length;
        int ordenamientoCompletado=1;
        //BUBBLE SORT
        for (int i = 0; i < tamno && ordenamientoCompletado==1; i++) {
            ordenamientoCompletado=0; //si no entra en el if es por que no hubo ninguna
                                        //modificacion en esa vuelta
            for (int j = 0; j < (tamno-1); j++) {
                if(ArregloMascotas[j].getUnidadesDeDanoInicial()>ArregloMascotas[j+1].getUnidadesDeDanoInicial()){
                    ordenamientoCompletado=1;       
                    //realizando el Cambio
                    Mascotas temp=ArregloMascotas[j+1];
                    ArregloMascotas[j+1]=ArregloMascotas[j];
                    ArregloMascotas[j]=temp;
                }
            }
        }
    }
    
    
}
