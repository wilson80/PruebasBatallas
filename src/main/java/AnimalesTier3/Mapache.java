/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier3;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Mapache extends Mascotas{
    public Mapache() {
        setNombreMascota("Mapache");
        setUnidadesDeDanoInicial(5);
        setUnidadesDeVidaInicial(4);
        setTipos("solitario");
        setTier(3);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//18. Mapache [5/4]
//○ Repartir poder: Otorga 1x/2x/3x ATK a las mascotas adyacentes al morir .
//○ Tipo solitario