package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

 class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        create(num);

    }

    public static void create(int num) {
       for (int rem=0;num!=0;num/=10){
           rem=num%10;
           System.out.print(rem);
        }

    }
}