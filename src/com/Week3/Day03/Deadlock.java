package com.Week3.Day03;

public class Deadlock {
        public static void main(String[] args) {
            final Object obj1 = new Object();
            final Object obj2 = new Object();

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (obj1) {
                        System.out.println("Thread 1 acquired object 1");

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        synchronized (obj2) {
                            System.out.println("Thread 1 acquired object 2");
                        }
                    }
                }
            });

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (obj2) {
                        System.out.println("Thread 2 acquired object 2");

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        synchronized (obj1) {
                            System.out.println("Thread 2 acquired object 1");
                        }
                    }
                }
            });

            thread1.start();
            thread2.start();
        }
}








