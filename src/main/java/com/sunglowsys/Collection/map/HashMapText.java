package com.sunglowsys.Collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class HashMapText {

    public static void main(String[] args) {
        // hashMap not contain duplicate key and it does not maintain insertion order
        // hash map contains multiple and null values and it not shencronized
        // it not allow null key
        // it is allow null values
        // it contain key and value pair

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Physics", 24);
        hashMap.put("Chemistry", 45);
        hashMap.put("Mathematics",56 );


        //print without iteretion
        System.out.println(hashMap);

        // print itetion elimant
        Iterator itr  =hashMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println();
        }

        // itret by using stream

        Stream< Integer> stream = hashMap.values().stream();
        stream.forEach(n -> System.out.println(n));

    }
}
