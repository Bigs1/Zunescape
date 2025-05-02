package main.java.com.zunescape.royale;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import main.java.com.zunescape.arenas.Arenas;
import main.java.com.zunescape.arenas.Tourneys;
import main.java.com.zunescape.player.Player;
import main.java.com.zunescape.royale.chat.Chat;
import main.java.com.zunescape.royale.util.Contestant;

public class BattleRoyale {

    private Chat box;

    private Arenas list;
    private Tourneys tournament;

    
    public BattleRoyale(Arenas list, Tourneys tournament, Chat box) {
        this.list = list;
        this.tournament = tournament;
        this.box = box;
    }

    public void battle(Set<Contestant> players, String AorTID) {
        if (tournament.hasInvite(AorTID) == true) {
            System.out.println("Valid Invite. Loading.");
            tournament.loadTourneys(AorTID);
            System.out.println("You Win!");
        } else {
            list.loadArena(AorTID);
            
            System.out.println("Welcome to " + AorTID);
        
            Contestant winner = BattleRoyale.selectRandom(players);

            box.post(players, winner , "Hello World");
      
            // get the element at random number index
            System.out.println("Winning player: "+ winner.getPUID());
        }

    }


    //commence getting that random winner
    public static Contestant selectRandom(Set<Contestant> contestants) {
        int size = contestants.size();
        int item = new Random().nextInt(size);
        int i = 0;
        for(Contestant contestant : new ArrayList<Contestant>(contestants)) {
            if (i == item)
                return contestant;
            i++;
        }
        return null;
}
}