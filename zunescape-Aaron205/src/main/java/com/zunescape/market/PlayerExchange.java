package main.java.com.zunescape.market;

import java.util.Scanner;

import main.java.com.zunescape.util.PlayerDb;

public class PlayerExchange {

    private PlayerDb database;

    public PlayerExchange(PlayerDb database) {
        this.database = database;
    }

    public void enter() {

        Scanner scanner = new Scanner(System.in); // Our scanner is implemented

        int input = 99;

        while (input != 7) { // if our initial input is 6, then we dont even go into the loop
            // int input = scanner.nextInt();
            System.out.println(
                    "Select soemthing to purchase:"
                            + "\n1) Stick"
                            + "\n2) Silk"
                            + "\n3) Rocks"
                            + "\n4) Horse Shoe & Hand Grenades"
                            + "\n5) Tastey Sandwich"
                            + "\n6) Fire Cracker"
                            + "\n7) Exit");

            input = scanner.nextInt();

            if (input == 1) {
                database.addItem("Stick");
                System.out.println("Obtained");
            } else if (input == 2) {
                database.addItem("Silk");
                System.out.println("Obtained");
            } else if (input == 3) {
                database.addItem("Rocks");
                System.out.println("Obtained");
            } else if (input == 4) {
                database.addItem("Horse Shoe & Hand Grenades");
                System.out.println("Obtained");
            } else if (input == 5) {
                database.addItem("Tastey Sandwich");
                System.out.println("Obtained");
            } else if (input == 6) {
                database.addItem("Fire Cracker");
                System.out.println("Obtained");
            } else if (input == 7) {
                break;
            } else {
                System.out.println("Try Again: Input one of the number options listed.");
            }
        }
    }

}
