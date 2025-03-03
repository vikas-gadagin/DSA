package ASCII_TABLE.codeIsEnoughForRevision;

import java.util.Scanner;

public class IsPalindromeNumber {
    public static String IsPalindromeNumbers(int num) {
        String str=Integer.toString(num);
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return "is not palindrome";
            }
            left ++;
            right --;
        }
        return "is palindrome";
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String result=IsPalindromeNumbers(num);
        System.out.println(result);
    }

}
