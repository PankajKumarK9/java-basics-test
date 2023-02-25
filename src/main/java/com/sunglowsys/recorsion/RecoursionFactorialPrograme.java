package com.sunglowsys.recorsion;
public class RecoursionFactorialPrograme {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        System.out.println(factorial(n));
    }
    public static int fact(int n) {

        if(n == 0) {
            return 1;
        }return (n*fact(n-1));
    }

    public  static  int factorial(int n) {
        int fact =  1;
        for (int i = n; i >= 1; i--) {
            fact = fact*i;

        }return fact;
    }
}
