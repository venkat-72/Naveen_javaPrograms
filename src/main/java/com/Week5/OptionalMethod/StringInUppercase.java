
package com.Week5.OptionalMethod;
import java.util.Optional;

public class StringInUppercase {
    public class StringUppercase {
        public static Optional<String> uppercaseString(String input) {
            if (input == null) {
                return Optional.empty();
            } else {
                return Optional.of(input.toUpperCase());
            }
        }
    }

    public static void main(String[] args) {
        String input1 = "Venkata Naveen";
        String input2 = null;

        Optional<String> result1 =StringUppercase.uppercaseString(input1);
        Optional<String> result2 = StringUppercase.uppercaseString(input2);

        if (result1.isPresent()) {
            System.out.println("Uppercase string of input1: " + result1.get());
        } else {
            System.out.println("Input1 is empty");
        }

        if (result2.isPresent()) {
            System.out.println("Uppercase string of input2: " + result2.get());
        } else {
            System.out.println("Input2 is empty");
        }
    }
}

