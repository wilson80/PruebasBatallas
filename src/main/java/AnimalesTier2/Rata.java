/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier2;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Rata extends Mascotas{

    public Rata() {
        setNombreMascota("Rata   ");
        setUnidadesDeDanoInicial(4);
        setUnidadesDeVidaInicial(5);
        setTipos("terrestre,solitario");
        setTier(2);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
    
            
}
//Rata [4/5]
//○ Ayuda hipócrita: invoca 1/2/3 1/1 Dirty Rats al frente para el oponente al morir.
//○ Tipo terrestre y solitario