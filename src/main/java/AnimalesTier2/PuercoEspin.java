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
public class PuercoEspin  extends Mascotas{

    public PuercoEspin() {
        setNombreMascota("Puerco Espin");
        setUnidadesDeDanoInicial(3);
        setUnidadesDeVidaInicial(2);
        setTipos("solitario,terrestre");
        setTier(2);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
    
}
//12. Puerco Espin [3/2]
//○ Espinas salvajes: Repartir 2/4/6 dmg a todas las mascotas al morir.
//○ Tipo solitario y terrestre