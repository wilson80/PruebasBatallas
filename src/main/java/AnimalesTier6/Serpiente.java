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
public class Serpiente extends Mascotas{
    public Serpiente() {
        setNombreMascota("Serpien");
        setUnidadesDeDanoInicial(6);
        setUnidadesDeVidaInicial(6);
        setTipos("reptil,terrestre,desertico");
        setTier(6);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//47. Serpiente: [6/6]
//○ Ataque discreto: inflige 5/10/15 de daño a un enemigo aleatorio cuando una mascota
//aliada de delante ataca.
//○ Reptil/Terrestre/Desértico