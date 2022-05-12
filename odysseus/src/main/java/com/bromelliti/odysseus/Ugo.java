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
    private String nome;
    private Vector Inventario; //Per ora non usato
    private Random rng;
    private int HA, MU, MG, AA, MS; //Heal Amount, Magic Used, Magic Gained, Attack Amount, Magic Stolen
    private int azionenemico;/* 1=attacca |2=cura | 3=ruba magia */
    private Item arma;
    private Item armatura;
    //costrut sotto
    
    public String getNome(){ //ritorna nome nemico | costrutto momento
    return nome;
    }
    public Ugo(boolean player, int HPMAX, int SPMAX, int MPMAX,String nome){
        this.player=player;
        this.HPMAX=HPMAX;
        this.MPMAX=MPMAX;
        this.SPMAX=SPMAX;
        this.nome=nome;
        HP=HPMAX;
        SP=SPMAX;
        MP=MPMAX;
        rng= new Random();
    }
    
    //metodi
     public void check(){
        if(player==false){
            boolean azione=false;
            int bob; //grande amico
        // bob=rng.nextInt(3)+1;
            if(HP<=HPMAX/10 && azione==false){//se opportuno curarsi
            
                if(MP<5){//se necessario steal per curarsi
                    azionenemico = 3;
                    steal();
                }else{
                    azionenemico = 2;
                    heal();
                }
             
                azione=true;
            }
      
        /*if(MP<=MP/10 && azione==false){ // non necessario
        steal();
        azione=true;
        
        }*/
        /*if(azione==false){
            azionenemico = 1;
            
            attack();//attacca problema non mio
        }*/
        }
    
    }
        
            public void heal(){  //ti cura e toglie magia
                HA=rng.nextInt(10)+1;
                HP+=HA;
                MU=rng.nextInt(10)+1;
                MP-=MU;
                
            }
            public void recharge(){
                
                MG=rng.nextInt(5)+1;
                MP+=MG; //riprende magia
             
            }
             public int schivata(){ //SCHIVATA QUI ||da mettere SP+10 per turno nemico -> per bob(grande amico)
                 SP-=30;
                 return rng.nextInt(1); // se 0 no schivata || se 1 schivata :) -bob(grande amico)
                 
                }
            public int attack(int damage){ //ritorna valore per attacco
                
                AA=rng.nextInt(10)+1+damage+arma.getDanno();
                return AA; //da togliere a HP avversario ||flaqtneg fatto su frame
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
            
            public void inserisci(Item n){
                Inventario.add(n); //da mettere nel frame visibilità dell'inventario 
                
                }
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
    public void Equip(int n){ //per equippagiare armi
        Item cocco=new Item(0,0);
        cocco=(Item)Inventario.get(n);
        if(cocco.getTipo()==1) //arma
            arma=cocco;
        
        if(cocco.getTipo()==2){ //armatura
        armatura=cocco;
        flatneg=armatura.getFlatneg();
        }
        
        if(cocco.getTipo()!=0) //item non vieni rimosso
    Inventario.remove(n);
        
        }
    public void rimetti(int n){ //0 togli arma |1 togli armatura via pop-up(.-.) e rimette in inventario
    if(n==0){
    Inventario.add(arma);
    arma=null; //funziona? boh
    }else{
    Inventario.add(armatura);
    flatneg=0; //questo funziona
    }
    
    }
}
