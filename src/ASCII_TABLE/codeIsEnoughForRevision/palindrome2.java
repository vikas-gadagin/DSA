package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

 class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(palindromeChecker(num));
    }

    public static String palindromeChecker(int num) {
        String str = Integer.toString(num);

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return "It's not a palindrome";
            }
        }
        return "Palindrome";
    }
}
