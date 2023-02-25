package com.sunglowsys.lacture5;

public class LogicalOpretion {
    public static void main(String[] args) {
            int p = 15;
            int q = 10;
            int r = 5;

            // && oparetor
        System.out.println((p>q)&&(p>r));// true
        System.out.println((p>q)&&(q>r));// true


        // || opretior
        System.out.println((p>q)||(q>r));// true
        System.out.println((p>q)||(p>r));// true
        System.out.println((p<q)||(q<r));// false

        // ! opretior
        System.out.println(!(p==q));// true
        System.out.println(!(p>q));// false

    }
}
