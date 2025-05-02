package main.java.com.zunescape.arenas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Tourneys {

    private int tinvite;

    Map<Integer, String> map = new HashMap<>(); // While adding our tourneys, we add our invite code and its
                                                // coresponding tourney to this hashmap


    public String addTourney(String tourney) {
        System.out.println("Tourney name: ");
        System.out.println(tourney);
        System.out.println("Tourney invite code: ");
        tinvite = tourney.hashCode();
        System.out.println(tinvite);
        map.put(tinvite, tourney);// We are going to stor\e our tourneys and associated invites in our map
        return tourney;
    }

    boolean value; // method didnt like return statements in the if, if else statements so here's
                   // our work around.

    public boolean hasInvite(String invite) {

        try{
        int invitecode = Integer.parseInt(invite);

        if (map.containsKey(invitecode)) { // if our invite , tourney maplist contains our invite code (which is our key),
                                       // return true
            System.out.println("This invite does exist, please wait");
            value = true;
        } else if (invite == null || !map.containsKey(invitecode)) { // if our list doenst contain the invite code, return
                                                                // false
            value = false;
        }
    }
    catch(NumberFormatException nFormatException){
        value = false;
    }
        return value;
 
    }

    
    String output; // for return below

    public String loadTourneys(String arena) {

        // iterate each entry of hashmap
        for (Entry<Integer, String> entry : map.entrySet()) { // goes through what is considered a copy of our hashmap.
                                                              // " : " goes through each node

            // if the arena is equal to the arena from entry print the corresponding arena
            if (entry.getValue() == arena) {
                System.out.println("Arena found: " + arena);//our testing print
                output = arena;
            }
        }
        System.out.println("Welcome to the Tournament: " + arena);
        return output;
    }
}
