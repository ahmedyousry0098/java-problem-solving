package containsDublicates;

// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

public class Main {
    public static void main(String[] args) {
        int[] series = {1,2,3,1,2,3};
        Solution solution = new Solution();
        boolean result = solution.containsNearbyDuplicate(series, 2);
        System.out.print(result);
    }
}
