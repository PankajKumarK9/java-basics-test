package com.sunglowsys.lacture9;

import java.util.Scanner;

public class RectagularPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
