package com.hyh.supers;

public class B extends A{
    private String nameB = "B";

    @Override
    public void getName() {
        System.out.println("子类"+nameB);
        eat();
        System.out.println("---------");
        super.eat();
        super.getName();
        //getName();
    }
    public void eat(){
        System.out.println("子类在吃东西");
    }
//在子类B中，我们重写了父类的getName方法，如果在重写的getName方法中我们去调用了父类的相同方法，必须要通过super关键字显示的指明出来。
//如果不明确出来，按照子类优先的原则，相当于还是再调用重写的getName()方法，此时就形成了死循环，执行后会报java.lang.StackOverflowError异常
     public static void main(String[] args) {
        B b = new B();
        //b.eat();
        b.getName();
    }
}
