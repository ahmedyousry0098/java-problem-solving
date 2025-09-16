package twoSum;

import java.util.Arrays;

import static twoSum.Solution.twoSum;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 10};
        int[] res = twoSum(numbers, 6); 
        System.out.println(Arrays.toString(res));
    }
}
