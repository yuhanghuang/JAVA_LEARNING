package com.hyh.Thread;

public class TestySyncTest {
    public static void main(String[] args) {
        TestSync testSync = new TestSync();
        Thread one = new Thread(testSync);
        Thread two = new Thread(testSync);
        one.start();
        two.start();
    }
}
