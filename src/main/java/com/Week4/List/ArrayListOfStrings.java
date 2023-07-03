package com.Week4.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListOfStrings {

        public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();
            stringList.add("Cricket");
            stringList.add("football");
            stringList.add("basketball");
            stringList.add("hockey");



            System.out.println("Traversing with for loop:");
            for (int i = 0; i < stringList.size(); i++) {
                String str = stringList.get(i);
                System.out.println(str);
            }
            System.out.println();


            System.out.println("Traversing with enhanced for loop:");
            for (String str : stringList) {
                System.out.println(str);
            }
            System.out.println();


            System.out.println("Traversing with iterator:");
            Iterator<String> iterator = stringList.iterator();
            while (iterator.hasNext()) {
                String str = iterator.next();
                System.out.println(str);
            }
            System.out.println();


            System.out.println("Traversing with forEach:");
            stringList.forEach(str -> System.out.println(str));
            //stringList.forEach(System.out::println);
            System.out.println();


            System.out.println("Traversing with parallel stream:");
            stringList.parallelStream().forEach(str -> System.out.println(str));
        }
    }


