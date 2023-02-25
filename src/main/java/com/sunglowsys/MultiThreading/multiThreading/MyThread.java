package com.sunglowsys.MultiThreading.multiThreading;
 public  class MyThread {
    public static void main(String[] args) {
        ThreadText th1 = new ThreadText();

        //New
        System.out.println(" Thread state before Start : " + th1.getState());
        th1.start();


        //RUNNABLE
        System.out.println("Thread state after start : " + th1.getState());

        for (int i = 1; i <= 7; i++) {
            System.out.println("Thread state  " + th1.getState());
        }
    }
}
