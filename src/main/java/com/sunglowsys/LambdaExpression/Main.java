package com.sunglowsys.LambdaExpression;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Pankaj");
        list.add("Sumit");
        list.add("Pankaj Kuamr");
        list.add("Gori");
        list.add("Bhanu");
//        System.out.println(list);
//        for (String st: list) {
//            System.out.println(st);
//        }
//        System.out.println(" I use lambda");
//        list.forEach(n -> System.out.println(n));

        Stream<String> st =list.stream();
        Spliterator<String> spl = st.spliterator();


    }
}
