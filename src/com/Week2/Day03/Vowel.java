package com.Week2.Day03;

import java.net.SocketOption;

public class Vowel {
    public static void main(String[] args){
        String str="Venkata Naveen";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i) =='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                count++;

        }
        System.out.println("The vowels count :" +" "+count);
    }
}
