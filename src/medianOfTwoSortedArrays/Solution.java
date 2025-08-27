package medianOfTwoSortedArrays;

import java.util.Arrays;

public class Solution {
    private static int binarySearch(int[] numbers, int valueToFind) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        // Sort array;
        Arrays.sort(numbers);

        int beginPointer = 0;
        int endPointer = numbers.length - 1;

        while(beginPointer <= endPointer) {
            int middlePosition = (beginPointer + endPointer) / 2;
            int middleNumber = numbers[middlePosition];

            if (middleNumber == valueToFind) {
                return middlePosition;
            }

            if (valueToFind < middleNumber) {
                endPointer = middlePosition - 1;
            } else {
                beginPointer = middlePosition + 1;
            }
        }
        return -1;
    };
}
