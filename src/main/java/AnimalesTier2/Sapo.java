/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier2;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Sapo extends Mascotas{

    public Sapo() {
        setNombreMascota("Sapo   ");
        setUnidadesDeDanoInicial(3);
        setUnidadesDeVidaInicial(3);
        setTipos("terrestre,acuatico");
        setTier(2);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
    
}
//9. Sapo [3/3]
//○ Metamorfosis: Copia la salud del aliado más saludable.
//○ Tipo: terrestre y acuático