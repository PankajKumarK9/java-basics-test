package com.sunglowsys.Collection.set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

public class HashSetText {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
         hashSet.add("Rama Nujan");
         hashSet.add("Pankaj Kumar");
         hashSet.add("Anuj Kuamr");
        hashSet.add("Rama Nujan");// hash not contain duplicate value

        System.out.println(hashSet);
        // use to itretor to itret value

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // program itret by forEch loop
        for (String s : hashSet) {
            System.out.println(s);
        }

        Stream<String> stream = hashSet.stream();
        stream.forEach(n -> System.out.println(n));


    }



}

