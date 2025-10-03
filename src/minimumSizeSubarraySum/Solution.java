package minimumSizeSubarraySum;

import java.util.HashMap;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) { // O(n) Time Complexity
        int minLength = Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i++) {
            int sum = 0;
            for (int j=i; j<nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    minLength = Math.min(minLength, (j - i + 1));
                    break;
                }
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public int enhancedMinSubArrayLen(int target, int[] nums) { // O(log(n)) Time Complexity
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right=0; right<nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, Math.abs(right-left) + 1);
                sum -= nums[left++];
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
