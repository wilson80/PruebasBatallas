/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import AnimalesTier1.Caballo;
import java.util.Arrays;

/**
 *
 * @author Jonwil
 */
public class Mascotas implements Cloneable{
    
    private String NombreMascota;
    private double unidadesDeDanoInicial;
    private double unidadesDeVidaInicial;
    private String descripcionHabilidad;    
    private int experiencia=1;
    private int nivel=1;
    private boolean aumentarExperiencia=false;
    private boolean subirNivel=false;
    private String[] tipos;
///    String tiposAni;
    private int posicion;
    private int tier;
    

    public Mascotas() {
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
   

 
    public void imprimirDatos(){
        System.out.println(String.format("-Tier: %s----%s \tAtaque:%.2f   Vida:%.2f\tNombre Habilidad: %s\n\t\t\t\t\t\t\tTipos: %s"
                                         ,getTier()                                         
                                         ,getNombreMascota()
                                         ,getUnidadesDeDanoInicial()
                                         ,getUnidadesDeVidaInicial()
                                         ,getDescripcionHabilidad()
                                         ,Arrays.toString(getTipos())
                                         ));
    }

    
    
    public void recibirDano(double danoRecibido){
        unidadesDeVidaInicial-=danoRecibido;
    } 
    public double atacar(){
        return unidadesDeDanoInicial;
    }
    public void efectoActivo(){}
    public void ejecutarhabilidad(){}
    
    public boolean estaVivo(){
        return unidadesDeVidaInicial>0;
    }
    public boolean haMuerto(){
        return unidadesDeVidaInicial<=0;
    }
    
    public void ganarDano(int ganarDano){
        unidadesDeDanoInicial+=ganarDano;
    }
    public void ganarVida(int recibirComida){
        unidadesDeVidaInicial+=recibirComida;
    }
    
//    
    public void aumentarExperiencia(int cantidadAumentar){
        aumentarExperiencia=true;
        experiencia+=cantidadAumentar;
        
        if(experiencia==3){
            nivel=2;
            subirNivel=true;
        }
        if(experiencia==6){
            nivel=3;
            subirNivel=true;
        }
    } 

    public void setAumentarExperiencia(boolean aumentarExperiencia) {
        this.aumentarExperiencia = aumentarExperiencia;
    }

    public boolean getAumentarExperiencia() {
        return aumentarExperiencia;
    }

    
    
    public void setSubirNivel(boolean subirNivel) {
        this.subirNivel = subirNivel;
    }

    public boolean getSubirNivel() {
        return subirNivel;
    }
    
    
    public  int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
//    
    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }
    

  //  
    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos=tipos.split(",");
    }
//
       public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
//
    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
 //   
    public void setUnidadesDeDanoInicial(double unidadesDeDanoInicial) {
        this.unidadesDeDanoInicial = unidadesDeDanoInicial;
    }
    public double getUnidadesDeDanoInicial() {
        return unidadesDeDanoInicial;
    }
  //  
    public void setUnidadesDeVidaInicial(double unidadesDeVidaInicial) {
        this.unidadesDeVidaInicial = unidadesDeVidaInicial;
    }
    public double getUnidadesDeVidaInicial() {
        return unidadesDeVidaInicial;
    }
//
    
    public void setDescripcionHabilidad(String descripcionHabilidad) {
        this.descripcionHabilidad = descripcionHabilidad;
    }

    public String getDescripcionHabilidad() {
        return descripcionHabilidad;
    }

//
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    //


    
    
    
    
    
    
    
}
