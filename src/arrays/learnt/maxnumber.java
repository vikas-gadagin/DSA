package arrays.learnt;

import java.util.Scanner;

public class maxnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr =new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();


        }
        int result= checkmax(arr,size);
        System.out.println("maxnumber "+result);

        }

    public static int checkmax(int[] arr,int size) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
