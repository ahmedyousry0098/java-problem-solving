package containerOfMostWater;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = solution.max(height);
        System.out.println(maxArea); // 49
    }
}
