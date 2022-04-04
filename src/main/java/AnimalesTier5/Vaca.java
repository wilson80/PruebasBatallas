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
public class Vaca extends Mascotas{
    public Vaca() {
        setNombreMascota("Vaca   ");
        setUnidadesDeDanoInicial(4);
        setUnidadesDeVidaInicial(6);
        setTipos("mamifero,terrestre");
        setTier(5);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//42. Vaca: [4/6]
//○ Leche potenciadora: al comprar reemplaza la tienda de comida con leche gratis que da
//(+1/+2)/ (+2/+4) / (+3/+6) .
//○ Mamífero/Terrestre