package com.sunglowsys.lacture12_Method_Live;
class   Algebra {
    int a;
    int b;
    Algebra(int x , int y) {
        System.out.println(" Constructor of Algebra class called ");
            a = x;
            b = y;
    }
    int add() {
        int ans = a+b;
        return ans;
    }
    int sub() {
        return b-a;

    }
    int mul() {
        return a*b;
    }
}

public class Main {
    public static void main(String[] args) {
        Algebra obj1 = new Algebra(5, 7);
        int ans = obj1.add();
        System.out.println(ans);
        System.out.println(obj1.sub());
        System.out.println(obj1.mul()       );
    }
}
