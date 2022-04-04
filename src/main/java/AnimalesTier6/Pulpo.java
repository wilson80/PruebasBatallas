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
public class Pulpo extends Mascotas{
    public Pulpo() {
        setNombreMascota("Pulpo  ");
        setUnidadesDeDanoInicial(8);
        setUnidadesDeVidaInicial(8);
        setTipos("acuatico,solitario");
        setTier(6);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//51. Pulpo: [8/8]
//○ Habilidades por nivel
//■ (1) Subir de nivel: Gana +8/8.
//■ (2) Subir de nivel: gana +8/+8 y una nueva habilidad al azar.
//■ (3) Antes del ataque: inflige 5 de daño a todos los enemigos.
//○ Tipo: Acuático/Solitario