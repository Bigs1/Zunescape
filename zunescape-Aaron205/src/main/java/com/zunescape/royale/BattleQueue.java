package main.java.com.zunescape.royale;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import main.java.com.zunescape.arenas.Arenas;
import main.java.com.zunescape.player.Player;
import main.java.com.zunescape.royale.util.AbstractPlayerFactory;
import main.java.com.zunescape.royale.util.Contestant;

public class BattleQueue {

    private Arenas arenas;
    private AbstractPlayerFactory battlematcher;
    private BattleRoyale battleroyale;
    Scanner scanner = new Scanner(System.in); //Our scanner is implemented

    public BattleQueue(Arenas arenas, BattleMatcher battlematcher, BattleRoyale battleroyale){
        this.arenas = arenas; //gives access to arenas
        this.battlematcher = battlematcher; //gives access to the batlle mathcer
        this.battleroyale = battleroyale; //gives access to the battle royale
    }


    public void enqueue(){

        System.out.println("Do you have a tourney and invite? y/n?");

        char selection = scanner.nextLine().charAt(0);

        while(selection != 'y' || selection != 'n'){

        if(selection == 'y'){
            
            System.out.println("Please Enter Invite code: ");
            String invitecode = scanner.nextLine();

            battleroyale.battle(Set.of(Contestant.ContestantFrom(this.battlematcher.getPrimaryPlayer())),invitecode);
        }

        else if (selection == 'n'){
        String arena = selectArena(); //use the arena that is returned by selectArena();
        
        Set<Player> players = battlematcher.selectPlayersWhere(new String[] {String.format("ARENA=%s", arena)});

        //Battle matcher to get our contestants taking in the contestant and selected arena (selection var.)
        Set<Contestant> contestants = players.stream().map(Contestant::ContestantFrom).collect(Collectors.toSet()); 

        //Battle royale method taking in the players and arenas of same elo and map choice and putting them in the same map
        battleroyale.battle(contestants, arena); 
        }
        else{
            System.out.println("Please try again");
        }
        selection = scanner.next().charAt(0);
    }
    }

    private String selectArena(){
        
        System.out.println("Please select and arena from among the following:");

        Set<String> maplist = arenas.getArenas(); 

        System.out.println(maplist);

        String selection = scanner.nextLine();

        if(maplist.contains(selection)){
            System.out.println("Going to: " + selection); //our testing print statement, if entered properly, print it and return
        }
        else{
            scanner.reset(); //reset the selection or else it would print the typos at the end
            selectArena(); //if not then go through map selection process again
        }

        return selection;

    }
}

