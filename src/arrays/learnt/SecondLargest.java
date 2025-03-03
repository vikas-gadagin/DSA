package arrays.learnt;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        seclargerst(arr);
    }

    public static void  seclargerst(int[] arr){
        int max=arr[0];
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if (arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
//            else if (arr[i]<max && arr[i]>secondmax){
//               secondmax=arr[i];
//            }
        }
        System.out.println("second max :"+secondmax);
    }
}
