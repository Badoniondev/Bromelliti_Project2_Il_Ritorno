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
    private int HA, MU, MG, AA, MS; //Heal Amount, Magic Used, Magic Gained, Attack Amount, Magic Stolen
    private short azionenemico; /*
    1 - attacca
    2 - cura
    3 - ruba magia
    */
    
    //costrut
    
    public Ugo(boolean player, int HPMAX, int SPMAX, int MPMAX){
        this.player=player;
        this.HPMAX=HPMAX;
        this.MPMAX=MPMAX;
        this.SPMAX=SPMAX;
        HP=HPMAX;
        SP=SPMAX;
        MP=MPMAX;
        rng= new Random();
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
            int bob; //grande amico
        // bob=rng.nextInt(3)+1;
            if(HP<=HP/10 && azione==false){//se opportuno curarsi
            
                if(MP<5){//se necessario steal per curarsi
                    steal();
                    azionenemico = 3;
                }else{
                    heal();
                    azionenemico = 2;
                }
             
                azione=true;
            }
      
        /*if(MP<=MP/10 && azione==false){ // non necessario
        steal();
        azione=true;
        
        }*/
        if(azione==false){}
            attack();//attacca
            azionenemico = 1;
        }
    
    }
             public void heal(){  //ti cura e toglie magia
                HA=rng.nextInt(10)+1;
                HP+=HA;
                MU=rng.nextInt(4)+1;
                MP-=MU;
                
            }
            public void recharge(){
                
                MG=rng.nextInt(5)+1;
                MP+=MG; //riprende magia
             
            }
             
            public int attack(){ //ritorna valore per attacco
                AA=rng.nextInt(10)+1;
                return AA; //da togliere a HP avversario
            }
             
            public int steal(){//ruba magia al player 
                MS=rng.nextInt(4)+1; 
                MP+=MS;
                return MS; //valore di ritorno da togliere a MP player
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
    
    public int getAzionenemico() {
        return azionenemico;
    }

    public int getHA() {
        return HA;
    }

    public int getMU() {
        return MU;
    }
    
    public int getMG() {
        return MG;
    }
    
    public int getAA() {
        return AA;
    }
    
    public int getMS() {
        return MS;
    }
}
