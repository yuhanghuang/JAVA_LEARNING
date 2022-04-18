package com.hyh.wrapper;

public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }
    public void go(){
        int one = 102202020;
        double two = 12345.44884;
        System.out.println(String.format("%,.1f",42.000));
        System.out.println(String.format("The rank is %,d out of %,.2f",one,two));
        //j = i;
        //System.out.println(j);
       // System.out.println(i);
    }
}
