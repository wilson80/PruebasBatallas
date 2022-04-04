/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier5;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Foca extends Mascotas{
    public Foca() {
        setNombreMascota("Foca   ");
        setUnidadesDeDanoInicial(3);
        setUnidadesDeVidaInicial(8);
        setTipos("acuatico,mamifero");
        setTier(5);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//36. Foca: [3/8]
//○ Compartir poder: Al recibir comida de la tienda da a 2 amigos rando ms
//(+1/+1)(+2/+2)/(+3/+3).
//○ Tipo: Acuático/Mamífero