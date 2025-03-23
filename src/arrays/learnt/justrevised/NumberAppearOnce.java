package arrays.learnt.justrevised;

import java.util.Scanner;

public class NumberAppearOnce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int[] arr=new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//        }
        int[] arr = {4,4,5, 1, 2, 1, 2};
        onlyonce(arr);
        System.out.println(onlyonce(arr));
    }

    public static int  onlyonce(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
}
