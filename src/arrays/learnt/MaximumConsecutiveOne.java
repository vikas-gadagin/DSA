package arrays.learnt;

import java.util.Scanner;

public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= sc.nextInt();
//        }
        int[] arr= { 1, 1, 0, 1, 1, 1 };
        System.out.println(counter(arr));
    }

    public static int counter(int[] arr){
        int count=0;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(max,count);

        }
        return max;



    }
}
