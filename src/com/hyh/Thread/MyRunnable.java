package com.hyh.Thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("in the run");
        go();
    }
    public void go() {
        doMore();
    }
    public void doMore() {
        System.out.println("top to the stack");
    }
}
