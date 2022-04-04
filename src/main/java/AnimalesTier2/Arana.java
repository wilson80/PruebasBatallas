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
public class Arana extends Mascotas{

    public Arana() {
        setNombreMascota("Arana  ");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(2);
        setTipos("insecto");
        setTier(2);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);
    }
    
}
//16. Araña: [2/2]
//○ Liberación: invoca una mascota de nivel 1/2/3 de nivel 3 como 2/2 al morir.
//○ Tipo insecto