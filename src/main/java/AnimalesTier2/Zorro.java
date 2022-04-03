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
public class Zorro extends Mascotas{

    public Zorro() {
        setNombreMascota("Zorro");
        setUnidadesDeDanoInicial(5);
        setUnidadesDeVidaInicial(12);
        setTipos("solitario,terrestre");
        setTier(2);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
    
    
}
//15. Zorro: [5/2]
//○ Ataque Rápido: Ataca 2 veces seguidas cada (3 turnos)(2 turnos)(1 turno)
//○ Tipo solitario y terrestre