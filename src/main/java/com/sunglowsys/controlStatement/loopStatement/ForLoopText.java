package com.sunglowsys.controlStatement.loopStatement;

import java.util.Scanner;

public class ForLoopText {
    public static void main(String[] args) {


        // print first five natural number sum
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for(int num = 1; num <= n; num++) {
            sum = sum + num;

        }
        System.out.println(sum);

    }
}
