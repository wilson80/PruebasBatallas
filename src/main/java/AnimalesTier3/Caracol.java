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
public class Caracol extends Mascotas{
    public Caracol() {
        setNombreMascota("Caracol");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(2);
        setTipos("insecto,solitario");
        setTier(3);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//21. Caracol [2/2]
//○ Resurgir: si perdiste la última batalla, dales a todos los amigos (+1/+1)/ (+2/+2) / (+3/+3) al
//comprar
//○ Tipo insecto/solitario