package main.java.com.zunescape.arenas;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Arenas {

    Set<String> maps = new HashSet<String>();

    public Set<String> getArenas() {

        // List the names of the areanas to choose from below

        maps.add("Oasis");
        maps.add("Nirvana");
        maps.add("Coruscant");

        System.out.println("Maps found");
        
        return maps;
    }

    public void addArena(String arena) {
            maps.add(arena); // convert our arenas from Type Arenas to string
            //unsure how to store in memory, never wored with it before, internet guides unhelpful
    }
    public boolean loadArena(String arena){
        return true;
    }


}
