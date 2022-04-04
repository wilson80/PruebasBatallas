/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier3;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Jirafa extends Mascotas{
    public Jirafa() {
        setNombreMascota("Jirafa ");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(5);
        setTipos("mamifero,terrestre");
        setTier(3);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//19. Jirafa [2/5]
//○ Fortaleza aliada: Da 1/ 2 / 3 amigos por delante +1/+1 al finalizar el turno de compra.
//○ Tipo mamífero/terrestre