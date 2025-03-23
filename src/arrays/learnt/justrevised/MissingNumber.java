package arrays.learnt.justrevised;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int[] arr =new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//        }
        int size = 5;
        int[] arr = {1, 2, 4, 5};

        System.out.println(missingfinder(arr,size));
    }

    public static int missingfinder(int[] arr,int size){
        int sum;
        sum=(size*(size+1))/2;
        int s2=0;
        for (int i= 0; i < arr.length; i++) {
            s2+=arr[i];
        }
        return sum-s2;

    }

}
