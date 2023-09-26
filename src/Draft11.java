package escape.from.slchichlacht;

import java.util.Scanner;

public class Draft11 {

            //defining the variables

            //achievements
            int achievementsGained;
            public boolean ending1; //Die from starvation of waiting for too long
            public boolean ending2; //Die from not starting a riot
            public boolean ending3; //Die from losing fight with hospital
            public boolean ending4; //Win hospital fight
            public boolean ending5; //Win burglar fight and join the mafia
            public boolean ending6; //Die from losing fight with burglar
            public boolean ending7; //Die from being framed by the burglar
            public boolean ending8; //Live in friend's house
            public boolean ending9; //Die from being stuck in the attic
            int lastEnding; //this determines the ending message in the ending() class

            //pre game
            boolean gamePlayed;

            //inventory and etc.
            boolean key;
            boolean keyTaken;
            boolean phone;
            boolean phoneTaken;

            String name;

            int wait;

            int wearingSomething;
            
    
            //importing scanner
            Scanner scanner = new Scanner(System.in);
            
            

    public Draft11(){
            //giving all variables a value

            //achievements
            achievementsGained = 0;
            ending1 = false;
            ending2 = false;
            ending3 = false;
            ending4 = false;
            ending5 = false;
            ending6 = false;
            ending7 = false;
            ending8 = false;
            ending9 = false;

            lastEnding = 0;

            //pre game
            gamePlayed = false;

            //game inventory
            key         = false;
            keyTaken    = false;
            phone       = false;
            phoneTaken  = false;

            name = "";
    
            wait = 1;
    
            wearingSomething = 1;
    }

    public void intro(){
        
        //this var is used to loop if player enters invalid input
        //I think these booleans have to go to the pubic Draft11.
        boolean valid = false;
        boolean valid1 = false;
        boolean valid2 = false;
        
        key         = false;
        keyTaken    = false;
        phone       = false;
        phoneTaken  = false;
    
        wait = 1;
    
        wearingSomething = 1;
        
        

        System.out.println("Welcome to Escape from Slchichlacht!");
        System.out.println("Type 1 to start the game");
        System.out.println("Type 2 to see your achievements");

        while (valid == false){
            String enter = scanner.nextLine();
            switch (enter){  
                case "2":
                System.out.print("You have completed " + achievementsGained + "/9 achievements! ");
                if (achievementsGained >= 9){System.out.println(" You like this game more than the creators...");}
                else if (achievementsGained >= 6){System.out.println("How bored are you?");}
                else if (achievementsGained >= 3){System.out.println("Mhm, could be better.");}
                else if (achievementsGained >= 1){System.out.println("Still a long way to go!");}
                else {System.out.println(" Go play the game first!");}
                System.out.println("(press enter to continue)");
                String enter1 = scanner.nextLine();
                valid = true;
                intro();
                break;
                case "1":

                //the intro of the intro only plays if this is the first time the player has played this game
                if (gamePlayed==false){
                    System.out.println("Welcome, young one! Before we start, what is your name?");
                    System.out.println("(enter your name to continue)");
                    String name = "";
                    while (valid1 == false){
                        name = scanner.nextLine();
                        if (name.length()<1){System.out.println("Please enter something!");} else {valid1 = true;}
                    }
                    System.out.println(name + "?! That's a horrible name, I hate it! I shall call you Grublub instead.");
                    System.out.println("(press enter to continue)");
                    enter1 = scanner.nextLine();
                    gamePlayed = true;
                }

                System.out.println("You slowly open your eyes and take a deep breath. With trembling hand, you grab the exam paper and turn to the very last page, to check your mark. 2. 2 out of 7.");
                System.out.println("Like you knew what was going to happen, you pack up walk out of the classroom.");
                System.out.println("(press enter to continue)");
                enter1 = scanner.nextLine();
                System.out.println("Meanwhile, your mum, Slchichlacht, is waiting for you at home. As soon as you walk in, your mum gets up from the sofa and asks your grade for Computer Science. ");
                System.out.println("You shakes your head as a meaning of 'failed', and suddenly, your mum grabbed your left ear firmly, with her right hand, saying,");
                System.out.println("'Grublub, how dare you fail that subject again! You have to get punished today, hey?!'");
                System.out.println("(press enter to continue)");
                enter1 = scanner.nextLine();
                System.out.println("She slammed the door of your room open and then locked you inside the room. You left ear is still red and hot.");
                valid = true;
                System.out.println("(press enter to continue)");
                enter1 = scanner.nextLine();
                doSomething();
                break;
                default:
                System.out.println("Invalid input. Did you make a typo?");
            }
        }
    }

    public void doSomething(){

        //this var is used to loop if player enters invalid input   
        boolean valid = false;
        /*the value of this var is not used in the code, this var exists to let the code continue
        after the user has input something i.e. (press enter to continue)
        */
        String enter2 = "";

        System.out.println("You look around your tiny old room. You see no way out except the locked door...");
        System.out.println("What will you do to escape?");
        System.out.println("(type the number next to the action to choose that action)");
        System.out.println("    1 search room");
        System.out.println("    2 open window");
        System.out.println("    3 open door");
        System.out.println("    4 wait");
        if (phone == true && phoneTaken == false){System.out.println("    5 use phone");}

        while (valid == false){
            name = scanner.nextLine();
            switch (name){
                case "1":
                searchRoom();
                valid = true;
                break;
                case "2":
                openWindow();
                valid = true;
                break;
                case "3":
                openDoor();
                valid = true;
                break;
                case "4":
                System.out.print("You twiddled your thumbs and waited a while. ");
                if (wait == 2 || wait == 3){
                    System.out.println("You are starting to get a little hungry...");
                    System.out.println("(press enter to continue)");
                    enter2 = scanner.nextLine();
                    wait = wait + 1;
                    doSomething();
                } else if (wait==4){
                    System.out.println("You are starting to feel dizzy with hunger...");
                    System.out.println("(press enter to continue)");
                    enter2 = scanner.nextLine();
                    wait = wait + 1;
                    doSomething();
                } else if (wait==5){
                    System.out.println("You become too hungry you die from starvation!");
                    if (ending1==false){achievementsGained=achievementsGained+1;}
                    lastEnding=1;
                    ending1 = true;
                    ending();
                } else {
                    System.out.println("(press enter to continue)");
                    enter2 = scanner.nextLine();
                    wait = wait + 1;
                    doSomething();
                }
                valid = true;
                break;
                case "5":
                if (phone == true && phoneTaken == false){System.out.print("You open the contact list on your phone.");usePhone(); valid = true;}
                else {System.out.println("Invalid input. Did you make a typo?");}
                break;
                default:
                System.out.println("Invalid input. Did you make a typo?");
            }
        }
    }

    public void searchRoom(){

        //this var is used to loop if player enters invalid input   
        boolean valid = false;
        boolean valid1 = false;
        /*the value of this var is not used in the code, this var exists to let the code continue
        after the user has input something i.e. (press enter to continue)
        */
        String enter3 = "";

        if ((phone == true && phoneTaken == false)&&(key == true && keyTaken == false)&&(wearingSomething != 1)){
            System.out.println("You already searched the room!");
            System.out.println("(press enter to continue)");
            enter3 = scanner.nextLine();
            doSomething();
            
        } else {
            System.out.println("You decide to search the room. Where will you search?");
            System.out.println("    1 on the desk");
            System.out.println("    2 under the bed");
            System.out.println("    3 in the closet");
            System.out.println("(type the number next to the action to do that action)");

            while (valid1 == false){
                String room = scanner.nextLine();
                switch (room){
                    case "1":
                        if (phone == false && phoneTaken == false){
                            System.out.println("You found your phone and put it in your pocket incase you need to call someone.");
                            phone = true;
                            System.out.println("(press enter to continue)");
                            enter3 = scanner.nextLine();
                            valid1 = true;
                            doSomething();
                        } else {
                            System.out.println("You already searched the desk!");
                            System.out.println("(press enter to continue)");
                            enter3 = scanner.nextLine();
                            valid1 = true;
                            searchRoom();
                        } break;
                    case "2":
                        if (key == false && keyTaken == false){
                           System.out.println("You found the key to your door! You kept the key in your pocket.");
                           System.out.println("(press enter to continue)");
                           enter3 = scanner.nextLine();
                           key = true;
                           valid1 = true;
                           doSomething();
                       } else {
                           System.out.println("You already searched under the bed!");
                           System.out.println("(press enter to continue)");
                           enter3 = scanner.nextLine();
                           valid1 = true;
                           searchRoom();
                       } break;
                   case "3":
                       if (wearingSomething == 1){
                           System.out.println("You opened your closet and found a helmet and a life jacket. It might be a good idea to wear something.");
                           System.out.println("What will you wear?");
                           System.out.println("    1 choose to wear nothing");
                           System.out.println("    2 wear the life jacket");
                           System.out.println("    3 wear the helmet");
                           System.out.println("(type the number next to the action to do that action)");
                            
                           while (valid == false){
                            String wear = scanner.nextLine();
                            switch (wear){
                                case "1":
                                    System.out.println("You decide to not wear the life jacket or the helmet.");
                                    valid = true;
                                    System.out.println("(press enter to continue)");
                                    enter3 = scanner.nextLine();
                                    doSomething();
                                    break;
                                case "2":
                                    System.out.println("You decide to wear the life jacket.");
                                    wearingSomething = 2;
                                    System.out.println("(press enter to continue)");
                                    enter3 = scanner.nextLine();
                                    valid = true;
                                    doSomething();
                                    break;
                               case "3":
                                    System.out.println("You decide to put on the helmet.");
                                    wearingSomething = 3;
                                    System.out.println("(press enter to continue)");
                                    enter3 = scanner.nextLine();
                                    valid = true;
                                    doSomething();
                                    break;
                               default:
                                    System.out.println("Invalid input. Did you make a typo?");
                               }
                           }
            
                        } else {
                            System.out.println("You're already wearing something from the closet!");
                            System.out.println("(press enter to continue)");
                            enter3 = scanner.nextLine();
                            doSomething();
                        } 
                valid1 = true;
                break;
                default:
                    System.out.println("Invalid input. Did you make a typo?");
               }
            }
        }
        
    }

    public void openDoor(){

        //this var is used to loop if player enters invalid input   
        boolean valid = false;
        boolean valid1 = false;
        /*the value of this var is not used in the code, this var exists to let the code continue
        after the user has input something i.e. (press enter to continue)
        */
        String enter4 = "";

        System.out.println("The door is locked!");
        if (key==true){
            System.out.println("Would you like to use the key?");
            System.out.println("Type 1 to use, type 2 to cancel.");
            while (valid==false){
                String answer = scanner.nextLine();
                switch (answer){
                    case "1":
                    System.out.println("You slowly unlock the door using the key you found.");
                    System.out.println("You see the stairs for the bottom floor, and ladders to the old attic. Which way will you choose?");
                    System.out.println("(Type the number next to the action to do that action)");
                    System.out.println("    1 ladder");
                    System.out.println("    2 stairs");
                        while (valid1 == false){
                            String answer1 = scanner.nextLine();
                            switch (answer1){
                                case "1":
                                System.out.println("You quietly climb the ladders to your attic. You close the entrance but then it gets pitch-black.");
                                System.out.println("You turn around to open the attic door but realise that the door locked itself from the outside.");
                                System.out.println("You don't make any noise incase your mum hears you. You give up all hope and starve in the dark attic.");
                                if (ending9 == false){achievementsGained = achievementsGained + 1;}
                                ending9 = true;
                                lastEnding = 9;
                                ending();
                                valid1 = true;
                                break;
                                case "2":
                                System.out.println("You quietly walk down the stairs and you suddenly slam face-first into your mum.");
                                System.out.println("She snatches the key away from you, sends you back to your room and locks your door.");
                                System.out.println("(press enter to continue)");
                                enter4 = scanner.nextLine();
                                key = false;
                                keyTaken = true;
                                doSomething();
                                valid1 = true;
                                break;
                                default:
                                System.out.println("Invalid input. Did you make a typo?");
                            }
                        }
                    valid = true;
                    break;
                    case "2":
                    System.out.println("You decide to not take the risk.");
                    System.out.println("(press enter to continue)");
                    enter4 = scanner.nextLine();
                    valid = true;
                    doSomething();
                    break;
                    default:
                    System.out.println("Invalid input. Did you make a typo?");
                }
            }
        } else {
            System.out.println("(press enter to continue)");
            enter4 = scanner.nextLine();
            doSomething();
        }
    }

    public void openWindow(){

        //this var is used to loop if player enters invalid input   
        boolean valid = false;
        boolean valid1 = false;
        /*the value of this var is not used in the code, this var exists to let the code continue
        after the user has input something i.e. (press enter to continue)
        */
        String enter5 = "";

        System.out.println("You open the window and look down. It's nighttime, so you can't see clearly.");
        System.out.println("However you know that there's a pool right underneath your window.");
        System.out.println("Will you jump out the window to escape?");
        System.out.println("(Type 1 to jump, type 2 to cancel)");
        while (valid==false){
            String answer = scanner.nextLine();
            switch (answer){
                case "1":
                switch (wearingSomething){
                    case 1:
                    System.out.println("You choose to jump into the pool. However, as you are falling down, you notice that the pool is empty.");
                    System.out.println("Then you remember that your mum mentioned about pool cleaning in the morning.");
                    System.out.println("You hit your head on the cold, dry pool tiles headfirst and fall into a coma.");
                    System.out.println("(press enter to continue)");
                    enter5 = scanner.nextLine();
                    System.out.println("Your mum finds out and sends you to the hospital, where you wake up again");
                    System.out.println("You're confined to a wheelchair and have to spend the next 2 months in rehab.");
                    System.out.println("(press enter to continue)");
                    enter5 = scanner.nextLine();
                    System.out.println("You look around the hospital and the conditions are looking bad.");
                    System.out.println("There is dirt on the floor, mold growing on the cracked walls, the nurses are rude, and worst of all, there is nothing to do.");
                    System.out.println("Your fellow patients don't look too happy as well. Would you like to start a riot?");
                    System.out.println("(Type 1 to start a riot, type 2 to cancel)");
                    while (valid1==false){
                        String answer1 = scanner.nextLine();
                        switch (answer1){
                            case "1":
                                riot();
                                valid1 = true;
                                break;
                            case "2":
                                System.out.println("You wait for countless days but soon you figure out that the hospital has never planned to release you anyways.");
                                System.out.println("You got a serious depression from lost of hope and it lead to you rejecting food. You starve and you die.");
                                if (ending2 == false){achievementsGained = achievementsGained + 1;}
                                ending2 = true;
                                lastEnding = 2;
                                ending();
                                valid1 = true;
                                break;
                            default:
                            System.out.println("Invalid input. Did you make a typo?");
                        }
                    }
                    break;
                    case 2:
                        System.out.println("You choose to jump into the pool. However, as you are falling down, you notice that the pool is empty.");
                        System.out.println("You slam onto the concrete ground but the life jacket somewhat protects you from the worst.");
                        System.out.println("You suffer a broken leg but slowly rise up. You can still walk, but with difficulty.");
                        System.out.println("(press enter to continue)");
                        enter5 = scanner.nextLine();
                        //lower attack and defense
                        escapeViaWindow();
                        break;
                    case 3:
                    System.out.println("You choose to jump into the pool. However, as you are falling down, you notice that the pool is empty.");
                    System.out.println("You realised that the pool was emptied yesterday, but thankfully your helmet has protected you from the fall.");
                    System.out.println("Suffering a mild headache, you get up and pray that your mum did not hear the fall.");
                    System.out.println("(press enter to continue)");
                    enter5 = scanner.nextLine();
                    escapeViaWindow();
                    break;
                    }
                    valid = true;
                    break;
                case "2":
                    System.out.println("You decide to not take the risk.");
                    System.out.println("(press enter to continue)");
                    enter5 = scanner.nextLine();
                    valid = true;
                    doSomething();
                    break;
                default:
                System.out.println("Invalid input. Did you make a typo?");
            }
        }
    }

    public void riot(){

        //this var is used to loop if player enters invalid input   
        boolean valid = false;
        boolean valid1 = false;
        /*the value of this var is not used in the code, this var exists to let the code continue
        after the user has input something i.e. (press enter to continue)
        */
        String enter5 = "";

        hospital myHospital = new hospital();
        
        while (valid==false){
            String answer = scanner.nextLine();
            switch (answer){
                case "1":
                    valid=true;
                    //attack and defense are not affected
                    //fight scene
                    //here, assume player loses for testing
                    if (ending3 == false){achievementsGained = achievementsGained + 1;}
                    ending3 = true;
                    lastEnding = 3;
                    ending();
                    break;
                case "2":
                valid = true;
                //attack increases by a lot
                //fight scene
                //here, assume player wins for testing
                if (ending4 == false){achievementsGained = achievementsGained + 1;}
                ending4 = true;
                lastEnding = 4;
                ending();
                break;
                default:
                System.out.println("Invalid input. Did you make a typo?");
            }
        }
        //fight stuff goes here


    }

    public void escapeViaWindow(){

        //this var is used to loop if player enters invalid input   
        boolean valid = false;
        boolean valid1 = false;
        boolean valid2 = false;
        /*the value of this var is not used in the code, this var exists to let the code continue
        after the user has input something i.e. (press enter to continue)
        */
        
        //boolean for deciding Fight class
        boolean shovel = false;
        
        
        String enter5 = "";

        System.out.println("You look around and find a hole in your fence that leads to your neighbour's house.");
        System.out.println("There is a metal shovel beside your dad's garden. It might come in handy for some situations.");
        System.out.println("Would you like to take the shovel?");
        System.out.println("(Type 1 to take the shovel, type 2 to cancel)");
        while (valid==false){
            String answer = scanner.nextLine();
            switch (answer){
                case "1":
                    System.out.println("You picked up the shovel!");
                    System.out.println("(press enter to continue)");
                    enter5 = scanner.nextLine();
                    shovel = true;
                    valid = true;
                    break;
                case "2":
                    System.out.println("You didn't pick up the shovel.");
                    System.out.println("(press enter to continue)");
                    enter5 = scanner.nextLine();
                    shovel = false;
                    valid = true;
                    break;
                default:
                    System.out.println("Invalid input. Did you make a typo?");
            }
        }    
        System.out.println("Do you want to escape to your neighbour's house from the hole in the fence, or try to escape from your front door?");
        System.out.println("(type the number next to the action to choose that action)");
        System.out.println("    1 neighbour's house");
        System.out.println("    2 front door");
        while (valid1==false){
            String answer1 = scanner.nextLine();
            switch (answer1){
                case "1":
                System.out.println("You crawl under the hole in the fence and peek into the neighbour's house.");
                System.out.println("Suddenly, you feel like somebody is staring back at you. You realise you are interrupting a burglary!");
                System.out.println("You have an uncomfortable feeling in your gut. What will you do?");
                System.out.println("(type the number next to the action to choose that action)");
                System.out.println("    1 fight burglar");
                System.out.println("    2 reason with burglar");
                System.out.println("    3 wait");
                if (phone == true && phoneTaken == false){System.out.println("    4 use phone");}
                while (valid2==false){
                    String answer2 = scanner.nextLine();
                    switch (answer2){
                        case "1":
                        //fight scene
                            burglarName BName = new burglarName();
                            BName.burglarName();
                            if (shovel == true){
                                FightS myFightS = new FightS();
                                myFightS.fightStartS();
                            }else {
                                Fight myFight = new Fight();
                                myFight.fightStart();
                            }

                            ending();
                            valid2 = true;
                            break;
                        case "2":
                            System.out.println("You refuse to start a brawl, and try to calm him down.");
                            System.out.println("However, he gets enraged and stabs you with his kitchen knife. You bleed to death on your neighbour's backyard.");
                            valid2 = true;
                            if (ending6 == false){achievementsGained = achievementsGained + 1;}
                            ending6 = true;
                            lastEnding = 6;
                            ending();
                            break;
                        case "3":
                            System.out.println("You refuse to start a brawl, and instead sit down and start to meditate.");
                            System.out.println("However, he gets enraged and stabs you with his kitchen knife. You bleed to death on your neighbour's backyard.");
                            valid2 = true;
                            if (ending6 == false){achievementsGained = achievementsGained + 1;}
                            ending6 = true;
                            lastEnding = 6;
                            ending();
                            break;
                        case "4":
                            if (phone == true && phoneTaken == false){
                                System.out.println("You report to the police about this burglar.");
                                System.out.println("He immediately realises what you are trying to do, and knocks the phone out of your hand.");
                                System.out.println("He uses your phone to call the police and frame you as the real burglar");
                                System.out.println("The police trusted the burglar and send you to life sentence in isolation.");
                                if (ending7 == false){achievementsGained = achievementsGained + 1;}
                                ending7 = true;
                                lastEnding = 7;
                                valid2 = true;
                                ending();
                            }
                            else {System.out.println("Invalid input. Did you make a typo?");}
                            break;
                            default:
                            System.out.println("Invalid input. Did you make a typo?");
                        }
                    }
                    valid1 = true;
                    break;
                case "2":
                System.out.println("You choose to go through the front gate instead of going through the dirty, muddy hole.");
                System.out.println(" However, what you meet in front of the front gate was your violent dad, not your freedom.");
                System.out.println("Your dad notices that you are trying to escape from the house, immediately.");
                System.out.println("Then very naturally, he takes away your phone from your pocket and send you back to your room.");
                System.out.println("You are back to your room, but you don't have your phone.");
                phone = false;
                phoneTaken = true;
                valid1 = true;
                doSomething();
                break;
                default:
                System.out.println("Invalid input. Did you make a typo?");
            }
        }
    }

    public void usePhone(){
        //this var is used to loop if player enters invalid input   
        boolean valid = false;
        boolean valid1 = false;
        boolean valid2 = false;
        /*the value of this var is not used in the code, this var exists to let the code continue
        after the user has input something i.e. (press enter to continue)
        */
        String enter5 = "";

        System.out.println("Who will you call?");
        System.out.println("(type the number next to the person to call that person, type 5 to cancel)");
        System.out.println("    1 mum");
        System.out.println("    2 dad");
        System.out.println("    3 friend ");
        System.out.println("    4 police");
        System.out.println("    5 cancel");
        while (valid==false){
            String answer = scanner.nextLine();
            switch (answer){
                case "1":
                System.out.println("I don't think that's a good idea...");
                System.out.println("(press enter to continue)");
                enter5 = scanner.nextLine();
                valid=true;
                usePhone();
                break;
                
                case "2":
                System.out.println("You call your dad and rant to him about your mum's punishment, but he snitched on you and told her!");
                System.out.println("Your mum took away your phone.");
                System.out.println("(press enter to continue)");
                enter5 = scanner.nextLine();
                phone=false;
                phoneTaken=true;
                valid=true;
                doSomething();
                break;
                
                case "3":
                    valid=true;

                System.out.println("You call your best friend, Freeman. However he doesn't believe you!");
                System.out.println("Will you try to convince him again? (yes/no)");

                while(valid1==false){
                    String answer1 = scanner.nextLine().toLowerCase();
            
                    if (answer1.length()<1){System.out.println("Please enter something!");} 
                    else if(answer1.charAt(0)==('y')){
                        valid=true;
                        System.out.println("He still thinks you're kidding! Will you attempt to ask for help one last time? (yes/no)");
                        
                        while (valid2==false){
                            String answer2 = scanner.nextLine().toLowerCase();
                            if (answer2.length()<1){System.out.println("Please enter something!");} 
                            else if (answer2.charAt(0)==('y')){
                                valid2=true;
                                System.out.println("Your friend, a human rights activist, now believes you!");
                                System.out.println("Soon, your house is filled with his activist friends, and you get taken to his house to live together until you graduate.");
                                if (ending8 == false){
                                    achievementsGained = achievementsGained + 1;
                                }
                                ending8 = true;
                                lastEnding = 8;
                                ending();
                            } else if (answer2.charAt(0)==('n')){
                                valid2=true;
                                System.out.println("You hung up the call."); 
                                doSomething();
                            } else {System.out.println("Invalid input. Did you make a typo?");}
                        }
                    }
                    else if(answer1.charAt(0)==('n')){valid=true;System.out.println("You hung up the call."); doSomething();}
                    else {System.out.println("Invalid input. Did you make a typo?");}
                    }
                break;
                    
                case "4":
                valid=true;
                System.out.println("You call the police and you explain the situation, but you get a lecture on why prank calls aren't funny...");
                System.out.println("(press enter to continue)");
                enter5 = scanner.nextLine();
                doSomething();
                break;
                
                case "5":
                doSomething();
                valid=true;
                break;
                
                default:
                System.out.println("Invalid input. Did you make a typo?");
            }
        }
}


    public void ending(){
        //this var is used to loop if player enters invalid input   
        boolean valid = false;

        /*the value of this var is not used in the code, this var exists to let the code continue
        after the user has input something i.e. (press enter to continue)
        */
        

        System.out.println("(press enter to continue)");
        String enter5 = scanner.nextLine();

        switch (lastEnding){
            case 1:
                System.out.println("How did you lose? The game isn't that hard.");
                break;

            case 2:
                System.out.println("How did you lose? The game isn't that hard.");
                break;

            case 3:
                System.out.println("How did you lose? The game isn't that hard.");
                break;

            case 4:
                System.out.println("Congratulations on the win, Grublub!");
                break;

            case 5:
                System.out.println("Congratulations on the win, Grublub!");
                break;

            case 6:
                System.out.println("How did you lose? The game isn't that hard.");
                break;

            case 7:
                System.out.println("How did you lose? The game isn't that hard.");
                break;

            case 8:
                System.out.println("Congratulations on the win, Grublub!");
                break;

            case 9:
                System.out.println("How did you lose? The game isn't that hard.");
                break;

            default:
                System.out.println("This is for debugging");
                break;
        }
        
        System.out.println("Would you like to play again? (yes/no)");

        while(valid==false){
        String answer1 = scanner.nextLine().toLowerCase();

        if (answer1.length()<1){System.out.println("Please enter something!");} 
        else if(answer1.charAt(0)==('y')){
            intro();
            valid = true;
        }
        else if(answer1.charAt(0)==('n')){
            valid=true;
            System.exit(0);
        }
        else {
            System.out.println("Invalid input. Did you make a typo?");
        }
        }
    }
    
    public void burglarChoice(){
        System.out.println("join");
        System.out.println("reject");

        String choice = scanner.nextLine();
        switch (choice){
        case("join"):
            System.out.println("You choose to join the gang!");
            System.out.println("You tell him that you would like to join, and then follow him to the crime gang's building.");
            System.out.println("It is huge, but fairly new.");
            System.out.println("As you step in, you see a big logo in the middle of the lobby.");
            System.out.println("You realise that it is one of the most famous mafia in your city.");
            System.out.println("You walk through the hall without any hesitation. And this, was the start of your new life.");
            System.out.println("THE END");

            if (ending5 == false){
                achievementsGained = achievementsGained + 1;
            }

            ending5 = true;
            lastEnding = 5;
            ending();
            break;
        case("reject"):
            System.out.println("You reject his proposal!");
            System.out.println("You reject the offer and right after you reject it, you see the burglar stabbing you with the kitchen knife he was holding.");
            System.out.println("You bleed to death on your neighbour's backyard.");
            System.out.println("THE END");

            if (ending6 == false){
                achievementsGained = achievementsGained + 1;
            }

            ending6 = true;
            lastEnding = 6;
            ending();
            break;
            }
    }

    public void template(){

        //valid answer template
        boolean valid = false;
        while (valid==false){
            String answer = scanner.nextLine();
            //switch case goes here
        }

        //switch template
        int var = 1;
        switch (var){
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid input. Did you make a typo?");
        }
    }    



}