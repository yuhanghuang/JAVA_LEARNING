package com.hyh.Struct;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog ie eating");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}
