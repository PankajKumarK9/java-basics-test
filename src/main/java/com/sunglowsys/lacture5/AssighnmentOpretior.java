package com.sunglowsys.lacture5;

public class AssighnmentOpretior {

    public static void main(String[] args) {
        int a = 10;
        int b;
        b = a;
        System.out.println(b);//  answer = 10
              a += b; // a = b+a; = a = 10+10;  answer= 20
        System.out.println(a);// 20

        a-=b; // a = a-b; a = 20-10;  answer= 10
        System.out.println(a); // 10

        a *= b; // a = a*b = 10*10; =answer = 100
        System.out.println(a);

        a /= b; // a = a/b = 100/10 = 10
        System.out.println(a);


    }
}
