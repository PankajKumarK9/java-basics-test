package com.sunglowsys.controlStatement.conditional;

import java.util.Scanner;

public class SteamOfinput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while (num != -1){
            sum += num;
            num = scanner.nextInt();

        }
        System.out.println(sum);
    }
}
