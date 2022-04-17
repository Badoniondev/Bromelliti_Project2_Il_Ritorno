/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bromelliti.odysseus;

/**
 *
 * @author Matteo
 */
public class Item {
    //att
    private int tipo; //0 item | 1 arma | 2 armatura
    private int reqdex,reqstrength; //prereq per alcuni equipaggiamenti
    private int mindamage,maxdamage; //intervalli per gen danno
    private int speed;
    private  int flatneg; //negazione danno armatura
    private  int  peso; 
    //costrutt
    public Item(int tipo){
    this.tipo=tipo;
             switch(tipo){ //indetifica il tipo 
    
             case 0 -> { 
              reqdex=0;
              reqstrength=0;
              flatneg=0;
              }
             case 1 -> flatneg=0;
             case 2 -> {mindamage=0;
             maxdamage=0;
             }
    
              }
    
  }
    //metodi:

    public int getTipo() {
        return tipo;
    }

    public int getReqdex() {
        return reqdex;
    }

    public int getReqstrength() {
        return reqstrength;
    }

    public int getMindamage() {
        return mindamage;
    }

    public int getMaxdamage() {
        return maxdamage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFlatneg() {
        return flatneg;
    }

    public int getPeso() {
        return peso;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setReqdex(int reqdex) {
        this.reqdex = reqdex;
    }

    public void setReqstrength(int reqstrength) {
        this.reqstrength = reqstrength;
    }

    public void setMindamage(int mindamage) {
        this.mindamage = mindamage;
    }

    public void setMaxdamage(int maxdamage) {
        this.maxdamage = maxdamage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFlatneg(int flatneg) {
        this.flatneg = flatneg;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
