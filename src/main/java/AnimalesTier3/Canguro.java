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
public class Canguro extends Mascotas{
    public Canguro() {
        setNombreMascota("Canguro");
        setUnidadesDeDanoInicial(1);
        setUnidadesDeVidaInicial(2);
        setTipos("mamifero,terrestre");
        setTier(3);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//26. Canguro [1/2]
//○ Ya quiero pelear: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) cada que la mascota aliada de
//delante ataque
//○ Tipo mamífero/terrestre