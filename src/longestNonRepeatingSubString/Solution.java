package longestNonRepeatingSubString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static String findLongestNonRepeatingSubstring(String s) {
        Map<Character, Integer> visitedChars = new HashMap<>();
        String longestSubString = "";

        for (int rPointer = 0, lPointer = 0; rPointer < s.length(); rPointer++) {
            char currentChar = s.charAt(rPointer);

            // If we’ve seen current character && it's inside the current substring
            if (visitedChars.containsKey(currentChar) &&
                    visitedChars.get(currentChar) >= lPointer) {
                // Move left pointer just after the last seen duplicate
                lPointer = visitedChars.get(currentChar) + 1;
            }

            // Check if current substring is the longest so far
            if ((rPointer - lPointer + 1) > longestSubString.length()) {
                longestSubString = s.substring(lPointer, rPointer + 1);
            }

            // Update last seen index of current character
            visitedChars.put(currentChar, rPointer);
        }

        return longestSubString;
    }
}
