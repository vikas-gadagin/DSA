package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

class PositiveOrNegative {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();

         check(num);
     }

         public static void  check(int num){
             if (num == 0) {
                 System.out.println("its is zero");
             } else {
                 String result = num > 0 ? "positive" : "negative";
                 System.out.println(result);
             }
         }
     }

