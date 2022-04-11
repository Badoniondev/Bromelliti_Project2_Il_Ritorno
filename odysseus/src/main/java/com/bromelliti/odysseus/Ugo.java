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
    int tipo; //0 player | 1 nemico
    private Vector Inventario; //Per ora non usato
    //costrut
    public Ugo(){}
    public Ugo(int tipo){
    this.tipo=tipo;
    switch(tipo){
        case 0 -> {
            }
        case 1 -> {
            }
    
    
    }
        //da mettere
        //da mettere
            
    
    
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
