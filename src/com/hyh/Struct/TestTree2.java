package com.hyh.Struct;

import com.hyh.supers.B;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTree2 implements Comparator<Book1> {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book1 b1 = new Book1("How cats work");
        Book1 b2 = new Book1("Remix your Body");
        Book1 b3 = new Book1("Finding me");
        TestTree2 testTree2 = new TestTree2();
        TreeSet<Book1> treeSet = new TreeSet<Book1>(testTree2);

        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b3);
        System.out.println(treeSet);
    }

    @Override
    public int compare(Book1 o1, Book1 o2) {
        return o1.title.compareTo(o2.title);
    }
}
