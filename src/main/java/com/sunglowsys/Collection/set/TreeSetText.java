package com.sunglowsys.Collection.set;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class TreeSetText {

    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<String>();
        tset.add("Pankaj");
        tset.add("Anuj");
        tset.add("Ramu");

        System.out.println(tset);

        Iterator<String> iterator = tset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Stream<String> stream = tset.stream();
         stream.forEach(n -> System.out.println("itret by Stream  = "+n));
    }
}
