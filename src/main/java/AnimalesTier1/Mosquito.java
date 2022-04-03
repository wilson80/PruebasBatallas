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
public class Mosquito extends Mascotas{

    public Mosquito() {
        setNombreMascota("Mosquito");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(2);
        setTipos("volador");
        setTier(1);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);
    }
    
}
//3. Mosquito [2/2]
//○ Piquete inicial: Al iniciar batalla realiza 1 de daño a (1)/(2)/(3) enemigos
//○ Tipo: Volador