/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlPartida;

import Tienda.Mascotas;
import java.util.Scanner;

/**
 *
 * @author Jonwil
 */
public class CamposDeJuego {
    
    private Mascotas[] mascotasCampo;
    private int campoSeleccionado;
    
    public CamposDeJuego(Mascotas[] mascotasCampo, int campoSeleccionado) {
        this.mascotasCampo = mascotasCampo;
        this.campoSeleccionado=campoSeleccionado;
    }
    
    public void aplicarEfectosCampoJuego(){
//        System.out.println("Elija nextInt();
        switch(campoSeleccionado){
            case 1:                
                pantano();
                break;
            case 2:               
                nubes();
                break;
            case 3:               
                mar();
                break;
            case 4:                
                bosque();
                break;
            case 5:               
                granja();
                break;
            case 6:                
                sinCampo();
                break;
            case 7:               
                sabana();
                break;
        }
    }
    
    public void pantano(){
        System.out.println("Ha seleccionado el mapa del Pantano");
        System.out.println("Los Animales tipo reptil han Aumentado(+1/+1)");
        for (Mascotas mascotas : mascotasCampo) {
            String [] TiposDeLaMascotas=mascotas.getTipos();
            for (String tip : TiposDeLaMascotas) {
                if(tip.equals("reptil")){
                    mascotas.ganarDano(1);
                    mascotas.ganarVida(1);
                }
            }
        }
    }
    
    public void nubes(){
         System.out.println("Ha seleccionado el mapa de Las Nubes");
         System.out.println("Los Animales tipo Volador han Aumentado(+1/+1)");
        for (Mascotas mascotas : mascotasCampo) {
            String [] TiposDeLaMascotas=mascotas.getTipos();
            for (String tip : TiposDeLaMascotas) {
                if(tip.equals("volador")){
                    mascotas.ganarDano(1);
                    mascotas.ganarVida(1);
                }
            }
        }
    }
    
    public void mar(){
        System.out.println("Ha seleccionado el mapa del Mar");
        System.out.println("Los Animales tipo acuativo han Aumentado(+1/+1)");
        for (Mascotas mascotas : mascotasCampo) {
            String [] TiposDeLaMascotas=mascotas.getTipos();
            for (String tip : TiposDeLaMascotas) {
                if(tip.equals("acuatico")){
                    mascotas.ganarDano(1);
                    mascotas.ganarVida(1);
                }
            }
        }
    }
    
    public void bosque(){
        System.out.println("Ha seleccionado el del Bosque");
                System.out.println("Los animales tipo terrestre/mamífero tendrán un buff de (+2/0) por cada tipo terrestre\n" +
"            (aplica solo a terrestres) y (0/+2) por cada tipo mamífero (aplica solo a mamíferos), los animales\n" +
"            tipo solitario serán nerfeados tal que su daño al atacar será reducido en un 20%");
        for (Mascotas mascotas : mascotasCampo) {
            String [] TiposDeLaMascotas=mascotas.getTipos();
            for (String tip : TiposDeLaMascotas) {
                if(tip.equals("terrestre")){
                    mascotas.ganarDano(2);
                }
                if(tip.equals("mamifero")){
                    mascotas.ganarVida(2);
                }
                if(tip.equals("solitario")){
                    double reducir=mascotas.getUnidadesDeDanoInicial()*0.2;
                    double danoreducido = mascotas.getUnidadesDeDanoInicial()-reducir;
                    mascotas.setUnidadesDeDanoInicial(danoreducido);//solitario serán nerfeados tal que su daño al atacar será reducido en un 20%.
                }
            }
        }
    }
    
    public void granja(){
         System.out.println("Ha seleccionado el mapa de la Granja");
         System.out.println("buff a doméstico/mamífero -> nerfeo a solitario");
        for (Mascotas mascotas : mascotasCampo) {
            String [] TiposDeLaMascotas=mascotas.getTipos();
            for (String tip : TiposDeLaMascotas) {
                if(tip.equals("domestico")){
                    mascotas.ganarDano(1);
                    mascotas.ganarVida(1);
                }
                if(tip.equals("mamifero")){
                    mascotas.ganarDano(1);
                    mascotas.ganarVida(1);
                }
                if(tip.equals("solitario")){
                    mascotas.ganarDano(-1);
                    mascotas.ganarVida(-1);
                }
            }
        }
    }
    public void sinCampo(){ //PENDIENTE
        int cantidadSolitarios=0;
        System.out.println("No ha seleccionado ningun campo");
        System.out.println("Los solitarios ganan una bonificación de (+3/+3) si solo hay uno en el equipo.");
        for (Mascotas mascotas : mascotasCampo) {
            String [] TiposDeLaMascotas=mascotas.getTipos();
            for (String tip : TiposDeLaMascotas) {
                if(tip.equals("solitario")){
                    cantidadSolitarios++;
                }
               mascotas.ganarDano(1);
                    mascotas.ganarVida(1);
            }
        }
    }
    public void sabana(){   //PENDIENTE
         System.out.println("Ha seleccionado el mapa dela Sabana");
         System.out.println("Los Desérticos ganan (0/+1) extra por cada alimento que se les de.");
        for (Mascotas mascotas : mascotasCampo) {
            String [] TiposDeLaMascotas=mascotas.getTipos();
            for (String tip : TiposDeLaMascotas) {
                if(tip.equals("desertico")){
                    mascotas.ganarVida(1);
                }
                
            }
        }
    }
    
    
    
    
    
    
    
}
