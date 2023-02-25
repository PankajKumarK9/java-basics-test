package com.sunglowsys.lacture4;

import java.util.Scanner;

public class ReadChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the character");
        char ch = scanner.next().charAt(0);
        System.out.println(" Charecture is " + ch);
    }
}
