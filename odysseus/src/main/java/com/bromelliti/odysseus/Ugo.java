/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bromelliti.odysseus;

import java.util.Vector;

/**
 *
 * @author Ugo
 */
public class Ugo extends Stats {
    //att
    boolean player; //true player | false nemico
    private Vector Inventario; //Per ora non usato
    //costrut
    public Ugo(boolean player, int HPMAX, int SPMAX, int MPMAX){
        this.player=player;
        this.HPMAX=HPMAX;
        this.MPMAX=MPMAX;
        this.SPMAX=SPMAX;
    }
    //metodi
    public void check(){
     if(HP<=0)
        HP=0;   //morto  
    if(SP<=0)
       SP=0;
    if(MP<=0)
       MP=0;
    
    }
  /* public void morte(){
       if(HP<=0)
        HP=0;   //morto  
   }
   public void stanco(){
   if(SP<=0)
       SP=0;
   }
   public void magia(){
   if(MP<=0)
       MP=0;
   }*/
    public Vector getInventario() {
        return Inventario;
    }
}
