package com.sunglowsys.MultiThreading.multiThreading;

 public class ThreadText  extends Thread{

    public void run() {

        for (int i = 1; i <=10; i++){

            System.out.println(Thread.currentThread().getName()+ "--"+i);
         try {
           Thread.sleep(1000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }



        }
    }
}

