package com.Week2.Day01;

public class Fibonacci {

    public void fibonacciNumber(int n){
        int n1 = 0;
        int n2 = 1;
        int n3 ;
        if(n<2){
            System.out.println(n1);
        }
        int i=0;
       while (i <= n){
           System.out.print(n1);
            n3=n1+n2;
            n1=n2;
            n2=n3;
            i++;
        }
    }

}
