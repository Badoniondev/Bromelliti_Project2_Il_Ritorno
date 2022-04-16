/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bromelliti.odysseus;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Ugo
 */
public class Ugo extends Stats {
    //att
    boolean player; //true player | false nemico
    private Vector Inventario; //Per ora non usato
    private Random rng;
    
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
     //controlla se è player o meno
      if(player==false){
         boolean azione=false;
         int bob;
        // bob=rng.nextInt(3)+1;
         if(HP<=HP/10 && azione==false){//se opportuno curarsi
            
             if(MP<5){//se necessario steal per curarsi
             steal();
            }
          else{
         heal();
             }
             
         azione=true;
              }
      
        /*if(MP<=MP/10 && azione==false){ // non necessario
        steal();
        azione=true;
        
        }*/
        if(azione==false){}
            attack();//attacca
     }
    
    }
             public void heal(){  //ti cura e toglie magia
        
               HP+=rng.nextInt(10)+1; 
            MP-=rng.nextInt(4)+1;
        
            }
             public void recharge(){
             
             MP+=rng.nextInt(5)+1; //riprende magia
             
             }
             
             public int attack(){ //ritorna valore per attacco
             int attacco=0;
             attacco=rng.nextInt(10)+1;
             return attacco; //da togliere a HP avversario
             }
             
             public int steal(){//ruba magia al player 
             int ruba;
             ruba=rng.nextInt(4)+1; 
             MP+=ruba;
             return ruba; //valore di ritorno da togliere a MP player
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
