import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(int n) {
        return isPalindromeHelper(n, reverseNumber(n));
    }

    private static int reverseNumber(int n) {
        return reverseHelper(n, 0);
    }

    private static int reverseHelper(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverseHelper(n / 10, rev * 10 + n % 10);
    }

    private static boolean isPalindromeHelper(int original, int reversed) {
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(number + " is palindrome? " + isPalindrome(number));
        scanner.close();
    }
}