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
public class Tigre extends Mascotas{
    public Tigre() {
        setNombreMascota("Tigre  ");
        setUnidadesDeDanoInicial(4);
        setUnidadesDeVidaInicial(3);
        setTipos("terrestre,mamifero");
        setTier(6);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//46. Tigre: [4/3]
//○ Repetición: El amigo de adelante repite su habilidad en la batalla como si fuera de nivel
//1/2/3 .
//○ Terrestre/Mamífero