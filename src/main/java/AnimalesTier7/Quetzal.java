/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesTier7;

import Tienda.Mascotas;

/**
 *
 * @author Jonwil
 */
public class Quetzal extends Mascotas{
    public Quetzal() {
        setNombreMascota("Quetzal");
        setUnidadesDeDanoInicial(10);
        setUnidadesDeVidaInicial(10);
        setTipos("volador,solitario");
        setTier(7);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//53. Quetzal [10/10]
//○ Habilidades por nivel
//■ (1) Agrega a su vida la suma de toda la vida de los animales tipos aves.
//■ (2) Hace lo del nivel 1 y agrega a su daño la suma de todo el daño del daño de
//todas las aves.
//■ (3) Hace lo del nivel 2 pero con todos los animales.
//○ Tipo: Volador/Solitario