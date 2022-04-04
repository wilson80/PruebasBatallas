/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier6;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Mosca extends Mascotas{
    public Mosca() {
        setNombreMascota("Mosca  ");
        setUnidadesDeDanoInicial(5);
        setUnidadesDeVidaInicial(5);
        setTipos("volador,insecto");
        setTier(6);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//52. Mosca:[5/5]
//○ Invocación: cuando un aliado se debilita invoca un (5/5)/ (10/10) / (15/15) Zombie Fly en
//su lugar (tres veces por batalla).
//○ Tipo: Volador/Insecto