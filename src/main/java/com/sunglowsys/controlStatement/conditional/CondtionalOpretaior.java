package com.sunglowsys.controlStatement.conditional;

import java.util.Scanner;

public class CondtionalOpretaior {

    public static void main(String[] args) {
            // sccaner use to
        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
            // when we use && and or opretior isme hmari ek
        // nhu condituon galat ho to complir hmari age ki value check hu nhi krta hai
        if (number%2==0 && number%3==0) {
            System.out.println("found answer = " + number);

        }

        // and agr || or logical opretior m hamren phli
        //  value shi ho ya na ho ye dono ko checkkrta hai

        Scanner scanner1  = new Scanner(System.in);
        System.out.println("enter the number");
        int value = scanner1.nextInt();

        if (value%2==0 && value%5==0) {
            System.out.println("found answer = " + value);

        }
    }
}
