package arrays.learnt.justrevised;
import java.util.Scanner;
public class RotatetheArraybyOne {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int size=sc.nextInt();
//        int[] arr=new int[size];
        int n=5;

        int arr[]= {1,2,3,4,5};
        solve(arr,n);
    }

    public static void solve(int [] arr,int n) {
      int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }

        arr[arr.length-1]=temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
