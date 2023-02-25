package com.sunglowsys.OppsConcept;


import java.util.Scanner;

class Algebra {
    int add(int a, int b) {
        int ans= a+b;
        return ans ;
    }
}
public class Sum{
    public static void main(String[] args) {

        Algebra algebra = new Algebra();
//        Scanner scanner1 = new Scanner(System.in);
//        int a = scanner1.nextInt();
//        Scanner scanner2 = new Scanner(System.in);
//        int b = scanner2.nextInt();
        System.out.println("Print sum of number");
        int ans =  algebra.add(4, 8);
        System.out.println(ans);
    }
}
