package ASCII_TABLE.codeIsEnoughForRevision;
import java.util.*;
public class GreatestThree {
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        check(a,b,c);
    }

    public static void check(int a,int b,int c) {
        int temp=a>b?a:b;
        int result=temp>c?temp:c;
        System.out.println(result);


    }
}
