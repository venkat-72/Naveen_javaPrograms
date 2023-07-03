package com.Week4.List;

import java.util.ArrayList;
import java.util.List;

public class RemoveOfLastIndex {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Cricket");
        stringList.add("football");
        stringList.add("basketball");
        stringList.add("hockey");


        System.out.println("before removing the last element" + stringList );

        int lastIndex = stringList.size() - 1;
        stringList.remove(lastIndex);
        System.out.println("After removing the last element: " + stringList);

    }
}
