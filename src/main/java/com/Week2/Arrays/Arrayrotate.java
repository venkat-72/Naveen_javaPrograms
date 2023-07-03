package com.Week2.Arrays;

public class Arrayrotate {
    int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
   int  n=2;
   int temp,j;
public void arrayRot() {
    for (int i = 0; i < num.length; i++) {
        System.out.print(num[i]+" ");

    }System.out.println();

    for (int i = 0; i < n; i++) {

        temp = num[i];


        for ( j = 0; j < num.length - 1; j++) {

            num[j] = num[j + 1];
        }

        num[j] = temp;
    }
    System.out.println("After rotation");
    for(int i = 0; i< num.length; i++){
        System.out.print(num[i] + " ");
    }

}
public static void main(String[] args){
    Arrayrotate arr=new Arrayrotate();
    arr.arrayRot();
}

}
