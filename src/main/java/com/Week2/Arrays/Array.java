package com.Week2.Arrays;

public class Array {
      int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int maxval = num[0];
      int minval = num[0];


    public  void value() {
        for(int i=1;i<num.length;i++) {
            if(num[i]>maxval){
                maxval=num[i];
            } else if (num[i]<minval) {
                minval=num[i];

            }
            else {
                System.out.println("array");
            }


        }
        System.out.println(maxval);
        System.out.println(minval);

    }
    public static void main(String[] args){
        Array v=new Array();
        v.value();

    }
}
