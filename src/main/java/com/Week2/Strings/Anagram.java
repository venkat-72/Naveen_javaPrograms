package com.Week2.Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "a gentleman";
        String str2 = "elegant man";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char[] strarr1 = str1.toCharArray();
            char[] strarr2 = str2.toCharArray();

            Arrays.sort(strarr1);
            Arrays.sort(strarr2);

            boolean anagram = Arrays.equals(strarr1, strarr2);

            if (anagram) {
                System.out.println(anagram);
            } else {
                System.out.println(anagram);
            }
        } else {
            System.out.println("not anagram");
        }

    }
}
