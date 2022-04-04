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
public class Ballena extends Mascotas{
    public Ballena() {
        setNombreMascota("Ballena");
        setUnidadesDeDanoInicial(3);
        setUnidadesDeVidaInicial(8);
        setTipos("acuatico");
        setTier(4);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//33. Ballena [3/8]
//○ Succión: Al iniciar la partida trague al aliado de delante y suéltalo como lvl 1/2/3 después
//de debilitarse.
//○ Tipo: Acuático