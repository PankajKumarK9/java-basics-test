package com.sunglowsys.lacture11_Opps;

class Student {
    int roll_number;
    String student_name;

}

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.roll_number = 1;
        obj1.student_name = "PAnkaj";
        System.out.println(obj1.roll_number);
        System.out.println(obj1.student_name);


        Student obj2 = new Student();
        obj2.roll_number = 2;
        obj2.student_name = "Gori";
        System.out.println(obj2.roll_number);
        System.out.println(obj2.student_name);

    }
}
