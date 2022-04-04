/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier4;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Puma extends Mascotas{
    public Puma() {
        setNombreMascota("Puma   ");
        setUnidadesDeDanoInicial(3);
        setUnidadesDeVidaInicial(7);
        setTipos("mamifero/domestico");
        setTier(4);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//32. Puma [3/7]
//○ Sigilo: Al cabo de (3)(2)(1) turnos siendo dañado deja una copia de 1/1, mientras está la
//copia el puede atacar.
//○ Tipo: Mamífero/Terrestre