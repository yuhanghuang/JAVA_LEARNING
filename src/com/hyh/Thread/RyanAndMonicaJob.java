package com.hyh.Thread;

public class RyanAndMonicaJob implements Runnable{
    private BankAccount account = new BankAccount(); //只有一个RyanAndMonicaJob实例，代表只有一个共享的账户

    /**
     *
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            makeWithdrawl(10);
            if (account.getBalance()<0) {
                System.out.println("Overdrawn");
            }
        }
    }

    /**
     * 检查账户余额，如果透支就列出信息，不然就去睡一会然后提醒来完成提款操作。
     * @param amount
     */
    public synchronized void makeWithdrawl(int amount) {
        if (account.getBalance()>=amount) {
            System.out.println(Thread.currentThread().getName()+" is about to withdraw");
            try {
                System.out.println(Thread.currentThread().getName()+" is going to withdraw");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" woke up");
            account.withDraw(amount);
            System.out.println(Thread.currentThread().getName()+" complete the withdraw");
        }else {
            System.out.println("Sorry, not enough "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();//将任务初始化
        Thread one = new Thread(theJob);//创建出使用相同任务的两个线程，这代表两个线程都会存取同一个账户
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

}
