/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bromelliti.odysseus;

/**
 *
 * @author Neri
 */
public class Stats{
    //att
    protected int HPMAX; //Health Points massimi
    protected int SPMAX; //Stamina Points massimi per ora non si usa
    protected int MPMAX; //Magic Points massimi
    protected int HP; //Health Points
    protected int SP; //Stamina Points
    protected int MP; //Magic Points
    protected int flatneg; //riduzione danno
    protected int XP; //punti esperienza
    protected int livello; //livello personaggio
    //tba speed da usare con stamina
    
    //costrut
    public Stats(){
    
    
    
    
    }
          
    /*
    */
//metodi
    public int getHPMAX() {
        return HPMAX;
    }

    public int getSPMAX() {
        return SPMAX;
    }

    public int getMPMAX() {
        return MPMAX;
    }

    public int getHP() {
        return HP;
    }

    public int getSP() {
        return SP;
    }

    public int getMP() {
        return MP;
    }

    public int getFlatneg() {
        return flatneg;
    }

    public int getXP() {
        return XP;
    }

    public int getLivello() {
        return livello;
    }
    public void setFlatneg(int flatneg) {
        this.flatneg=flatneg;
        
        
    }
    
}
