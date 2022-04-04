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
public class Hipopotamo extends Mascotas{
    public Hipopotamo() {
        setNombreMascota("Hipopo.");
        setUnidadesDeDanoInicial(4);
        setUnidadesDeVidaInicial(7);
        setTipos("acuatico,terrestre");
        setTier(4);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//30. Hipopótamo [4/7]
//○ Robustez: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) al ser él hipopotamo quien debilita a una
//mascota enemiga.
//○ Tipo acuático/terrestre