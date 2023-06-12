package com.Week2.Day03;
import java.util.*;
public class Reverseword {
    public static void main(String[] args){
        String str = "Java J2EE Reverse Me";
        System.out.println("the original word :"+str);
        System.out.println();


        String[] word=str.split(" ");
        String reversedStr="";


        for(int i=0;i<word.length;i++){

            String val=word[i];

            for(int j=val.length()-1;j>=0;j--){
                reversedStr+=val.charAt(j);
            }
            reversedStr+=" ";
        }
        System.out.println("The each reverseword: " +reversedStr);
    }

}
