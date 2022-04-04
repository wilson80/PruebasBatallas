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
public class Grillo extends Mascotas{

    public Grillo() {
        setNombreMascota("Grillo ");
        setUnidadesDeDanoInicial(1);
        setUnidadesDeVidaInicial(2); 
        setTipos("insecto");
        setTier(1);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);
    }
    
}
//4. Grillo [1/2]
//○ Zombificación: Convoca a un grillo zombie con estadísticas: (1/1)/(2/2)/(3/3) al morir.
//○ Tipo: Insecto