/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier1;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Pescado extends Mascotas {

    public Pescado() {
        setNombreMascota("Pescado");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(3);
        setTipos("acuatico");
        setTier(1);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);
        
    }
}
//2. Pescado [2/3]
//○ Power-up: Da a todos los aliados (+1/+1)/(+2/+2) al subir de nivel.
//○ Tipos: Acuático