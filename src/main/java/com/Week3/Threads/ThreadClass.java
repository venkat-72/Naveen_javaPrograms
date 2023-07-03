package com.Week3.Threads;

public class ThreadClass extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        ThreadClass t = new ThreadClass();
        t.start();
    }

}
