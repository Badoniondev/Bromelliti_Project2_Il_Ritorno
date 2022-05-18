/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bromelliti.odysseus;

/**
 *
 * @author Neri
 */
public class Main implements Runnable{
    
    byte startmode;
    static Main main;
    Menu menu;
    static Thread thr;

    public Main() {
        startmode = 0;
    }
    
    
    public static void main(String args[]){
        main = new Main();
        thr = new Thread(main);
        thr.start();
        while (thr.isAlive()==true){
            //Aspetta e non rompere
        }
        
    }

    @Override
    public void run() {
        Menu menu = new Menu();
        while(menu.getStartmode()==0){
            switch (menu.getStartmode()){
                case 1:
                    startmode = 1;
                    thr.stop();
                    
                case 2:
                    startmode = 2;
                    thr.stop();
            }
        }
    }
    
}

