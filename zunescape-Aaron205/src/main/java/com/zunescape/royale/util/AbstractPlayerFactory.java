package main.java.com.zunescape.royale.util;

import java.util.Set;

import main.java.com.zunescape.player.Player;

public interface AbstractPlayerFactory {
    //2 methods user getPrimaryPlayer, set users selectPlayersWhere

    Player getPrimaryPlayer(); //shouldnt be impimented/defined here
    
   default public Set<Player> selectPlayersWhere(String[] params){
    return Set.of();
   }

}
