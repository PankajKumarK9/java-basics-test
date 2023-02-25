package com.sunglowsys.lacture6;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age <= 12) {
            System.out.println(" child");
        }
        if(age > 12 && age < 18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("adult");
        }
    }
}
