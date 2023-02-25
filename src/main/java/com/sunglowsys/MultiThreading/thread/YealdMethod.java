package com.sunglowsys.MultiThreading.thread;

public class YealdMethod  extends Thread {
    public void run() {

        for (int i = 1; i <=10; i++) {
            System.out.println("");
           Thread.yield();// it will push
        }

    }

    public static void main(String[] args) {

        YealdMethod t1 = new YealdMethod();
        t1.start();


    }
}
