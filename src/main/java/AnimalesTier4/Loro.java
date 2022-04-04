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
public class Loro extends Mascotas {
    public Loro() {
        setNombreMascota("Loro   ");
        setUnidadesDeDanoInicial(5);
        setUnidadesDeVidaInicial(3);
        setTipos("volador");
        setTier(4);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//29. Loro [5/3]
//○ Copia: al finalizar el turno de compra copia la habilidad del amigo de adelante como lvl
//1/2/3 hasta el final de la batalla.
//○ Tipo volador