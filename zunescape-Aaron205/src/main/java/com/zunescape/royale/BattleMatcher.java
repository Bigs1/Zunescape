package main.java.com.zunescape.royale;
import java.util.HashSet;
import java.util.Set;

import main.java.com.zunescape.arenas.Arenas;
import main.java.com.zunescape.player.Player;
import main.java.com.zunescape.royale.util.AbstractPlayerFactory;
import main.java.com.zunescape.royale.util.Contestant;

public class BattleMatcher implements AbstractPlayerFactory {

    private Player primary;

    public BattleMatcher(Player primary) {
        this.primary = primary;
    }

    @Override
    public Player getPrimaryPlayer() {
        return primary;
    }

    public Set<Player> selectPlayersWhere(String[] params) {
        String arenaName = ""; //this should give us the default ""
        for (String param : params) {
            if (param.startsWith("ARENA=")) {
                arenaName = param.split("=")[1];
                break;
            }
        }
        return findContestants(arenaName);
    }

    public Set<Player> findContestants(String arena) {
        Set<Player> contestants = new HashSet<>();
        contestants.add(new Contestant("Ani", 17));
        contestants.add(new Contestant("Rex", 14));
        contestants.add(new Contestant("Killgore", 15));
        System.out.println("Contestants found ");
        return contestants;
    }
}
