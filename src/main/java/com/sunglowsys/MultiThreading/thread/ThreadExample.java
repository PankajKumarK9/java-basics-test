package com.sunglowsys.MultiThreading.thread;

public class ThreadExample extends  Thread{
    public void run() {

        for ( int i = 0; i<= 5; i++) {
            System.out.println("child thread start");
        }
    }

    public static void main(String[] args) {

        ThreadExample t1 = new ThreadExample();
        t1.start();

    }
}
