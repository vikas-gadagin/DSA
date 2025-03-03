package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

 class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        create(num);

    }

    public static void create(int num) {
        int rem;
        while (num!=0){
            rem=num%10;
            System.out.print(rem);
            num=num/10;

        }

    }
}