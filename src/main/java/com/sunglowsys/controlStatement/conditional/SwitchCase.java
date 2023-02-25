package com.sunglowsys.controlStatement.conditional;

import java.util.Scanner;

public class SwitchCase {
//    switch (expresion) {
////        case x:
////            //ccode
////            breack;
////            //code;
////            breck;
////            //code
////            breack;
////        default:
////            //code
////    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter th day");
        int day = scanner.nextInt();
         switch(day) {
             case 1:
                 System.out.println("monday");
                 break;
             case  2:
                 System.out.println("tuesday");
                 break;
             case 3:
                     System.out.println("wednesDay");
                     break;
             case 4:
                 System.out.println("thursday");
                 break;
             case 5:
                 System.out.println("friday");
                 break;
             case 6:
                 System.out.println("saturday");
                 break;
             case 7:
                 System.out.println("sunday");
                 break;
             default:
                 System.out.println("Invalid");

         }

    }
}
