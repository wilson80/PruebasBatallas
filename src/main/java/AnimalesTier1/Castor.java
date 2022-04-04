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
public class Castor extends Mascotas{

    public Castor() {
        setNombreMascota("Castor ");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(2);
        setTipos("terrestre,acuatico");
        setTier(1);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);
    }
    
}
//5. Castor [2/2]
//○ Represa: Da a 2 aliados al azar +1/+2/+3 HP al venderse.
//○ Tipo: Terrestre/acuático