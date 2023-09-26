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
public class Fight {
    Scanner scanner = new Scanner(System.in);
    Draft11 D;
    
    public boolean ending5; //Win burglar fight and join the mafia
    public boolean ending6; //Die from losing fight with burglar
    public boolean ending7; //Die from being framed by the burglar
    
    public int lastEnding;
    
    public String BChosenName; //calls the randomised name
   
    //attributes of the player
    int Pattack = 20;
    int Phealth = 100;
    
    //attributes of the burglar character
    int Battack = 50;
    int Bhealth = 100;
    
    public void fightStart (){
        
        System.out.println("which attack will you do?");
        System.out.println("    normal attack");
        
        String attack1 = scanner.nextLine();
        
        switch (attack1){
            case ("normal attack"):
                Bhealth = Bhealth - Pattack;
                System.out.println("The burglar has received " + Pattack + " damage!");
                System.out.println("The burglar has used normal attack!");
                Phealth = Phealth - Battack;
                System.out.println("You have received " + Battack + " damage!");
                break;
            default:
                System.out.println("Please type in the exact attack name :)");
        }
        
        if (Phealth == 0){ //player loses
            System.out.println(BChosenName + " stabs you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");
            fightLose();
            
        }else if (Bhealth == 0){ //player wins            
            System.out.println("You defeated the burglar!");

            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String enter = scanner.nextLine();
            D.burglarChoice();
            
        }else { //continue
            System.out.println("which attack will you do?");
            System.out.println("normal attack");
            
            String attack2 = scanner.nextLine();
                
        switch (attack2){
            case ("normal attack"):
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
            System.out.println("(press enter to continue)");
            String enter2 = scanner.nextLine();
            
            fightLose();
            
        }else if (Bhealth == 0){ //player wins
            System.out.println("You have defeated the burglar!");
            System.out.println("(press enter to continue)");
            String input1 = scanner.nextLine();
            
            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String enter3 = scanner.nextLine();
            
            D.burglarChoice();
            
        }else { //continued by burglar's attack
            System.out.println("The burglar has used normal attack!");
            Phealth = Phealth - Battack;
            System.out.println("You have received " + Battack + " damage!");
        }
        
        System.out.println("which attack will you do?");
        System.out.println("normal attack");
        
        String attack3 = scanner.nextLine();
                
        switch (attack3){
            case ("normal attack"):
                Bhealth = Bhealth - Pattack;
                System.out.println("The burglar has received " + Pattack + " damage!");
                break;
            default:
                System.out.println("Please type in the exact attack name :)");
        }
        
        if (Phealth == 0){ //player loses
            ending6 = true;
            EscapeFromSlchichlacht.game1.achievementsGained = EscapeFromSlchichlacht.game1.achievementsGained + 1;
            System.out.println(BChosenName + " stabs you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");
            fightLose();
            
        }else if (Bhealth == 0){ //player wins
            System.out.println("You defeated the burglar!");
            System.out.println("press enter to continue");
            String input2 = scanner.nextLine();
            
            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String enter4 = scanner.nextLine();
            
            D.burglarChoice();
            
        }else { //continued by burglar's attack
            System.out.println("The burglar has used quick attack!");
            Phealth = Phealth - Battack;
            System.out.println("You have received " + Battack + " damage!");
        }
        
        if (Phealth == 0){ //player loses
            
            System.out.println(BChosenName + " stabs you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");
            System.out.println("(press enter to continue)");
            String enter5 = scanner.nextLine();
            
            fightLose();
            
        }else if (Bhealth == 0){ //player wins
            System.out.println("You defeated the burglar!");
            System.out.println("press enter to continue");
            String input3 = scanner.nextLine();

            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String enter6 = scanner.nextLine();
            
            D.burglarChoice();
            
        }else{
        System.out.println("which attack will you do?");
        System.out.println("normal attack");
        
        String attack4 = scanner.nextLine();
                
        switch (attack2){
            case ("normal attack"):
                Bhealth = Bhealth - Pattack;
                System.out.println("The burglar has received " + Pattack + " damage!");
                break;
            default:
                System.out.println("Please type in the exact attack name :)");
        }
        }
        
        if (Phealth == 0){ //player loses
            
            System.out.println(BChosenName + " stabs you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");
            fightLose();
            
        }else if (Bhealth == 0){ //player wins
            System.out.println("You defeated the burglar!");
            System.out.println("press enter to continue");
            String input4 = scanner.nextLine();

            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String enter9 = scanner.nextLine();
            
            D.burglarChoice();
            
        }else { //continued by burglar's attack
            System.out.println("The burglar has used normal attack!");
            Phealth = Phealth - Battack;
            System.out.println("You have received " + Battack + " damage!");
        }        
        if (Phealth == 0){ //player loses
          
            System.out.println(BChosenName + " stabs you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");
            System.out.println("(press enter to continue)");
            String enter7 = scanner.nextLine();
            
            fightLose();
            
        }else if (Bhealth == 0){ //player wins
            System.out.println("You defeated the burglar!");
            System.out.println("press enter to continue");
            String input6 = scanner.nextLine();

            System.out.println("He is impressed at your skills and invites you to join his crime gang.");
            System.out.println("Will you join him or turn him in?");
            System.out.println("(press enter to continue)");
            String enter8 = scanner.nextLine();
            
            D.burglarChoice();
        

    
}
        }
    
}
    public void fightLose(){
        
        if (ending6==false){
            EscapeFromSlchichlacht.game1.achievementsGained = EscapeFromSlchichlacht.game1.achievementsGained + 1;
        }
        ending6 = true;
        EscapeFromSlchichlacht.game1.lastEnding = 6;
        EscapeFromSlchichlacht.game1.ending();
        
    }
}