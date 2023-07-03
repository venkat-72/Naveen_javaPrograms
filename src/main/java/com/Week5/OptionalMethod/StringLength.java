package com.Week5.OptionalMethod;
import java.util.Optional;

public class StringLength {

    public class StringCheck {
        public static Optional<Integer> getStringLength(String input) {
            if (input == null) {
                return Optional.empty();
            } else {
                return Optional.of(input.length());
            }
        }
    }

    public static void main(String[] args) {
        String input1 = "Venkata Naveen";
        String input2 = null;

        Optional<Integer> length1 = StringCheck.getStringLength(input1);
        Optional<Integer> length2 = StringCheck.getStringLength(input2);

        if (length1.isPresent()) {
            System.out.println("Length of input1: " + length1.get());
        } else {
            System.out.println("Input1 is null");
        }

        if (length2.isPresent()) {
            System.out.println("Length of input2: " + length2.get());
        } else {
            System.out.println("Input2 is null");
        }

    }

}
