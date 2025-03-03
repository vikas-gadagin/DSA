package arrays.learnt;

import java.util.Scanner;

public class SubarrayKsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int target=sc.nextInt();
         int[] arr=new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int maxLength = largestsubarray(arr,target);
        System.out.println("Largest Subarray Length: " + maxLength);

      sc.close();

    }

    public static int largestsubarray(int[] arr,int target){
        int left=0;
        int right=0;
        int sum=0;
        int size=arr.length;
        int maxlength=0;
            while(right<size){
                right++;
                sum +=arr[right];
            while(left<=right && sum>target){
               sum -=arr[left];
               left++;
            }
            if(sum==target){
                maxlength=Math.max(maxlength,right-left+1);
            }
            }

        return maxlength;
    }
}
