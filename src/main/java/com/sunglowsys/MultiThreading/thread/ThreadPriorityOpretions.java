package com.sunglowsys.MultiThreading.thread;

public class ThreadPriorityOpretions  extends Thread{
     public void run(){

         for (int i = 1; i <= 5; i++) {
             System.out.println(Thread.currentThread().getPriority());
             try {
                 Thread.sleep(100);
             } catch (Exception e) {
                 System.out.println(e);
             }
         }

     }

    public static void main(String[] args) {

         ThreadPriorityOpretions th1 = new ThreadPriorityOpretions();
         th1.start();
         th1.getPriority();
        System.out.println(th1);
        th1.setPriority(7);


    }
}
