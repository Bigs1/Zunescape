package main.java.com.zunescape.auth;

import main.java.com.zunescape.app.App;
import main.java.com.zunescape.player.Player;


public class AuthSession {
    
    private static AuthSession session; //this is a singleton

    private AuthSession() {}

    public static AuthSession getSession(){
        if (session == null){ //if we dont have a session
            session = new AuthSession(); //make a new session
        }
        return session; //else just return the current session
    }

    public Player auth(){
        System.out.println("Enter your username: ");

        String userName = App.getNextLine();

        Player player = new Player(){  //we have to create a new player and return it even though the method is type contestant?

            public String getPUID(){
                return Integer.toString(userName.hashCode());
            }
            public String getUserName(){
                return userName;
            }
        };
        return player;
    }

}
