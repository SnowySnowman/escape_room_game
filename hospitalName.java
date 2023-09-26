/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.from.slchichlacht;

import java.util.Random;

/**
 *
 * @author LUNA
 */
public class hospitalName {
    
    //musicH myMusicH = new musicH();
    String Hname1;
    String Hname2;
    String Hname3;
    String Hname4;
    String Hname5;
    public static String HChosenName;
    public static int Hhealth;
    public static int Hattack;
    
    public hospitalName(){
        Hname1 = "Onerani";
        Hname2 = "Bareldan";
        Hname3 = "Lothomand";
        Hname4 = "Capulet";
        Hname5 = "Montague";
        Hhealth = 100;
        Hattack = 50;
        
        Random rand = new Random();
        
        int randomNum = rand.nextInt(5);
        
        switch(randomNum){
            case 0:
                HChosenName = Hname1;
                break;
            case 1:
                HChosenName = Hname2;
                break;
            case 2:
                HChosenName = Hname3;
                break;
            case 3:
                HChosenName = Hname4;
                break;
            case 4:
                HChosenName = Hname5;
                break;
        }
        
        System.out.println("You decide to have a riot, and start to find some weapons.");
        System.out.println("You find out one sharp scalpel and a fairly new drill.");
        System.out.println("You choose to have some fun in this boring hospital, but it might has been a wrong decision,");
        System.out.println("as the crazy doctor, " + HChosenName + ", wants to disect you!");
    }
}
