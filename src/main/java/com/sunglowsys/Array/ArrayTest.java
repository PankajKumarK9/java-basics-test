package com.sunglowsys.Array;

public class ArrayTest {

    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest();
        int[] ages ={2,3,4,4,4,7,86,98};
        System.out.println(arrayTest.arrays(ages));

    }

    public int arrays(int[] ages) {
        int add = 0;
        for (int i = 0; i <=ages.length-1; i++) {
            add = add + ages[i];
        }
        return add;
    }
}
