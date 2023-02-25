package com.sunglowsys.Array;

public class CheckTheNumberInArray {

    public static void main(String[] args) {
       // CheckTheNumberInArray array = new CheckTheNumberInArray();
        int[] number = new int[4];
       number[0] =21;
       number[1] = 43;
       number[2] = 45;
       number[3] = 45;
//
//       for (int i = 0; i <number.length; i++ ) {
//           System.out.println(number[i]);
//       }
       int i = 0;
       while (i < number.length) {
           System.out.println(number[i]);
           ++i;
       }

    }



    // checkTheNumber(int[] number)
}
