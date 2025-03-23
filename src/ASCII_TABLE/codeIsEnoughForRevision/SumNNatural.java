package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

class SumNNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumnnatural(a, b));
    }

    public static int sumnnatural(int a, int b) {
        return (b * (b + 1)) / 2 - (a * (a - 1)) / 2; // Mathematical formula
    }
}
