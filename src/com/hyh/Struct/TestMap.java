package com.hyh.Struct;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
//        HashMap需要两个类型参数，关键字和值
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();

//        put代替add
        hashMap.put("kathy",42);
        hashMap.put("Bert",23);
        hashMap.put("Slii",78);

        System.out.println(hashMap);
        System.out.println(hashMap.get("Bert"));
    }
}
