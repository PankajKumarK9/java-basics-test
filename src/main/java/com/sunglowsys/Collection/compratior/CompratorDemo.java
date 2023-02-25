package com.sunglowsys.Collection.compratior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CompratorDemo {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "Pankaj", 17, 56000));
        emp.add(new Employee(2, "Subham", 99, 36000));
        emp.add(new Employee(3, "Raju", 45, 45000));
        emp.add(new Employee(4, "Monu", 65, 37000));
        emp.add(new Employee(5, "Gaju", 76, 76000));

        System.out.println(emp);
        Collections.sort(emp, new SalaryCompratior());
        System.out.println(emp);

        Iterator iterator = emp.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}
