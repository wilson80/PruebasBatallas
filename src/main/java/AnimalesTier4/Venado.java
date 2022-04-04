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
public class Venado extends Mascotas{
    public Venado() {
        setNombreMascota("Venado ");
        setUnidadesDeDanoInicial(1);
        setUnidadesDeVidaInicial(1);
        setTipos("mamifero");
        setTier(4);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}

//28. Venado (Camión) [1/1]
//○ Venganza: Invoca un (5/5)/(10/10)/(15/15) autobus con Splash attack al morir.
//○ Tipo mamífero