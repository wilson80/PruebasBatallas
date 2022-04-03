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
public class Escarabajo extends Mascotas{

    public Escarabajo() {
        setNombreMascota("Escarabajo");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(3);
        setTipos("insecto");
        setTier(1);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);
    }
    
}
//8. Escarabajo [2/3]
//○ Apetito: Otorga a las mascotas de la tienda +1/+2/+3 HP al comer comida de la tienda.
//○ Tipo: Insecto