package com.Week3.StreamsandLambdas;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class OddNumbers {
        public static void main(String[] args) {
            Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
            Stream<Integer> s = Stream.of(arr);
           OptionalDouble avg= s.filter(i -> i%2!=0)
                    .mapToDouble(i -> i*i)
                    .average();
            System.out.println("average of the square odd numbers : "+avg.getAsDouble());


        }
    }



