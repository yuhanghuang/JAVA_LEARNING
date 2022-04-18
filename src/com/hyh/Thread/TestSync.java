package com.hyh.Thread;

public class TestSync implements Runnable{
    private int balance;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            increment();
            System.out.println("balance is "+balance);
        }
    }
    public synchronized void increment() {
        int i = balance;
        balance = i+1;  //问题在这儿，用的是读取时候的值而不是目前的值
    }
}
