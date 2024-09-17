package com.te.interviewpreparation;
import java.util.HashMap;
import java.util.Map;

public class CharCountUsingGetOrDefault {
    public static void main(String[] args) {
        String input = "hello world";
        Map<Character, Integer> charCountMap = getCharCountMap(input);

        // Print character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
        	if(entry.getValue()==1) {
        		System.out.println(entry.getKey() + " : " + entry.getValue());
        	}
//        	System.out.println();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<Character, Integer> getCharCountMap(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Traverse the string
        for (char c : input.toCharArray()) {
            // Use getOrDefault to either get the current count or default to 0
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}
