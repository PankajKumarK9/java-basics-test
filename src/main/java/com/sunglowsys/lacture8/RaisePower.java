package com.sunglowsys.lacture8;

import java.util.Scanner;

public class RaisePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter we the number we want get raisePower ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++ ){
            ans = ans*a;
        }
        System.out.println(ans);
    }
}
