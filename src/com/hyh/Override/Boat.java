package com.hyh.Override;

public class Boat {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void move(){
        System.out.println("drift");
    }
}
