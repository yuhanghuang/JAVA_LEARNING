package com.hyh.Thread;

public class RunThreads implements Runnable{
    @Override
    public void run() {
        RunThreads runThreads = new RunThreads();
        Thread alpha = new Thread(runThreads);
        Thread beta = new Thread(runThreads);
        alpha.setName("Alpha thread");
        beta.setName("Beta thread");
        alpha.start();
        beta.start();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running");
        }
    }
}
