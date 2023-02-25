package com.sunglowsys.controlStatement.conditional;

import java.util.Scanner;

public class Ifelseif {

//    syntax
//    if(condition -){
//        //code
//    }else if(condition-2){
//        //code
//    }else{
//        //code
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int age = scanner.nextInt();

        if(age <= 12) {
            System.out.println("child");

        }
        else if (age >12 && age <18) {
            System.out.println("teenager");

        }
        else {
            System.out.println("adult");
        }

    }
}
