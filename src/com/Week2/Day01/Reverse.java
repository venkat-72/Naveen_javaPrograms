package com.Week2.Day01;

public class Reverse {

    public void number(int num){

        int rem = 0;

        int value = 0;

        while(num>0) {
            rem = num % 10;
            value = (value * 10) + rem;
            num = num / 10;

        }   System.out.println(value);
    }

}
