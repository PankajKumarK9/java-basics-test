package com.sunglowsys.lacture6;

import java.util.Scanner;

public class CounditnalOpretor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if(value%5 == 0 || value%3 == 0) {
            System.out.println(" Value of " + value );
        }
    }
}
