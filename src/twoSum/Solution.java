package twoSum;

import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            Integer complementIndex = complements.get(currentNumber);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - currentNumber, i);
        }
        return numbers;
    }
}
