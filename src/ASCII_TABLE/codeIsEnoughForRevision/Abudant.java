package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

public class Abudant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        check(num);
    }

    public static void check(int num) {
        int sum = 0;

        // abudant is one which sum of divisors is greater than its original number
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;


            }
        }
        String result = sum > num ? "abudant" : "not abudant";
        System.out.println(result);
    }
}