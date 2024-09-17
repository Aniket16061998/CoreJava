package com.te.interviewpreparation;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {

	public static void main(String[] args) {
		String input = "hello world"; // Example input string

		// Method call to find character occurrence
		Map<Character, Integer> charCountMap = findCharacterOccurrence(input);

		// Display the result
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static Map<Character, Integer> findCharacterOccurrence(String input) {
		// Create a HashMap to store character as key and its occurrence as value
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Convert the string to a character array
		char[] charArray = input.toCharArray();

		// Iterate over the character array
		for (char c : charArray) {
			// Ignore spaces or any other unnecessary characters if needed
			if (c == ' ') {
				continue;
			}

			// If the character is already in the map, increment its value
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				// Otherwise, put the character in the map with value 1
				charCountMap.put(c, 1);
			}
		}
		return charCountMap;
	}
}
