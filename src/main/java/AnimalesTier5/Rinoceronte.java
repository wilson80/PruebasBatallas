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
public class Rinoceronte extends Mascotas{
    public Rinoceronte() {
        setNombreMascota("Rino...");
        setUnidadesDeDanoInicial(5);
        setUnidadesDeVidaInicial(8);
        setTipos("desertico/terrestre");
        setTier(5);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//39. Rinoceronte: [5/8]
//○ Estampida: Inflige 4/8/12 de daño al primer enemigo.
//○ Tipo: Desértico/Terrestre