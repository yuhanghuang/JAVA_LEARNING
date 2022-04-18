package com.hyh.Object;

public class compare {

    public static void test_tostring2() {
        System.out.println(new Object().toString());
//        System.out.println(Integer.toHexString(hashCode));
        System.out.println(new Object().getClass());

    }
    public void test_tostring() {
//        toString()方法比较
        System.out.println(new Object().toString());
        System.out.println(Integer.toHexString(hashCode()));
        System.out.println(new Object().getClass());
        String str = "aaaaaa";
        System.out.println(new String().toString());
        System.out.println(str.hashCode());
        System.out.println(new String().equals(this));
        System.out.println(new Object().equals(this));


    }

    public static void main(String[] args) {
        new compare().test_tostring();
//        test_tostring();会报错 静态方法不可以直接调用非静态方法，但是可以new一个对象然后来调用该对象里的非静态方法
    }

}
