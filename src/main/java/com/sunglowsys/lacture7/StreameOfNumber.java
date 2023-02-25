package com.sunglowsys.lacture7;

import java.util.Scanner;

public class StreameOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        do {
            sum += num;
            num = scanner.nextInt();
        }
        while (num != 0) ;

        System.out.println(sum);
    }
}
