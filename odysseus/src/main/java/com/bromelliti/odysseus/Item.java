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
    private int reqdex,reqstrength; //prereq per alcuni equipaggiamenti più tardi
    //private int mindamage,maxdamage; //intervalli per gen danno||no.
    private int danno=0;
    //private int speed; più tardi
    private  int flatneg=0; //negazione danno armatura
   // private  int  peso; più tardi
    //private int debolezza; più tardi
    
    //costrutt
    public Item(int tipo,int n){
    this.tipo=tipo;
  
             switch(tipo){ //indetifica il tipo  //0 item | 1 arma | 2 armatura
    
             case 0 -> { 
              reqdex=0;
              reqstrength=0;
              flatneg=0;
              danno=0;
              }
             case 1 -> danno=n;
             case 2 -> {flatneg=n;
             
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

    public int getDanno() {
        return danno;
    }

   /* public int getSpeed() {
        return speed;
    }*/

    public int getFlatneg() {
        return flatneg;
    }

    /*public int getPeso() {
        return peso;
    }*/

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setReqdex(int reqdex) {
        this.reqdex = reqdex;
    }

    public void setReqstrength(int reqstrength) {
        this.reqstrength = reqstrength;
    }

   /* public void setMindamage(int mindamage) {
        this.mindamage = mindamage;
    }

    public void setMaxdamage(int maxdamage) {
        this.maxdamage = maxdamage;
    }*/

  /*  public void setSpeed(int speed) {
        this.speed = speed;
    }
*/
    public void setFlatneg(int flatneg) {
        this.flatneg = flatneg;
    }
public void setDanno(int danno){
this.danno=danno;

}
  /*  public void setPeso(int peso) {
        this.peso = peso;
    }*/
    
}
