package com.Week3.StreamsandLambdas;
import java.util.Arrays;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "mango", "blueberry", "cherry"};

        Arrays.stream(strings)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted()
                .forEach(System.out::println);

        }
    }


