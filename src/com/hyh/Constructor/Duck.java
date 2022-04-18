package com.hyh.Constructor;

public class Duck {
    private int size;

    public Duck(){
        this.size = 27;
        System.out.println("size is "+size);
    }
    public Duck(int ducksize) {
        System.out.println("quacl");
        this.size = ducksize;
        System.out.println("size is "+ size);
    }
}
