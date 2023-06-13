package com.Week3.Day01;

public class ExceptionHandling {
    public static void convertToInteger(String string) {
        try {
            int var= Integer.parseInt(string);
            System.out.println(var);

        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        String[] str = {"23", "45.67", "test", "123f"};
        for (String string : str) {
            convertToInteger(string);
        }
    }
}
