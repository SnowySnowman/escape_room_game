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
public class hospital {
    
    public boolean ending1; //Die from starvation of waiting for too long
    public boolean ending2; //Die from not starting a riot
    public boolean ending3; //Die from losing fight with hospital
    public boolean ending4; //Win hospital fight
    public boolean ending5; //Win burglar fight and join the mafia
    public boolean ending6; //Die from losing fight with burglar
    public boolean ending7; //Die from being framed by the burglar
    public boolean ending8; //Live in friend's house
    public boolean ending9; //Die from being stuck in the attic
    Draft11 myDraft11;
    
    Scanner scanner = new Scanner (System.in);
    hospitalName myHospitalName = new hospitalName();
    
    
    public hospital (){
        boolean valid = false;
        
        System.out.println("Which weapon will you choose?");
        System.out.println("Scalpel");
        System.out.println("Drill");
        
        while (valid == false){
        
        String input = scanner.nextLine();
        
        switch(input){
            case ("Scalpel"):
                System.out.println("You chose the scalpel!");
                System.out.println("which attack will you do?");
                System.out.println("quick attack");
                String input2 = scanner.nextLine();
                
                switch(input2){
                    case ("quick attack"):
                        valid = true;
                        break;
                    default:
                        System.out.println("Please type in exact attack name!");
                        break;
                }
                System.out.println("You used quick attack with the scalpel!");
                System.out.println("The doctor got very small damage!");
                System.out.println("(click enter to continue)");
                String input3 = scanner.nextLine();
                
                System.out.println("The doctor used his skill 'steal'!");
                System.out.println("The doctor snatched your scalpel!");
                
                System.out.println("which attack will you do?");
                System.out.println("quick attack");
                String input4 = scanner.nextLine();
                
                switch(input4){
                    case ("quick attack"):
                        valid = true;
                        break;
                    default:
                        System.out.println("Please type in exact attack name!");
                }
                
                System.out.println("You used quick attack!");
                System.out.println("The doctor dodged your attack!");
                System.out.println("(click enter to continue)");
                String input5 = scanner.nextLine();
                System.out.println("The doctor used 'disection'!");
                System.out.println("You fainted forever...");
        
                if (ending3==false){
                    EscapeFromSlchichlacht.game1.achievementsGained = EscapeFromSlchichlacht.game1.achievementsGained + 1;
                }
                
                ending3 = true;
                EscapeFromSlchichlacht.game1.achievementsGained = EscapeFromSlchichlacht.game1.achievementsGained + 1;
                EscapeFromSlchichlacht.game1.lastEnding = 3;
                EscapeFromSlchichlacht.game1.ending();
            break;
            
            case("Drill"):
                System.out.println("You chose the drill!");
                System.out.println("which attack will you do?");
                System.out.println("quick attack");
                String input6 = scanner.nextLine();
                
                switch(input6){
                    case ("quick attack"):
                        valid = true;
                        break;
                    default:
                        System.out.println("Please type in exact attack name!");
                }
                
                System.out.println("You used quick attack with your drill!");
                System.out.println("The doctor fainted!");
                
                
                System.out.println("(click enter to continue)");
               
                String enter = scanner.nextLine();
                System.out.println("You successfully took over the hospital!");
                System.out.println("Your fellow rioters have appointed you as a leader!");
                
                if (ending4==false){
                    EscapeFromSlchichlacht.game1.achievementsGained = EscapeFromSlchichlacht.game1.achievementsGained + 1;
                }
                
                ending4 = true;
                EscapeFromSlchichlacht.game1.achievementsGained = EscapeFromSlchichlacht.game1.achievementsGained + 1;
                EscapeFromSlchichlacht.game1.lastEnding = 4;
                EscapeFromSlchichlacht.game1.ending();
                break;
                
            default:
                System.out.println("Please type in exact weapon name!");
                break;
                
        }
        }
        
    
}

}
