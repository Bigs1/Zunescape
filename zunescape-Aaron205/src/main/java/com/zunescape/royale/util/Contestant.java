package main.java.com.zunescape.royale.util;
import java.util.Scanner;
import java.util.UUID;

import main.java.com.zunescape.player.Player;

public class Contestant implements Player {

    private String UID;
    private int ELO;
    private String username;
    
    Scanner scanner = new Scanner(System.in); //Our scanner is implemented

    public Contestant(String username, int ELO){
        this.username = username;
        this.UID = UUID.randomUUID().toString(); //making our input the persons name
        this.ELO = ELO;

        System.out.println("Contestent joined");
    }
    
    public String getPUID(){
        return UID;
    }

    public String getUserName(){
        return username;
        
    }

    public int getELO(){
        return ELO;
    }

    public static Contestant ContestantFrom(Player player) {
        if (player instanceof Contestant) {
            return (Contestant) player; // returns the player type cast as a contestant
        } else {
            // create a new contestant with default elo
            return new Contestant(player.getPUID(), 800);
        }
    }

}
