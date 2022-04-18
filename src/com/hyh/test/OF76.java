package com.hyh.test;

import com.hyh.Interface.Acts;
import com.hyh.Interface.Clowns;
import com.hyh.Interface.Nose;

public class OF76 extends Clowns {
    public static void main(String[] args) {
        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new OF76();
        for (int j = 0; j < 3; j++) {
            System.out.println(i[j].iMethod() + " "+i[j].getClass());
        }
    }
}
