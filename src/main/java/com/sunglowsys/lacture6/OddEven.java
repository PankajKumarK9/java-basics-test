package com.sunglowsys.lacture6;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number%2 == 0) {
            System.out.println(" even");
        }
        else {
            System.out.println(" Odd");
        }

        String ans ;
        ans = (number%2 == 0) ? "even" : " odd";
        System.out.println(ans);
    }
}
