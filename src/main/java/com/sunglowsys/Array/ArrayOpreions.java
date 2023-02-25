package com.sunglowsys.Array;

public class ArrayOpreions {

     //we can accces value in array by  using to
    // indexing
    // for loop
    // while loop
    // for each loop


    // value find by for loop
    public void itretiovalue(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }

    // value itreate by for Each Loop
    public void forEach(int[] ages) {
        for(int age : ages) {
            System.out.println("print by forEachLoop");
            System.out.println(age);
        }
    }

    // itreat value by while loop
    public  void whileLoop(int[] ages ) {

        System.out.println("After while use ");
        int i = 0;
        while ( i < ages.length) {
            System.out.println(ages[i]);
            i++;
        }
    }




    public static void main(String[] args) {
        ArrayOpreions  arrayOpreions = new ArrayOpreions();
         int[] ages = {45, 56, 67, 68};
       arrayOpreions.itretiovalue(ages);
       arrayOpreions.forEach(ages);
       arrayOpreions.whileLoop(ages);


    }
}
