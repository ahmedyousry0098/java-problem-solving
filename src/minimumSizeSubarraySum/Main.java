package minimumSizeSubarraySum;

public class Main {
    public static void main(String[] args) {
        int[] series = {2,3,1,2,4,3};
        Solution solution = new Solution();
        int result = solution.enhancedMinSubArrayLen(7, series);
        System.out.println(result);
    }
}
