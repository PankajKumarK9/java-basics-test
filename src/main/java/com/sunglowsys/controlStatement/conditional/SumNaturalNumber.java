package com.sunglowsys.controlStatement.conditional;

import java.util.Scanner;

public class SumNaturalNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int sum = 0;
        int number = 1;
        while (number <=n) {

            sum = sum +number;
            number++;
        }
        System.out.println(sum);
    }
}

class sumNumberOfNaturals {
    public static void main(String[] args) {
        int sum = 0;
        int n = 4;
        int number = 1;
        for(int i = number; i <= n; i++) {
            sum = sum + number;
        }
        System.out.println(sum);

    }
}
