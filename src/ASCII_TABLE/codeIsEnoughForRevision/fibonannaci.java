package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

public class fibonannaci {
    public static void produce(int num) {
        int firstnum=0,secondnum=1,thridnum;
        for (int i = 0; i < num; i++) {
            System.out.print(firstnum+" ");
             thridnum=firstnum+secondnum;
             firstnum=secondnum;
             secondnum=thridnum;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        produce(num);
    }
}
