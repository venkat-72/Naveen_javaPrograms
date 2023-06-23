package com.Week4.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicateChar {


        public static void main(String[] args) {
            String input = "venkataNaveen";
            String result = removeCharWithDuplicate(input);
            System.out.println(result);
        }

        public static String removeCharWithDuplicate(String str) {
            LinkedHashSet<Character> charSet = new LinkedHashSet<>();

            for (char ch : str.toCharArray()) {
                charSet.add(ch);
            }

            StringBuilder st = new StringBuilder();
            for (Character ch : charSet) {
                st.append(ch);
            }

            return st.toString();
        }
}


