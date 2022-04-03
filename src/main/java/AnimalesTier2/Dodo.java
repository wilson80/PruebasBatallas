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
public class Dodo extends Mascotas{

    public Dodo() {
        setNombreMascota("Dodo");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(3);
        setTipos("volador");
        setTier(2);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);
    }
    
}
//10. Dodo [2/3]
//○ División de poder: Da al aliado de adelante 50% /100%/150% ATK al iniciar la batalla.
//○ Tipo volador