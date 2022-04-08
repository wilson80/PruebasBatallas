
package com.mycompany.proyecto1wilsonchay.Jugadores;

import AnimalesTier1.CasillaVacia;
import Tienda.Mascotas;
import Tienda.Tienda;
import java.util.Scanner;

/**
 *
 * @author Jonwil
 */

public class Jugadores {
    
    private  Mascotas[] equipoMascotas; 
    
    private int victorias=0;
    private int Vidas=10;
    private int derrotas=0;
    private int oroInicial=0;
    private int mascotasVivas;/////
    private boolean ganoPerdio;/////
    
    private boolean realizarFusion=false;//////

    public Jugadores() {
        equipoMascotas = new Mascotas[6];
        equipoMascotas[0]= null;
        equipoMascotas[1]= null;
        equipoMascotas[2]= null;
        equipoMascotas[3]= null;
        equipoMascotas[4]= null;
        equipoMascotas[5]= null;
    }
    
    
    
    public void comprarMascotasAlimentos(int posicionIntsertar, Mascotas mascotaInsertar){
        oroInicial-=3;
      String nombre="wil"; //solo para inicializar las variables
      String nombre1="son"; 
        if(equipoMascotas[posicionIntsertar]!=null){        
            nombre=equipoMascotas[posicionIntsertar].getNombreMascota();
            nombre1=mascotaInsertar.getNombreMascota();
        }    
        if(nombre.equals(nombre1)){
            System.out.println("MascotaFusionada");
            equipoMascotas[posicionIntsertar].aumentarExperiencia(1); ////////////Fusionando Termianr////////////////////
            equipoMascotas[posicionIntsertar].ganarDano(1);
            equipoMascotas[posicionIntsertar].ganarVida(1);
            realizarFusion =true;
            
        }else{
            equipoMascotas[posicionIntsertar]= mascotaInsertar;
            equipoMascotas[posicionIntsertar].setPosicion(posicionIntsertar);//posicion de las Mascotas
        }
    }
    
                                                                          //(para las mascotas que dan algo al venderse)
    public void venderMascotas(int posicionaMascotaVender){
        int nivelMascotaVendida = equipoMascotas[posicionaMascotaVender].getNivel();
        if(nivelMascotaVendida==1){
            oroInicial+=1;
        }
        if(nivelMascotaVendida==2){
            oroInicial+=2;
        }
        if(nivelMascotaVendida==3){
            oroInicial+=3;
        }
               equipoMascotas[posicionaMascotaVender]= null;  ////////////
    }


    public void pagarRacargaTienda(){
        oroInicial-=1;
    }
    
    public void cambiarPosicionMascota(int mascotaSeleccionada, int mascota_a_Cambiar){
//        if(equipoMascotas!=null){
            equipoMascotas[mascotaSeleccionada].setPosicion(mascota_a_Cambiar);
            equipoMascotas[mascota_a_Cambiar].setPosicion(mascotaSeleccionada);   //cambiando la posicicion en el atributo de la mascota
//        }
        Mascotas cambiarPosicion = equipoMascotas[mascotaSeleccionada]; //camiando la posicion arreglo del equipo
        Mascotas cambiarpor = equipoMascotas[mascota_a_Cambiar];
        equipoMascotas[mascotaSeleccionada]=cambiarpor;
        equipoMascotas[mascota_a_Cambiar]=cambiarPosicion;
        
        
    }
    
    public int seleccioneAccion(){
        Scanner scanner = new Scanner(System.in);
        int accion_aRealizar = scanner.nextInt();
        return accion_aRealizar;
    }

    public Mascotas[] getEquipoMascotas() {
        return equipoMascotas;
    }
       

//    public Object[] cloneBatalla() throws CloneNotSupportedException{
//        equipoMascotasBatalla = equipoMascotas.clone();
//        return equipoMascotasBatalla;
//    }
    
//    public Object cloneBatalla() throws CloneNotSupportedException{
//        equipoMascotasBatalla = equipoMascotas.clone();
//        return equipoMascotas;
//    }
    
    

    public boolean ganarPartida() {
        return victorias>=10;
    }
//

    public void setGanoPerdio(boolean ganoPerdio, int ronda ) {
        this.ganoPerdio = ganoPerdio;
        if(ganoPerdio){
            if(ronda>=1 && ronda<=3){
                victorias++;
            }else if(ronda>=4 && ronda <=6){
                victorias+=2;
            }else if(ronda==7){
                victorias+=3;
            }
            
        }else{
            if(ronda>=1 && ronda<=3){
               derrotas++; 
            }
//            else if(ronda>=4 && ronda <=6){
//                derrotas-=2;
//            }else if(ronda==7){
//                derrotas-=3;
//            }
            
            if(ronda>=1 && ronda<=3){
               Vidas--; 
            }else if(ronda>=4 && ronda <=6){
                Vidas-=2;
            }else if(ronda==7){
                Vidas-=3;
            }
            
            
        }
    }

    public boolean getGanoPerdio() {
        return ganoPerdio;
    }
     
//    
    public void setOroInicial(int oroInicial) {
        this.oroInicial = oroInicial;
    }

    public int getOroInicial() {
        return oroInicial;
    }
    
//
    public int getVictorias() {
        return victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
   
    
//
    public int getVidas() {
        return Vidas;
    }
//    
    
        private void imprimirNivelExp(){
            for (int i = 1; i < 6; i++){
                    if(equipoMascotas[i]!=null){
                        int nivel=equipoMascotas[i].getNivel();
                        int experiencia=equipoMascotas[i].getExperiencia();

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
                        System.out.print(String.format("Lvl %d %s             ", nivel, mostrarExperiencia));
                    }else{
                        System.out.print("                  ");     
                    }
            }
                
        }
    
    
    public void imprimirEquipo(){
        adornos();
        System.out.println("");
        System.out.print("\t\t\t\t\t   ");
        
        imprimirNivelExp();
        
        System.out.println("");
        System.out.print("       TU EQUIPO>>>                    ");
                for (int j = 1; j < 6; j++){
                                                                                //imprime el equipo
                    if(equipoMascotas[j]!=null){    
                        System.out.print(String.format("  %d[%s %d]*******",j,equipoMascotas[j].getNombreMascota(), equipoMascotas[j].getPosicion()));
                    }else{
                        System.out.printf(" %d[        ]*******",j);
                    }
                }
                                                
                System.out.println("");
                
                System.out.print("                                           ");
                for (int j = 1; j < 6; j++){                                        //imprime dano/vida
                    if(equipoMascotas[j]!=null){    
                    System.out.print(String.format("%.2f/%.2f            ",equipoMascotas[j].getUnidadesDeDanoInicial(), equipoMascotas[j].getUnidadesDeVidaInicial()));
                    }else{
                        System.out.print("                     ");
                    }
                }                               
                
                System.out.println("");
                
                for (int i = 1; i < 6; i++){
                    if(equipoMascotas[i]!=null){
                                                                                   // Muestra si se fusiona y si sube de Nivel
                        if(equipoMascotas[i].getAumentarExperiencia()){         
                            System.out.print("\t\t\t\t\t");
                            equipoMascotas[i].setAumentarExperiencia(false);
                            System.out.println(String.format("%s---se ha Fusionado!!!", equipoMascotas[i].getNombreMascota()));
                        }            
                        if(equipoMascotas[i].getSubirNivel()){
                            System.out.print("\t\t\t\t\t\t\t\t");
                            equipoMascotas[i].setSubirNivel(false);
                            System.out.println(String.format("%s---ha aumentado de Nivel!!!",equipoMascotas[i].getNombreMascota()));
                        }
                    }    
                }
        adornos();
        System.out.println("");        
    }
    
        private void adornos(){
        for (int i = 0; i < 400; i++){          //adornos
            System.out.print(".");
            if(i==200){
                System.out.println("");
            }
        }
    }
    
    
    
    
    
    
}
