package main.java.com.zunescape.arenas;

import main.java.com.zunescape.app.App;

public class Forge {

    private Arenas arenas;
    private Tourneys tourney;
    private String newArena = "a";
    private String newTourney = "b";
    private int input;

    public Forge(Arenas arenas, Tourneys tourney) {
        this.arenas = arenas;
        this.tourney = tourney;
    }

    public void enter(){

        while(input != 1 || input != 2 || input != 3){

        System.out.println(
        "Input integer to either create an arena or a tourney: "
        +"\n1) Arena"
        +"\n2) Tourney"
        +"\n3) Exit");

        input = App.getNextInt();


            if (input == 1){
                System.out.println("To leave type \"exit\"");
                while(!newArena.equals("exit")){
                System.out.println("Add an arena; input name: ");
                newArena = App.getNextLine();
                if(newArena.equals("exit")){ //break out of the while loop 
                    break;
                }
                arenas.addArena(newArena); //Adding the arena we give it
                arenas.getArenas();
                }
            }
            else if (input == 2){
                System.out.println("To leave type \"exit\"");
                System.out.println("Add a Tourney; input name: ");
                newTourney = App.getNextLine();
                if (newTourney.equals("exit")){
                    break;
                }
                tourney.addTourney(newTourney); //Adding tourney we give it
            }
            else if (input == 3){
                break;
            }
            else{
            System.out.println("Try again. (Enter # provided above)");
            }
        }
        System.out.println("Final Arena's list: " + arenas);
        System.out.println("Final Tourney's list: " + tourney);
    }
    /*
     * Arenas aa = new Arenas();
     * Tourneys nt = new Tourneys();
     */
}
