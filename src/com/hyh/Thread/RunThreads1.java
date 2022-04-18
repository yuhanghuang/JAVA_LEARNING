package com.hyh.Thread;

public class RunThreads1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running");
        }
    }

    public static void main(String[] args) {
        RunThreads1 runThreads = new RunThreads1();
        Thread alpha = new Thread(runThreads);
        Thread beta = new Thread(runThreads);
        alpha.setName("Alpha thread");
        beta.setName("Beta thread");
        alpha.start();
        beta.start();
    }
}
