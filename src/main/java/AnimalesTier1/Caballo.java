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
public class Caballo extends Mascotas {

    public Caballo() {
        setNombreMascota("Caballo");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(1);
        setTipos("mamifero,domestico");
        setTier(1);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);
    }
    
    
    
}
//6. Caballo [2/1]
//○ Rugido aliado: Da +1/+2/+3 ATK a los aliados invocados.
//○ Mamífero/doméstico