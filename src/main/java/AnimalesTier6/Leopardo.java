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
public class Leopardo extends Mascotas{
    public Leopardo() {
        setNombreMascota("Leopar.");
        setUnidadesDeDanoInicial(10);
        setUnidadesDeVidaInicial(4);
        setTipos("mamifero,terrestre");
        setTier(6);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//49. leopardo: [10/4]
//○ Zarpazo: al iniciar la batalla inflige 50 % de daño ATQ a 1/2/3 enemigos aleatorios .
//○ Tipo: Mamífero/Terrestre