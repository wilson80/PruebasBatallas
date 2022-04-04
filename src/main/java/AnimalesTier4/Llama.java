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
public class Llama extends Mascotas{
    public Llama() {
        setNombreMascota("Llama  ");
        setUnidadesDeDanoInicial(3);
        setUnidadesDeVidaInicial(6);
        setTipos("terrestre");
        setTier(4);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//35. Llama [3/6]
//○ Fortaleza individual: al finalizar el turno de compra si tienes 4 mascotas o menos, gana
//(+2/+2)/ (+4/+4) / (+6/+6).
//○ Tipo: Terrestre