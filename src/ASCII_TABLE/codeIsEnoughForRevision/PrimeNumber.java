package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        check(num);
    }

    public static void  check(int num) {
        if(num<2){
            System.out.println("not prime");}
        int count=0;
        for (int i = 2; i <num ; i++) {
               if (num%i==0)
                   count++;
        }
       if (count==2){
           System.out.println("its prime");}
       else{
        System.out.println("its not prime");
    }
}
}
