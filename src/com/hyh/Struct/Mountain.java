package com.hyh.Struct;

public class Mountain {
    String name;
    int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return name+" "+height;
    }
}
