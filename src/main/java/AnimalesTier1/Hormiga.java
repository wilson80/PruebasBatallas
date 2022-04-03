/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier1;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Hormiga extends Mascotas {

    public Hormiga() {
        setNombreMascota("Hormiga");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(1);
        setTipos("insecto,terrestre");
        setTier(1);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);
    }
    
    
    
    
    @Override
    public void ejecutarhabilidad(){
    }

    
//    Hormiga [2/1]
//○ Compañerismo: Da a un aliado al azar (+2/+1)/(+4/+2)/(+6/+3) al morir.
//○ Tipos: Insecto/terrestre
    
}
