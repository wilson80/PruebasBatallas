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
public class Lobo extends Mascotas{
    public Lobo() {
        setNombreMascota("Lobo");
        setUnidadesDeDanoInicial(3);
        setUnidadesDeVidaInicial(4);
        setTipos("solitario,terrestre");
        setTier(3);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//24. Lobo [3/4]
//○ Aullido: Si es el último con vida gana (+2/+2)(+3,+3)(+5,+5) permanentemente.
//○ Tipo solitario/terrestre