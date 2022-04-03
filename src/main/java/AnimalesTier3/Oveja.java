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
public class Oveja extends Mascotas{
    public Oveja() {
        setNombreMascota("Oveja");
        setUnidadesDeDanoInicial(2);
        setUnidadesDeVidaInicial(2);
        setTipos("domestico,terrestre");
        setTier(3);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//22. Oveja (Cabras) [2/2]
//○ Revolución: invoca dos (2/2)/ (4/4) / (6/6) carneros al morir
//○ Tipo doméstico/terrestre