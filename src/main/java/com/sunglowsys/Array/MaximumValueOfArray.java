package com.sunglowsys.Array;

public class MaximumValueOfArray {

    public static void main(String[] args) {
        int[] number = {65, 76, 87, 656,34,67,80};
        int max = number[0];

        for(int i = 1; i<number.length ; i++) {

            if (number[i] < max) {
                max = number[i];
            }
        }
        System.out.println(max);
    }
}
