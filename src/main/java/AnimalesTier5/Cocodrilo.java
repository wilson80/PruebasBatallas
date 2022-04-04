/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier5;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Cocodrilo extends Mascotas{
    public Cocodrilo() {
        setNombreMascota("Cocodri");
        setUnidadesDeDanoInicial(8);
        setUnidadesDeVidaInicial(4);
        setTipos("reptil,solitario");
        setTier(5);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//41. Cocodrilo: [8/4]
//○ Mordida: (Comienzo de la batalla) inflige 8/16/24 de daño al último enemigo.
//○ Tipo: Reptil/Solitario