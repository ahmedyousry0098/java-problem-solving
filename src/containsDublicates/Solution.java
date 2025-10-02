package containsDublicates;

import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return false;
        }
        HashMap<Integer, Integer> visitedIndexMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int currentNumber = nums[i];
            if (visitedIndexMap.containsKey(currentNumber) && Math.abs(visitedIndexMap.get(currentNumber) - i) <= k) {
                return true;
            }
            visitedIndexMap.put(nums[i], i);
        }
        return false;
    }
}
