package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

public class Freindly_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int sum2 = getdivisor(num2);
        int sum1 = getdivisor(num1);
        String RESULT=((double) sum1/num1==(double) sum2/num2)? ("both are friendly pair"):("not are friendly pair");
        System.out.println(RESULT);
    }

    public static int getdivisor(int num) {
        int sum = 0;
        for (int i = 1; i <=num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}