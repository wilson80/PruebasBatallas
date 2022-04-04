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
public class Mamut  extends Mascotas{
    public Mamut() {
        setNombreMascota("Mamut  ");
        setUnidadesDeDanoInicial(3);
        setUnidadesDeVidaInicial(10);
        setTipos("mamifero,terrestre,solitario");
        setTier(6);
        setDescripcionHabilidad("vacio");
        setNivel(1);
        setExperiencia(1);

    }
}
//48. Mamut: [3/10]
//○ Fuerza compañeros: al desmayarse dará a todos los amigos (+2/+2)/ (+4/+4) / (+6/+6) .
//○ Tipo: Mamífero/Terrestre/Solitario