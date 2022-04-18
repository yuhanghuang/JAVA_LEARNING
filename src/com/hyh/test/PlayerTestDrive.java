package com.hyh.test;

import com.hyh.statics.Player;

public class PlayerTestDrive {
    public final static int TEMP = 2;
    public static void test1(){
        System.out.println("这儿是静态代码块");
        System.out.println(TEMP);
       // test2();
    }
   public void test2(){
        System.out.println("这是非静态方法");
       System.out.println(TEMP);
        test1();
        int i =25;
        Integer wrap = new Integer(i);
        int unwrap = wrap.intValue();
    }
    public static void main(String[] args) {
        System.out.println(Player.playercount);
        Player one = new Player("tiger");
        System.out.println(Player.playercount);
        System.out.println(one.name);
        System.out.println(TEMP);
        //test1();
        PlayerTestDrive p1 = new PlayerTestDrive();
        p1.test2();
        //test2();
    }
}
