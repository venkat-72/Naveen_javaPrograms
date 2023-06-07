package com.Week2.Day02;

public class Reversearray {


    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int temp;


        for (int i = 0, j = num.length - 1; i < j; i++, j--) {
            temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }


        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}