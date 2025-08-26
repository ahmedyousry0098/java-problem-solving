package longestNonRepeatingSubString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Find Longest Substring Without Repeating Game!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter String: ");
        String s = scanner.next();
        String result = Solution.findLongestNonRepeatingSubstring(s);
        System.out.printf("Longest substring without repeating chars: %s and it's length is %d", result, result.length());
        scanner.close();
    }
}
