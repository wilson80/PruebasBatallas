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
public class Ardilla extends Mascotas{
    public Ardilla() {
        setNombreMascota("Ardilla");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(5);
        setTipos("domestico");
        setTier(4);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//34. Ardilla [2/5]
//○ Rebajas: al iniciar el turno de compra realiza un descuento en la compra de alimentos por
//1/2/3 de oro.
//○ Tipo: Doméstico
