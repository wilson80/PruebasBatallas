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
public class Panda extends Mascotas{
    public Panda() {
        setNombreMascota("Panda  ");
        setUnidadesDeDanoInicial(5);
        setUnidadesDeVidaInicial(5);
        setTipos("mamifero,solitario");
        setTier(6);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//44. Panda: [5/5]
//● Fortaleza: Absorbe el (50% / 60% / 80%) del daño recibido.
//● Mamífero/Solitario