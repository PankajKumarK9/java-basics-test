package com.sunglowsys.Collection.comparible;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparibleDemo {

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Pankaj", 18));
        emp.add(new Employee(2, "Sumit", 20));
        emp.add(new Employee(3,"Monu", 18));
        emp.add(new Employee(4, "Thakur", 89));
        emp.add(new Employee(5,"Rahul", 17));
        emp.add(new Employee(6, "Aman", 29));



        Collections.sort(emp);
        System.out.println(emp);



    }
}
