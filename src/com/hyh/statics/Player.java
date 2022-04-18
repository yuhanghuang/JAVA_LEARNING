package com.hyh.statics;

public class Player {
    public static int playercount =0;
    public String name;
    public Player(String s){
        this.name = s;
        playercount ++;
    }
}
