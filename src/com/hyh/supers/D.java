package com.hyh.supers;

public class D extends C{
        String nameC = "D";
        public void getName(){
            System.out.println("子类"+nameC);
            System.out.println("父类"+super.nameC);
        }
//此时子类B中有一个和父类一样的字段（也可以说成父类字段被隐藏了），为了获得父类的这个字段我们就必须加上super，如果没有加，直接写成name = name;不会报错，只是会警告，表示此条语句没有任何意义，因为此时都是访问的子类B里面的那么字段。
//我们通过super是不能访问父类private修饰的变量和方法的，因为这个只属于父类的内部成员，一个对象是不能访问它的private成员的。

    public static void main(String[] args) {
        D d = new D();
        d.getName();
    }
}
