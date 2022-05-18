/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bromelliti.odysseus;

import java.util.Random;

/**
 *
 * @author Neri
 */
public class AlphaCore {
    // Il gioco si gioca da solo. Si gioca bene? Decisamente no, ma se non hai voglia di fare proprio niente...
    byte azione;
    Random rng;
    
    AlphaCore(){
        rng = new Random();
    }
    
    byte TurnoIA(Ugo giocatore, Ugo nemico){
        
        azione = 0;
        
        if (giocatore.HP<(giocatore.HP*25/100)&&(giocatore.getPozioni()>0)){ // Se sotto il 25% di HP e ha pozioni
            azione = 2;//cura
        } else {
            if((rng.nextInt(10)+1)>3){ //30% di schivare invece di attaccare
               azione = 1; //attacca
            } else {
                azione = 4;//schiva
            }
        }
        return azione;
    }
}
