package com.sunglowsys.lacture8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the we want to factorial this number");
        int num = scanner.nextInt();

        int fact = 1;
        for (int i = 1; i <=num; i++ ){
            fact = fact + fact*i;
        }
        System.out.println(fact);
    }
}
