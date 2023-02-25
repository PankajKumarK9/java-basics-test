package com.sunglowsys.controlStatement.conditional;

import java.util.Scanner;

public class NestedIfElseStatement {

//    syntex
//    if(condition 1) {
//        if (condition 2){
//            //code
//        }else {
//            //code
//        }
//    }
//    else {
//        //code
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();

        String ans;
        ans= (number % 2 == 0) ? "even" : "odd";

        System.out.println(ans);
    }
}

class NestedIfElse {
    public static void main(String[] args) {
        NestedIfElse nestedIfElse = new NestedIfElse();
        int number = 29;
        nestedIfElse.oddEvenNumber(number);
    }

    private void oddEvenNumber(int number) {
        String ans;
        ans = (number % 2== 0) ? "even" : "odd";
        System.out.println(ans);
    }
}
