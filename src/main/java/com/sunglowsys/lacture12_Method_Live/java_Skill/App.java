package com.sunglowsys.lacture12_Method_Live.java_Skill;

public class App {
    private String str_1 = " i am a private Method";
    void printFromMethod() {
        System.out.println(" within method " + str_1);
    }

    public static void main(String[] args) {
        App obj_1 = new App();
        obj_1.printFromMethod();
        System.out.println("Print within class method " + obj_1.str_1);
        App2 obj_2 = new App2();
        obj_2.printFormeOutSideClass();


    }

}
class App2 {
    void printFormeOutSideClass() {
        App obj = new App();
//        System.out.println("Within package out side class "+ obj.str_1);
    }

}
