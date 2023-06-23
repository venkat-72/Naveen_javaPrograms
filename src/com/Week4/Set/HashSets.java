package com.Week4.Set;
import java.util.HashSet;
import java.util.Iterator;
public class HashSets {
        public static void main(String[] args) {

            HashSet<String> hashSet = new HashSet<>();

            // Add 10 strings to the HashSet
            hashSet.add("Venkat");
            hashSet.add("Rohith");
            hashSet.add("Akshay");
            hashSet.add("Rohith");
            hashSet.add("Akshay");
            hashSet.add("Naveen");
            hashSet.add("Rahul");



            System.out.println("HashSet using Iterator:");
            Iterator<String> iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                String value = iterator.next();
                System.out.println(value);
            }

            System.out.println("\nHashSet using forEach loop:");
            for (String value : hashSet) {
                System.out.println(value);
            }


            System.out.println("\nIterating HashSet using Streams forEach:");
            hashSet.stream().forEach(value -> System.out.println(value));
        }
    }

