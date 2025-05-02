package main.java.com.zunescape.royale.chat;

import java.util.Set;

import main.java.com.zunescape.royale.util.Contestant;

public interface ChatDecorator {
    void post(Set<Contestant> contestants,Contestant speaker, String msg);
}
