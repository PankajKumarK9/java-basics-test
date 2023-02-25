package com.sunglowsys.recorsion;

public class RecoursionDicrementTest {
    public static void main(String[] args) {
        int n = 5;
        printDecresion(n);

    }
    static void printDecresion(int n ) {
        if(n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecresion(n-1);
    }


}
