package com.sunglowsys.Collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.stream.Stream;

public class LinkedHashSetText {
    public static void main(String[] args) {
        LinkedHashSet<String> hset = new LinkedHashSet<String>();
        hset.add("Pankaj");
        hset.add("Anuj");
        hset.add("Pankaj");
        hset.add("Vivek");
        System.out.println(hset);

        // itretor k throw itret value

        Iterator<String> iterator = hset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Stream<String> stream = hset.stream();
        stream.forEach(n -> System.out.println(n));
    }



}
