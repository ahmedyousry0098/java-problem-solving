package palindromeNumber;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Welcome To Find Palindrome Number!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Number: ");
        int s = scanner.nextInt();
        boolean result = Solution.isPalindromeNumber(s);
        System.out.print(result);
        scanner.close();
    }
}
