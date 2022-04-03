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
public class Camello extends Mascotas{
    public Camello() {
        setNombreMascota("Camello");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(5);
        setTipos("mamifero,desertico");
        setTier(3);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//17. Camello [2/5]
//○ Joroba: Dar amigo detrás (+1/+2)/ (+2/+4) / (+3/+6).
//○ Tipo mamífero/desértico