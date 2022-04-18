package com.hyh.Struct;

public class Book1 implements Comparable{
    String title;

    public Book1(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Object o) {
        Book1 book1 = (Book1) o;
        return (title.compareTo(book1.title));
    }
}
