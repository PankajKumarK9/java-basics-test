package com.sunglowsys.MultiThreading.deadLock;

public class DeadLockDemo {

    public static void main(String[] args) {
        final String str_1 = "Java";
        final String str_2 = "J2EE";
        new Thread(new Runnable() {
            public void run() {
                synchronized (str_1) {
                    System.out.println("Resource one is locked: " + str_1);

                    try {
                        Thread.sleep(1000);
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }

                    synchronized (str_2) {
                        System.out.println("Resource two is locked by Resource one");
                    }
                }


            }
        }).start();
        new Thread(new Runnable() {

            public void run() {
                synchronized (str_2){
                    System.out.println("Resource two is locked :  "+ str_2);
                    synchronized (str_1) {
                        System.out.println("Resource one locked in reesorce two :");
                    }
                }

            }
        }).start();
    }
}
