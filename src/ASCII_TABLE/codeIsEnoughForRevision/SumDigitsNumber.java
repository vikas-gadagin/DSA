package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

public class SumDigitsNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        calculate(num);
    }

    public static void  calculate(int num){
        int sum=0;
      while (num!=0) {
            sum+=num%10;
            num=num/10;
        }
        System.out.println(sum);
    }
}
