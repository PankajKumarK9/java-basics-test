package com.sunglowsys.controlStatement.conditional;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
       // syntex of if statement
//        if (condition) {
//            code
//        }

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if( number%2==0) {
            System.out.println("number is even number");
        }
        else {
            System.out.println("number is odd number");
        }


    }
}
