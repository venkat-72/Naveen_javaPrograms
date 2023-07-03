package com.Week1;

public class Store implements Payment,Notify{

    @Override
    public void processMoney(double amount) {
        System.out.println("Payment of $" + amount );
    }


    @Override
    public void sendNotify(String message) {
        System.out.println( message);


    }
}
