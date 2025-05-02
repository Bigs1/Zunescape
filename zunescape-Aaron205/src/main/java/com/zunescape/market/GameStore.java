package main.java.com.zunescape.market;

import java.util.Scanner;

import main.java.com.zunescape.util.PlayerDb;

public class GameStore {

    private PlayerDb database;

    public GameStore(PlayerDb database) {
        this.database = database;
    }

    public void enter() {

        Scanner scanner = new Scanner(System.in); // Our scanner is implemented

        int input = 99;

        while (input != 7) { // if our initial input is 6, then we dont even go into the loop
            System.out.println(
                    "Select soemthing to purchase:"
                            + "\n1) Cloak of Invisibility"
                            + "\n2) Orb of Sarumon's Gaze"
                            + "\n3) Sweet_Tart"
                            + "\n4) Grandpa's_Gun"
                            + "\n5) Candy_Key"
                            + "\n6) 2_Bags_of_Holding(You_know_what_to_do)"
                            + "\n7) Exit");

            input = scanner.nextInt();
            if (input == 1) {
                database.addItem("Cloak of Invisibility");
                System.out.println("Purchaced");
            } else if (input == 2) {
                database.addItem("Orb of Sarumon's Gaze");
                System.out.println("Purchaced");
            } else if (input == 3) {
                database.addItem("Sweet Tart");
                System.out.println("Purchaced");
            } else if (input == 4) {
                database.addItem("Grandpa's Gun");
                System.out.println("Purchaced");
            } else if (input == 5) {
                database.addItem("Candy Key");
                System.out.println("Purchaced");
            } else if (input == 6) {
                database.addItem("2 Bags of Holding");
                System.out.println("Purchaced");
            } else if (input == 7) {
                break;
            } else {
                System.out.println("Try Again: Input one of the number options listed.");
            }
        }
    }
}
