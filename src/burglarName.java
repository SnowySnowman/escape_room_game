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
public class burglarName {
    String Bname1;
    String Bname2;
    String Bname3;
    String Bname4;
    String Bname5;
    public String BChosenName;
    
    public void burglarName (){
        Bname1 = "Wiri";
        Bname2 = "Grabard";
        Bname3 = "Nyderilia";
        Bname4 = "Roboant";
        Bname5 = "JohnCena";
        
        
        Random rand = new Random();
        
        int randomNum = rand.nextInt(5);
        
        switch(randomNum){
            case 0:
                BChosenName = Bname1;
                break;
            case 1:
                BChosenName = Bname2;
                break;
            case 2:
                BChosenName = Bname3;
                break;
            case 3:
                BChosenName = Bname4;
                break;
            case 4:
                BChosenName = Bname5;
        }
        System.out.println("The burglar " + BChosenName + " wants to beat you up!");
}
}
