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
public class Conejo extends Mascotas{
    public Conejo() {
        setNombreMascota("Conejo");
        setUnidadesDeDanoInicial(3);
        setUnidadesDeVidaInicial(2);
        setTipos("mamifero");
        setTier(3);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//23. Conejo [3/2]
//○ Cariño: Cuando un amigo come comida de la tienda: Le da +1/ +2 / +3 HP.
//○ Tipo mamífero