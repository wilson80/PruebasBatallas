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
public class Escorpion extends Mascotas{
    public Escorpion() {
        setNombreMascota("Escorpi");
        setUnidadesDeDanoInicial(1);
        setUnidadesDeVidaInicial(1);
        setTipos("desertico,solitario");
        setTier(5);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//38. Escorpión: [1/1]
//○ Aguja; tiene un ataque de veneno innato (el veneno ejecuta a la mascota enemiga sin
//importar cuánta vida tenga) .
//○ Tipo: Desértico/Solitario