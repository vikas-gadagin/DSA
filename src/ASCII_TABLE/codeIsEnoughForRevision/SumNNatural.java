package ASCII_TABLE.codeIsEnoughForRevision;
import java.util.Scanner;
class SumNNatural{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sumnnatural(a,b);

    }

    public static void sumnnatural(int a,int b) {
        int sum=0;
        for (int i = a; i <=b; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
