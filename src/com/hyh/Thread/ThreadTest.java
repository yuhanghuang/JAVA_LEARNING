package com.hyh.Thread;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Runnable threaJob = new MyRunnable();
        Thread myThread = new Thread(threaJob);
        myThread.start();
//        Thread.sleep(2000);
        System.out.println("back in main");
    }
}
