package com.sunglowsys.lacture7;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
