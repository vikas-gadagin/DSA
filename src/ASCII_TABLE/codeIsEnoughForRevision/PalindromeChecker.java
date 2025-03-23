package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

public class PalindromeChecker {
    public static String IsPalindromeNumbers(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return "is not palindrome";
            }
        }
        return "is palindrome";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(IsPalindromeNumbers(sc.nextLine()));
    }
}
