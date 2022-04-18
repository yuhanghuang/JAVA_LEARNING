package com.hyh.Thread;

public class BankAccount {
    private int balance = 100; //账户一开始有100元

    public int getBalance() {
        return this.balance;
    }

    public void withDraw(int amount) {
        balance = balance -amount;
    }
}
