package com.sunglowsys.lacture8;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digits");
        int num = scanner.nextInt();
        int ans = 0;
        while (num > 0) {
            ans = ans*10 + num%10;
            num = num/10;
        }
        System.out.println(ans);

    }
}
