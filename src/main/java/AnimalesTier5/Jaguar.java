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
public class Jaguar extends Mascotas{
    public Jaguar() {
        setNombreMascota("Jaguar  ");
        setUnidadesDeDanoInicial(7);
        setUnidadesDeVidaInicial(4);
        setTipos("mamifero,terrestre");
        setTier(5);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//37. Jaguar: [7/4]
//○ Venganza felina: Si el que está delante es atacado, daña al que lo atacó por (5)(10)(15)
//de daño
//○ Tipo: Mamífero/Terrestre