package com.hyh.API;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList_01 extends ArrayList{
//    ArrayList常用操作
    /**
     * 创建 ArrayList<Egg> myList = new ArrayList<Egg>();
     * 加入元素 Egg s = new Egg();
     * mylist.add(s);
     * 查询大小 int theSize = mylist.size();
     * 查询特定元素 boolean inIn = mylist.contains(s);
     * 查询特定元素的位置 int idx = mylist.indexOf(s);
     * 判断集合是否为空 boolean empty = mylist.isEmpty();
     * 删除元素 mylist.remove(s);
     */


    public static void main(String[] args) {

        ArrayList<String> mylist1 = new ArrayList<String>();
        String s1 = new String("hello");
        String s2 = new String("world");
        mylist1.add(s1);
        mylist1.add(s2);
        int size = mylist1.size();
        String temp = mylist1.get(1);
//        Object temp = mylist1.get(1);
        System.out.println(temp);
        System.out.println(mylist1.contains(temp));
        mylist1.remove(1);
        System.out.println(mylist1.contains(temp));
    }
}
