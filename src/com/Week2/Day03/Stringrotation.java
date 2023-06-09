package com.Week2.Day03;
import java.util.*;
public class Stringrotation {
    public static void main(String[] args) {


        String str1 = "VenkataNaveen";
        String str2 = "NaveenVenkata";

        if (str1.length() != str2.length()) {
            System.out.println("one string is not rotation of another string");
        }
        else{
            str1=str1.concat(str1);
            if(str1.contains(str2)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }

        }

    }
