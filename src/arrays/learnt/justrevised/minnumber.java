package arrays.learnt.justrevised;

import java.util.Scanner;

public class minnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int SIZE=sc.nextInt();
        int[] arr=new int[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        smallest(arr);

    }

    public static void smallest(int[] arr) {
        int smallestnumber=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<smallestnumber){
                smallestnumber=arr[i];
            }

        }
        System.out.println("smallestnumber "+smallestnumber);




    }
}
