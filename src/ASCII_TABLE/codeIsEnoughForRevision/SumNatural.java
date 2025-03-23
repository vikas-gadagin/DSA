package ASCII_TABLE.codeIsEnoughForRevision;
import java.util.Scanner;
public class SumNatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sumnatural(num);
    }

    public static void sumnatural(int num) {
        int sum = 0;

        for (; ; ) { // Infinite loop
            if (num == 0) break; // Stop when num reaches 0
            sum += num; // Add num to sum
            num--; // Decrease num
        }

        System.out.println(sum);
    }

}
