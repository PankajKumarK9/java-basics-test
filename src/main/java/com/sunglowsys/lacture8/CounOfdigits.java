package com.sunglowsys.lacture8;

import java.util.Scanner;

public class CounOfdigits {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int sumOfDigits = 0;
        int orginalNumber = number;
        while (number>0) {
            sumOfDigits = sumOfDigits+number%10;
            number = number/10;

        }
        System.out.println("Sum of digits in " + orginalNumber + " = " + sumOfDigits);
    }
}
class CountOfdigitdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digites");
        int number = scanner.nextInt();
        int numberoftotal = 0;
        while ( number > 0) {
            numberoftotal++;
            number = number/10;

        }
        System.out.println(numberoftotal);
    }
}
