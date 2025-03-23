package arrays.learnt.justrevised;

import java.util.Scanner;

public class LinearSerach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int[] arr=new int[size];
//        int key=sc.nextInt();
        int[] arr ={1,2,3,4,5};
        int key = 4;
       System.out.println(serach(arr,key));
    }

    public static String serach(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==key){
               return "found";
           }
        }
        return "not found";
    }
}
