package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        check(year);
    }

    public static void check(int year) {
        String result=(year%400==0)||(year%4==0 && year%100!=0)?"leap":"not leap";
        System.out.println(result);
    }
}
