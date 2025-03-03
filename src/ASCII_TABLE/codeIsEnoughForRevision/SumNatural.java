package ASCII_TABLE.codeIsEnoughForRevision;
import java.util.Scanner;
public class SumNatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sumnatural(num);
    }

    public static void sumnatural(int num) {
        int sum=0;
        for (int i = 1; i <=num ; i++) {
            sum=sum+i;
        }

        System.out.println(sum);

    }
}
