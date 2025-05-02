package main.java.com.zunescape.character;

import java.util.Scanner;

import main.java.com.zunescape.util.PlayerDb;

public class CharacterMenu {
    
    Scanner scanner = new Scanner(System.in); // Our scanner is implemented
    private PlayerDb itemlist;

    public CharacterMenu(PlayerDb itemlist) {
        this.itemlist = itemlist; //houses all our items
    }

    public void open() {
        
        System.out.println("Select an item to equip, leave by typing \"exit:\"");
        System.out.println(itemlist.getItems()); // print out our return value for get items

        String choice = "a";
        while(!choice.equals("exit")){
            System.out.println("Type \"exit\" to leave.");
            choice = scanner.nextLine();
        if (this.itemlist.getItems().contains(choice)) {
            System.out.println("Equiped: " + choice);
        }
        else{
            System.out.println("That's not an option, try again.");
        }
    }

        
    }
        //String[] inventory = new String[itemlist.inventorysize()];

        /*int counter = 1;
        for(String item : this.itemlist.getItems()){
            System.out.printf("%d) %s\n", counter++, item);
        } //trying to use an enahced for loop to go through the set and get our items to an array
        */
    

}
