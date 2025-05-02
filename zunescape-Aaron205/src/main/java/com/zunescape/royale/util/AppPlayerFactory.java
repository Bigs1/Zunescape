package main.java.com.zunescape.royale.util;

import main.java.com.zunescape.auth.AuthSession;
import main.java.com.zunescape.player.Player;

public class AppPlayerFactory implements AbstractPlayerFactory {
    
    private AuthSession session;

    public AppPlayerFactory(){
        session  = AuthSession.getSession();
    }

    public Player getPrimaryPlayer(){
        return session.auth();
    }

}
