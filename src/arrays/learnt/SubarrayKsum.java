package arrays.learnt;

import java.util.Scanner;

public class SubarrayKsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest Subarray Length: " + largestsubarray(arr, target));
        sc.close();
    }
    public static int largestsubarray(int[] arr, int target) {
        int left = 0, sum = 0,maxLength = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > target) {
                sum -= arr[left++];
            }
            if (sum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }
        return maxLength;
    }
}
