package com.sunglowsys.recorsion;

public class RecorsionTest {
    public static void main(String[] args) {
        int n = 5;
        printIncresing(n);

    }
     public static void printIncresing(int n) {
        if (n==1) {
            System.out.println(1);
            return;
        }
        printIncresing(n-1);
         System.out.println(n);
     }
}
