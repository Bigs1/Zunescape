package main.java.com.zunescape.app;

import java.util.Scanner;

import main.java.com.zunescape.arenas.Arenas;
import main.java.com.zunescape.arenas.Forge;
import main.java.com.zunescape.arenas.Tourneys;
import main.java.com.zunescape.auth.AuthSession;
import main.java.com.zunescape.character.CharacterMenu;
import main.java.com.zunescape.market.GameStore;
import main.java.com.zunescape.market.PlayerExchange;
import main.java.com.zunescape.player.Player;
import main.java.com.zunescape.royale.BattleMatcher;
import main.java.com.zunescape.royale.BattleQueue;
import main.java.com.zunescape.royale.BattleRoyale;
import main.java.com.zunescape.royale.chat.Chat;
import main.java.com.zunescape.royale.util.Contestant;
import main.java.com.zunescape.royale.util.RangeValidator;
import main.java.com.zunescape.util.PlayerDb;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static int getNextInt() {
         return Integer.parseInt(scanner.nextLine());
    }

    public static String getNextLine() {
        return scanner.nextLine();
    }

    public static void main(String[] args) {

        Player player;

        Arenas arenas = new Arenas();
        //BattleMatcher battlematcher = new BattleMatcher();
        Tourneys tournament = new Tourneys();
        Chat chat = new Chat(new RangeValidator()); // creating a new Range validator as its default ChatDecorator
        BattleRoyale battleroyale = new BattleRoyale(arenas, tournament, chat); //replacing box with chat so it has its own range validator.
        //BattleQueue bq = new BattleQueue(arenas, battlematcher, battleroyale);
        Forge forge = new Forge(arenas, tournament);
        PlayerDb db = new PlayerDb();
        GameStore store = new GameStore(db);
        PlayerExchange exchange = new PlayerExchange(db);
        CharacterMenu cm = new CharacterMenu(db);
        
        int input = 0;

        //we can do our initial authentication at the beginning here because we do not want to loop the authentication process.
        //AuthSession.getSession(); //get our session, create new one if one doesnt already exist
        
        /* (Done) need to define type after i figure out what type we are returning */ 
        player = AuthSession.getSession().auth(); //authenticate the user when he logs in

        //moved line here since player username will be the string name we will pass into contestant to get the new contestant
        //Player contestant = new Contestant (player.getUserName(), 15); //we might want to repace this with our authenticated user
                                                                      //Problem, our authenticated user doesnt come with an ELO
        

        while(input != 6){ //if our initial input is 6, then we dont even go into the loop
            //print main menu options below
        System.out.println(
            "Welcome to Ze Wilds of Zunescape!"
            +"\nWhat would you like to do?"
            +"\n1) Battle"
            +"\n2) Forge"
            +"\n3) Purchace"
            +"\n4) Trade"
            +"\n5) Accessorize"
            +"\n6) Quit");
    
            input = getInput();
            
            if(input == 1 ){
                System.out.println("Prepping For Battle");
                new BattleQueue(arenas, new BattleMatcher(player), battleroyale).enqueue(); //may need to change this to pass in our player
            }
            else if(input == 2 ){
                System.out.println("Entering the Forge");
                forge.enter();
            }
            else if(input == 3 ){
                System.out.println("Purchace");
                store.enter();
            }
            else if(input == 4 ){
                System.out.println("Trade");
                exchange.enter();
            }
            else if(input == 5 ){
                System.out.println("Accessorize");
                cm.open();
            }
            else if(input == 6 ){
                System.out.println("Exiting");
            }
            else{
                System.out.println("Try Again: Input one of the number options listed.");
            }
        }
        
        }

        public static int getInput(){
            Scanner scanner = new Scanner(System.in); //Our scanner is implemented
            int input = Integer.parseInt(scanner.nextLine());
            return input;
        }

        /*
        BattleQueue bq = new BattleQueue();
        Forge fg = new Forge(); //will only let me make static calls and wants to put inputs as null
         */
  }