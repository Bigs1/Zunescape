package main.java.com.zunescape.royale.chat;

import java.util.Set;
import main.java.com.zunescape.royale.util.Contestant;
import main.java.com.zunescape.royale.util.RangeValidator;

public class Chat {
    private ChatDecorator decorator; //private instance of chat decorator

    public Chat(ChatDecorator decorator){ //chat constructor taking in chat decorator as a parameter
        this.decorator = decorator;
    }
    
    public void post(Set<Contestant> contestants, Contestant speaker, String msg) {
        decorator.post(contestants, speaker, msg); //refactored post method
    }
    
    public void setDecorator(ChatDecorator decorator) { //set decorator method
        this.decorator = decorator; //allows decorator to be replaced at runtime
    }
}
