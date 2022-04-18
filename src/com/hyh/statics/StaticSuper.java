package com.hyh.statics;

public class StaticSuper {
    static {
        System.out.println("super static block");
    }

    public StaticSuper() {
        System.out.println("super constructor");
    }
}
