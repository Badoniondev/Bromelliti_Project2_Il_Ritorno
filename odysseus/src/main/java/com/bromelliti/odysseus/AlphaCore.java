/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bromelliti.odysseus;

/**
 *
 * @author 4D
 */
public class AlphaCore {
    
    short azione;
    
    AlphaCore(){
        
    }
    
    short TurnoIA(Ugo giocatore, Ugo nemico){
        
        if (giocatore.HP<(giocatore.HP*25/100)&&(giocatore.getPozioni()>0)){
            azione = 3;
        } else if() // scivata e attacco e altra robna -bob
        
        return azione;
    }
    
}
