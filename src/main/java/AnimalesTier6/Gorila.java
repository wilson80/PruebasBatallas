/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier6;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Gorila  extends Mascotas{
    public Gorila() {
        setNombreMascota("Gorila ");
        setUnidadesDeDanoInicial(6);
        setUnidadesDeVidaInicial(9);
        setTipos("mimifero,terrestre");
        setTier(6);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//50. Gorila: [6/9]
//○ Escudo: al recibir daño gana escudo de coco ( 1/2/3 veces por batalla).
//○ Tipo: Mamífero/Terrestre