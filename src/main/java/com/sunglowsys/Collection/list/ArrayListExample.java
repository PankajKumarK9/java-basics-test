package com.sunglowsys.Collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListExample {


    // performe java Array list opretions
    public static void main(String[] args) {


        List<String> course =  new ArrayList<String>();
        course.add("math");
        course.add("bio");
        course.add("physics");

        // how short collection
        Collections.sort(course);
        System.out.println(course);


//        System.out.println("print course list =" + course);


        // itret ArrayLis

        Iterator<String> itr =course.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // create secound ArrayList
        List<String> course1 = new ArrayList<String>();
        course1.add("botni");
        course1.add("computer");
        course1.add("java");
        System.out.println(" print secound Array list =" + course1);

        // how to  add secound arrayList into first ArrayList

        course.addAll(course1);

        System.out.println("print combination of secound adn firstArrayList= "+ course);

        // short ArrayList
       // Collections.sort(course);

        Iterator<String> itretor  = course.iterator();
        while (itretor.hasNext()){
            System.out.println("print aftesr use itreto  = " +"  "+ itretor.next());
        }

        // getSize of list
        System.out.println("size of list = "+ course.size());
        System.out.println("check list empty end not empty = " + course.isEmpty());



        // performe opretions by using to stream Api
        Stream<String> stream = course.stream();
        Stream<String> sortedData = stream.sorted();
        sortedData.forEach(n -> System.out.println(n));
    }
}
