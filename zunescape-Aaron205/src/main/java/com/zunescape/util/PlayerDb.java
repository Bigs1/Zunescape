package main.java.com.zunescape.util;

import java.util.HashSet;
import java.util.Set;

public class PlayerDb {

    Set<String> items = new HashSet<>();
    
    public boolean addItem(String item){
        items.add(item);
        return true;
    }
    
    public Set<String> getItems() {
       return items;
    }

    public int inventorysize(){
        return items.size(); //made a method to get the size so i can convert to an array
    }

}
