package LongestPalindromeSubstring;

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        int start = 0, end = 0;

        for (int i=0; i<s.length(); i++) {
            // Consider Odd Palindrome;
            int oddPalindrome = expandAroundCenter(s,i,i);

            // Consider Even Palindrome;
            int evenPalindrome = expandAroundCenter(s,i,i+1);

            int PalindromeLength = Math.max(oddPalindrome, evenPalindrome);

            if (PalindromeLength > end - start) {
                start = i - (PalindromeLength - 1) / 2;
                end = i + PalindromeLength / 2;
            }
        }
        return s.substring(start, end+1);
    }

    private int expandAroundCenter(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        // (r - 1) - (l + 1) + 1 = r - l - 1
        return r - l - 1;
    }
}
