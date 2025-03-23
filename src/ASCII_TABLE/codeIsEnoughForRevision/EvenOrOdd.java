package ASCII_TABLE.codeIsEnoughForRevision;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        evenorodd(num);
    }

    public static void evenorodd(int num){
        String result=num%2==0?"its is even ":"its is odd";
        System.out.println(result);
    }
}
