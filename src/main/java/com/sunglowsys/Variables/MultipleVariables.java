package com.sunglowsys.Variables;

public class MultipleVariables {
    public static void main(String[] args) {
//
//        int x = 5;
//        int y = 7;
//        int t = 8;
        // hmm ise is tarh bhi difen kar sakte hai

        int x = 5, y = 7, t = 8;
        System.out.print("the value of x :");
        System.out.println(x);

        System.out.print("the value of y :");
        System.out.println(y);

        t = 10;
        t = x;
        System.out.print("the value of t :");
        System.out.println(t);

        t = x + y;
        System.out.print("the value of t :");
        System.out.println(t);

        System.out.print("the value of t :");
        System.out.println(y+100);

        // hm ise is tarh bhi print kra skte hai
        System.out.print("the value of t :" + t);

        System.out.println(t+y+x);
        System.out.println("mast cheez :" + t+y+x);
        System.out.println(t+y+""+x);
        System.out.println(t+""+y+x);
        System.out.println(t+y+x+"");

    }
}
