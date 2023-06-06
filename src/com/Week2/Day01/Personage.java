package com.Week2.Day01;

public class Personage {
    int age;
    public static void personType(int age){
        if(age<=13){
            System.out.println("Kids");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        }
        else {
            System.out.println("Adult");

        }
    }
}
