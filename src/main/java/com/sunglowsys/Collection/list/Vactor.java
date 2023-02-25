package com.sunglowsys.Collection.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vactor {
    public static void main(String[] args) {

        List<String> temp = new Vector<String>();
        temp.add("String");
        temp.add("Pankaj");
        temp.add("Pankaj Kumar");
        temp.add("Moni");

        Iterator<String> str = temp.iterator();
        while (str.hasNext()) {
            System.out.println(str.next());
        }

        //hashCode
        System.out.println(temp.hashCode());
        System.out.println(temp.set(2, "Pankaj"));
    }
}
