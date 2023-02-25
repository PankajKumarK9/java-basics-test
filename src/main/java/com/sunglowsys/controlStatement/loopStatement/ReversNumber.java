package com.sunglowsys.controlStatement.loopStatement;

import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 0;

        while (num!=0) {
           result = result*10 +num%10;
           num/=10;
       }
        System.out.println(result);

    }
}
