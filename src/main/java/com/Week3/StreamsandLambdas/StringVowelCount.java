package com.Week3.StreamsandLambdas;
import java.util.Arrays;

public class StringVowelCount {
    public static void main(String[] args) {
        String[] strings = {"cricket", "football", "Baseball", "hockey"};

        Arrays.stream(strings)
                .filter(str -> str.matches(".*[aeiouAEIOU].*"))
                .forEach(str -> System.out.println("String: " + str + " | Vowel Count: " + countVowels(str)));
    }

    public static int countVowels(String str) {
         str = str.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                count++;

        }


        return count;
    }

    }

