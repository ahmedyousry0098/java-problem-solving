package containerOfMostWater;

public class Solution {
    public int maxArea(int[] height) { // Complexity: O(n2) n(n-1)/2 loop
        int maxArea = 0;
        for (int l=0; l<height.length; l++) {
            for(int r=l+1; r<height.length; r++) {
                int calculated = (r-l) * Math.min(height[l], height[r]);
                if (calculated > maxArea) {
                    maxArea = calculated;
                }
            }
        }
        return maxArea;
    }

    public int maxAreaOptimized(int[] height) { // Complexity: O(n) (n-1) loop
        int maxArea = 0, left=0, right=height.length-1;
        while(left<right) {
            maxArea = Math.max(maxArea, (right-left) * Math.min(height[left], height[right]));
            if (height[left] > height[right]) right--;
            else left++;
        }
        return maxArea;
    }
}
