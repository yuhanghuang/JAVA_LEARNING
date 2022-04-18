package com.hyh.Struct;

public class TestGenerical {
    public static void main(String[] args) {
        new TestGenerical().go();
    }

    public void go() {
//        声明并创建数组，带有Dog与Cat
        Animal[] animals = {new Dog(), new Cat(),new Dog()};
//        声明并创建Dog数组，仅带有Dog
        Dog [] dogs = {new Dog(),new Dog(),new Dog()};
//        调用两种数组
        takeAnimals(animals);
        takeAnimals(dogs);
    }

//    重点在于takeAnimal()能够取用Animal[]或者Dogs[]参数，因为Dog是一种Animal,多态在此处取作用
    public void takeAnimals(Animal[] animals) {
        for (Animal a :animals) {
//            这里只可以调用声明在Animals中的方法，因为参数是Animal数组，且无需任何转型
            a.eat();
        }
    }
}
