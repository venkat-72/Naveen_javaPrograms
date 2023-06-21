package com.Week4.Hashmap;
import com.Week4.Day01.Students;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class StudentDetails {

    public static void main(String[] args) {

        HashMap<String, Students> student = new HashMap<>();

        student.put("Rahul", new Students("Rahul", "Manam", 3.5));
        student.put("Priya", new Students("Priya", "Kurapati", 3.8));
        student.put("Aryan", new Students("Aryan", "Sharma", 3.2));
        student.put("Neha", new Students("Neha", "Verma", 3.9));
        student.put("Ravi", new Students("Ravi", "Vutla", 3.6));
        student.put("Ananya", new Students("Ananya", "Desai", 3.4));
        student.put("Vivek", new Students("Vivek", "Thakur", 3.7));
        student.put("Sneha", new Students("Sneha", "Rao", 3.1));


        System.out.println("using Entry Set:");
        for (Map.Entry<String, Students> st : student.entrySet()) {
            System.out.println("Key: " + st.getKey() + ", Value: " + st.getValue());
        }


        System.out.println("\nusing forEach method:");
        student.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("\nusing keySet and Iterator:");
        Iterator<String> iterator = student.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("Key: " + key + ", Value: " + student.get(key));
        }

    }
}


