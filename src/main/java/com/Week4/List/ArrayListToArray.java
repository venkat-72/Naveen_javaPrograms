package com.Week4.List;
import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Cricket");
        stringList.add("football");
        stringList.add("basketball");
        stringList.add("hockey");
        System.out.println(stringList);

        String[] str;
        str = stringList.toArray(new String[stringList.size()]);
        System.out.println();
        System.out.println("After converting into array");

        for (String array : str) {
            System.out.println(array);
        }

    }
}
