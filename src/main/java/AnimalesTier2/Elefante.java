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
public class Elefante extends Mascotas{

    public Elefante() {
        setNombreMascota("Elefant");
        setUnidadesDeDanoInicial(3);
        setUnidadesDeVidaInicial(5);
        setTipos("mamifero,terrrestre");
        setTier(2);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);
    }
    
}
//11. Elefante: [3/5]
//○ Daño colateral: Inflige 1 daño a 1/2/3 amigos detrás antes de atacar
//○ Tipo mamífero y terrestre