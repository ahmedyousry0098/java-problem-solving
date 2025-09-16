package palindromeNumber;

public class Solution {
    public static boolean isPalindromeNumber(int num) {
        String parts = String.valueOf(num);

        for(int left=0, right=parts.length()-1; left < right; left++, right--){
            if (parts.charAt(left) != parts.charAt(right)) {
                return false;
            }
        }
        return true;
    }
}
