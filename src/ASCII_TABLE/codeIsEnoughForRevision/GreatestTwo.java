package ASCII_TABLE.codeIsEnoughForRevision;
import java.util.Scanner;
class GreatestTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        check(a,b);

    }

    public static void check(int a,int b) {
       if(a==b){
           System.out.println("equal");
       }
       else {
           int  result =a>b?a:b;
           System.out.println(result);
       }
    }
}
