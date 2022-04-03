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
public class PavoReal extends Mascotas{

    public PavoReal() {
        setNombreMascota("Pavo Real");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(5);
        setTipos("domestico,volador");
        setTier(2);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
    
    
}
//13. Pavoreal [2/5]
//○ Potenciación: Gana 50% de ATK 1/ 2 / 3 veces al recibir daño.
//○ Tipo doméstico y volador