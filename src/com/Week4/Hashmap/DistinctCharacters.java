package com.Week4.Hashmap;
import java.util.HashMap;
public class DistinctCharacters {
    public static void DistinctCharactersAndCount(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : charCountMap.keySet()) {
            int count = charCountMap.get(ch);
            System.out.println(ch + "-" + count);
        }
    }

    public static void main(String[] args) {
        String str = "test string";
        DistinctCharactersAndCount(str);
    }
}



