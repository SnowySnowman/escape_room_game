/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape.from.slchichlacht;

import java.util.Scanner;

/**
 *
 * @author LUNA
 */
public class FightS {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUNA
 */
    
    
    Scanner scanner = new Scanner(System.in);
    
    Draft11 D = new Draft11();
    
    public boolean ending5; //Win burglar fight and join the mafia
    public boolean ending6; //Die from losing fight with burglar
    public boolean ending7; //Die from being framed by the burglar
    
    public int lastEnding;
    
    public String BChosenName; //calls the randomised name
    
    //attributes of the player
    int Pattack = 50;
    int Phealth = 100;
    
    //attributes of the burglar character
    int Battack = 50;
    int Bhealth = 100;
   
    
    public void fightStartS (){
        
        System.out.println("which attack will you do?");
        System.out.println("    shovel attack");
        
        String attack1 = scanner.nextLine();
        
        switch (attack1){
            case ("shovel attack"):
                Bhealth = Bhealth - Pattack;
                System.out.println("The burglar has received " + Pattack + " damage!");
                System.out.println("The burglar has used normal attack!");
                System.out.println("You have received " + Battack + " damage!");
                break;
            default:
                System.out.println("Please type in the exact attack name :)");
        }
        
        if (Phealth == 0){ //player loses
            System.out.println(BChosenName + " stabs you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");
            ending6 = true;
            EscapeFromSlchichlacht.game1.ending();
            
        }else if (Bhealth == 0){ //player wins            
            System.out.println("You defeated the burglar!");

            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String input15 = scanner.nextLine();
            
            fightWon();
            
        }else { //continue
            System.out.println("which attack will you do?");
            System.out.println("    shovel attack");
                
            String attack2 = scanner.nextLine();
                
        switch (attack2){
            case ("shovel attack"):
                Bhealth = Bhealth - Pattack;
                System.out.println("The burglar has received " + Pattack + " damage!");
                break;
            default:
                System.out.println("Please type in the exact attack name :)");
        }
        
        if (Phealth == 0){ //player loses
            System.out.println(BChosenName + " stabs you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");
            ending6 = true;
            EscapeFromSlchichlacht.game1.ending();
            
        }else if (Bhealth == 0){ //player wins
            System.out.println("You defeated the burglar!");
            System.out.println("(press enter to continue)");
            String input1 = scanner.nextLine();
            
            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String input2 = scanner.nextLine();
            
            fightWon();
            
        }else { //continued by burglar's attack
            System.out.println("The burglar has used normal attack!");
            Phealth = Phealth - Battack;
            System.out.println("You have received " + Battack + " damage!");
        }
        
        System.out.println("which attack will you do?");
        System.out.println("    shovel attack");
        
        String attack3 = scanner.nextLine();
                
        switch (attack3){
            case ("shovel attack"):
                Bhealth = Bhealth - Pattack;
                System.out.println("The burglar has received " + Pattack + " damage!");
                break;
            default:
                System.out.println("Please type in the exact attack name :)");
        }
        
        if (Phealth == 0){ //player loses
            ending6 = true;
            System.out.println("The burglar stabs you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");
            EscapeFromSlchichlacht.game1.ending();
            
        }else if (Bhealth == 0){ //player wins
            System.out.println("You defeated the burglar!");
            System.out.println("(press enter to continue)");
            String input11 = scanner.nextLine();
            
            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String input10 = scanner.nextLine();
            
            fightWon();
            
        }else { //continued by burglar's attack
            System.out.println("The burglar has used normal attack!");
            Phealth = Phealth - Battack;
            System.out.println("You have received " + Battack + " damage!");
        }
        
        if (Phealth == 0){ //player loses
            ending6 = true;
            System.out.println(BChosenName + " stabs you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");
            System.out.println("(press enter to continue)");
            String input9 = scanner.nextLine();
            
            EscapeFromSlchichlacht.game1.ending();
            
        }else if (Bhealth == 0){ //player wins
            System.out.println("You defeated the burglar!");
            System.out.println("(press enter to continue)");
            String input12 = scanner.nextLine();

            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String input8 = scanner.nextLine();
            
            fightWon();
            
        }else{
        System.out.println("which attack will you do?");
        System.out.println("shovel attack");
        
        String attack4 = scanner.nextLine();
                
        switch (attack2){
            case ("shovel attack"):
                Bhealth = Bhealth - Pattack;
                System.out.println("The burglar has received " + Pattack + " damage!");
                break;
            default:
                System.out.println("Please type in the exact attack name :)");
        }
        }
        
        if (Phealth == 0){ //player loses
            ending6 = true;
            System.out.println(BChosenName + " stabs you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");
            System.out.println("(press enter to continue)");
            String input7  = scanner.nextLine();
            
            EscapeFromSlchichlacht.game1.ending();
            
        }else if (Bhealth == 0){ //player wins
            System.out.println("You defeated the burglar!");
            System.out.println("(press enter to continue)");
            String input13 = scanner.nextLine();
 
            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String input6 = scanner.nextLine();
            
            fightWon();
            
        }else { //continued by burglar's attack
            System.out.println("The burglar has used normal attack!");
            Phealth = Phealth - Battack;
            System.out.println("You have received " + Battack + " damage!");
        }        
        
        if (Phealth == 0){ //player loses
            ending6 = true;
            System.out.println(BChosenName + " stabs you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");
            System.out.println("(press enter to continue)");
            String input5 = scanner.nextLine();
            
            EscapeFromSlchichlacht.game1.ending();
            
        }else if (Bhealth == 0){ //player wins
            System.out.println("You defeated the burglar!");
            System.out.println("(press enter to continue)");
            String input14 = scanner.nextLine();
            
            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String input4 = scanner.nextLine();
            
            fightWon();
        

    
}
        }
    
    }
    public void fightWon(){
        EscapeFromSlchichlacht.game1.burglarChoice();
    }
}
