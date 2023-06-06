package com.Week2.Day01;

public class Fizzbuzz {

public static void main(String[] Args){
    int i;

        for(i=0;i<=100; i++){
            System.out.println(i);

            if (i % 3 == 0 && i %5 == 0){
                System.out.println(" FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println(" Fizz");
            } else if (i % 5 == 0){
                System.out.println(" Buzz");
            }
            else{
                System.out.println(i);

            }

        }
    }
}
