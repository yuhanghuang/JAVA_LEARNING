package com.hyh.Struct;

import java.util.ArrayList;
import java.util.List;

public class TestGenerical1 {
    public static void main(String[] args) {
        new TestGenerical1().go();
    }

//    测试下列程序是都可以通过编译
//    public  void test() {
//        ArrayList<Dog> dogs = new ArrayList<Animal>();
//        ArrayList<Animal> animals = new ArrayList<Dog>();
//        List<Animal> list = new ArrayList<Animal>();
//        ArrayList<Dog> dogs1 = new ArrayList<Dog>();
//        ArrayList<Animal> animals1 = dogs1;
//        List<Dog> dogList = dogs1;
//        ArrayList<Object> objects = new ArrayList<Object>();
//        List<Object> objectList = objects;
//        ArrayList<Object> objects1 = new ArrayList<Dog>();
//    }


    public void go() {

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        Dog[] dogs1 = {new Dog(),new Dog(),new Dog()};
        takeAnimals(dogs1);
//        takeAnimals(dogs);
//        takeAnimals(animals);

        }
//        声明并创建数组，带有Dog与Cat
//        Animal[] animals = {new Dog(), new Cat(),new Dog()};
//        声明并创建Dog数组，仅带有Dog
//        Dog [] dogs = {new Dog(),new Dog(),new Dog()};
//        调用两种数组

//        takeAnimals(dogs);

    //    重点在于takeAnimal()能够取用Animal[]或者Dogs[]参数，因为Dog是一种Animal,多态在此处取作用
    public void takeAnimals(Animal[] animals) {
//    public void takeAnimals(ArrayList<Animal> animals){
        for (Animal a :animals) {
//            这里只可以调用声明在Animals中的方法，因为参数是Animal数组，且无需任何转型
//            a.eat();
//            把Cat放到Dog数组，可以骗过编译器
            animals[0] = new Cat();
        }
    }
}
