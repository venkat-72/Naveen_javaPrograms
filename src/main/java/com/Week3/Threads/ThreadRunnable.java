package com.Week3.Threads;

public class ThreadRunnable implements Runnable{

    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        ThreadRunnable t = new ThreadRunnable();
        Thread t1=new Thread(t);
        t1.start();
    }

}
