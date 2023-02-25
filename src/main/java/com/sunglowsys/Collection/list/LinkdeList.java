package com.sunglowsys.Collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class LinkdeList {

    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        list.add("ramanuj");
        list.add("rahul");
        list.add("bruno");
        list.add("pankaj");
        
        // print list
        System.out.println(list);
        
        // print list after sort the collections
        Collections.sort(list);
        System.out.println(list);

        // how to create secound linked list and add element int with firts list
        List<String> list1 = new LinkedList<String>();
        list1.add("madhu");
        list1.add("jama");
        list1.add("rahul");
        System.out.println(list1);


        Iterator<String> itretor  = list.iterator();
        while (itretor.hasNext()) {
            System.out.println(itretor.next());
        }

        // how to  use forEch loop
        for (String s : list) {
            System.out.println( "print after use for ech lop =" + s);
        }

        // perfotme opretions with stream Api
        Stream<String> stream = list.stream();
        Stream<String> sortedList = stream.sorted();
          sortedList.forEach(n -> System.out.println(n));


    }


}
