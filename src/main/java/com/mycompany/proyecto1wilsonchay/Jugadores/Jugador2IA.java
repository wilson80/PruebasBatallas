/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1wilsonchay.Jugadores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jonwil
 */
public class Jugador2IA extends Jugadores{
    private int ronda=1;
    private int contadorAcciones=0;

    public Jugador2IA() {
        
    }
    
    public void ran(){
        Random random = new Random();
    }
    
    @Override
    public int seleccioneAccion(){
        contadorAcciones++;
        int comprar=1;
        int vender;
        int ordenar;
        int iniciarBatalla;
        
        switch(contadorAcciones){
            case 1:
                return 1;
            case 2:
                return 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 2;
            case 7:
                return 1;
            case 8:
                return 3;
            case 9:
                return 3;
//            case 10:
//                return 1;
//            case 11:
//                return 4;
//            case 12:
//                return 4;
//            case 13:
//                return 1;
//            case 14:
//                return 5;
//            case 15:
//                return 5;
//            case 16:
//                return 4;
            default:
                return 4;
        }
        
    }
    
    
    
}
