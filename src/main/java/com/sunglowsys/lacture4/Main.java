package com.sunglowsys.lacture4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" hello world");
        Scanner scanner =new Scanner(System.in);
        System.out.println(" enter String ");
        String p = scanner.next();
        System.out.println(" enter integer number");
        int n = scanner.nextInt();
        System.out.println(p + " =  "+ n);
    }
}
