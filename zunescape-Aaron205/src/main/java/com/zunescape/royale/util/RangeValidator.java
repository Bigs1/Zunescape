package main.java.com.zunescape.royale.util;

import java.util.Set;

import main.java.com.zunescape.royale.chat.ChatDecorator;

public class RangeValidator implements ChatDecorator {
    
    public Set<Contestant> withinRange(Set<Contestant> contestants, Contestant primary){
        return contestants;
    }

    public void post(Set<Contestant> contestants, Contestant speaker, String msg) {
        if (withinRange(contestants, speaker).containsAll(contestants)) { //if the contestans and speaker are within range
            System.out.println(speaker.getUserName() + ": " + msg); //get the speaker:message
        } else {
            System.out.println("You are not within range to send this message."); //else they are not in range
        }
    }

}
