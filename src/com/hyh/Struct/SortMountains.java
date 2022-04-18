package com.hyh.Struct;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
    LinkedList<Mountain> mountains = new LinkedList<Mountain>();
    public class NameCompare implements Comparator<Mountain> {

        @Override
        public int compare(Mountain o1, Mountain o2) {
            return o1.name.compareTo(o2.name);
        }
    }
     public class HeightCompare implements Comparator<Mountain> {

         @Override
         public int compare(Mountain o1, Mountain o2) {
             return o1.height-o2.height;  //升幂排序
         }
     }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        mountains.add(new Mountain("Longs",14225));
        mountains.add(new Mountain("Elbert",14433));
        mountains.add(new Mountain("Marcon",14156));
        mountains.add(new Mountain("Castle",14265));

        System.out.println(mountains);
        NameCompare nameCompare = new NameCompare();
        Collections.sort(mountains,nameCompare);
        System.out.println("by name\n"+mountains);

        HeightCompare heightCompare = new HeightCompare();
        Collections.sort(mountains,heightCompare);
        System.out.println("by height\n"+mountains);
    }
}
