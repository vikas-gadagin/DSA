package arrays.revision;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRevision1 {

    // 1. Check if Array is Sorted
    static boolean isSorted(int[] arr, int n) {
        // Your logic here
        for (int i = 0; i <=arr.length-1-1; i++) {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

    // 2. Linear Search
    static String search(int[] arr, int key) {
        // Your logic here
        for (int i = 0; i <=arr.length-1-1; i++) {
            if(arr[i]==key){
                return "found";
            }

        }
        return " not found";
    }

    // 3. Maximum Consecutive Ones
    static int maxConsecutiveOnes(int[] arr) {
        // Your logic here
        int count=0;
        int max=0;
        for (int i = 0; i <=arr.length-1; i++) {
            if (arr[i]==1){
                count++;
            }
            else{
                count=0;
            }

        }
        max=Math.max(max,count);
        return max;
    }

    // 4. Find Maximum Number in Array
    static int findMax(int[] arr) {
        // Your logic here
        int max=arr[0];
        for (int i = 0; i <=arr.length-1; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    // 5. Find Minimum Number in Array
    static int findMin(int[] arr) {
        // Your logic here
        int min=arr[0];
        for (int i = 0; i<=arr.length-1; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    // 6. Find Missing Number in an Array
    static int findMissingNumber(int[] arr, int size) {
        // Your logic here
        int sum=(size*(size+1))/2;
        int s2=0;
        for (int i = 0; i <=arr.length-1; i++) {
            s2+=arr[i];
        }
       return sum-s2;
    }

    // 7. Find Element that Appears Once
    static int findUniqueElement(int[] arr) {
        // Your logic here
        int result=0;
        for (int i = 0; i <=arr.length-1-1; i++) {
            result=result^arr[i];
        }
        return result;
    }

    // 8. Remove Duplicates from Sorted Array
    static void removeDuplicates(int[] arr) {
        // Your logic here
        int i=0;
        for (int j = 1; j <=arr.length-1-1; j++) {
             if(arr[i]!=arr[j]){
                 i++;
                 arr[i]=arr[j];
             }
        }

        for (int j = 0; j <=i; j++) {
            System.out.print(arr[j]+" ");
        }
    }

    // 9. Rotate Array by One Position
    static void rotateArrayByOne(int[] arr) {
        // Your logic here
        int temp=arr[0];
        for (int i =0; i <=arr.length-1-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;

        for (int i = 0; i <=arr.length-1; i++) {
            System.out.print(arr[i]);
        }

    }

    // 10. Find Second Largest Element
    static String findSecondLargest(int[] arr) {
        // Your logic here
       int LARGEST=arr[0];
       int secLARGEST=Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i]>LARGEST){
                secLARGEST=LARGEST;
                LARGEST=arr[i];
            }
            else if(arr[i]<LARGEST && secLARGEST<arr[i])
            {
                secLARGEST=arr[i];
            }
        }
        return secLARGEST+" "+LARGEST;
    }

    // 11. Find Second Smallest Element
    static String findSecondSmallest(int[] arr) {
        // Your logic here
        int smallest=arr[0];
        int secsmallest=Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i]<smallest){
                secsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest && secsmallest>arr[i])
            {
                secsmallest=arr[i];
            }
        }
        return secsmallest+" "+smallest;
    }

    // 12. Find Largest Subarray with Sum K
    static int[] largestSubarrayWithSumK(int[] arr, int k) {
        int left = 0, right = 0, maxlength = 0, sum = 0, startIndex = -1, endIndex = -1;
        int size = arr.length-1;  // Corrected the size
        while (right < size) {
            sum += arr[right];
            while (left <= right && sum > k) {
                sum -= arr[left++];
            }
            if (sum == k && (maxlength = right - left + 1) > endIndex - startIndex) {
                startIndex = left;
                endIndex = right;
            }
            right++; // Moved to the end
        }
        int[] result = {maxlength, startIndex, endIndex};
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 1, 0, 1, 1, 1};
        int[] arr3 = {4, 1, 2, 1, 2};
        int[] arr4 = {1, 1, 2, 2, 2, 3, 3};
        int[] arr5 = {15, 13, 12, 14, 11};
        int[] arr6 = {1, 2, 4, 5};
        int key = 4;
        int size = arr1.length-1;
        int k = 5;
        System.out.println("1. Is Sorted: " + isSorted(arr1, size));
        System.out.println("2. Search: " + search(arr1, key));
        System.out.println("3. Max Consecutive Ones: " + maxConsecutiveOnes(arr2));
        System.out.println("4. Max Number: " + findMax(arr1));
        System.out.println("5. Min Number: " + findMin(arr1));
        System.out.println("6. Missing Number: " + findMissingNumber(arr6,5));
        System.out.println("7. Unique Element: " + findUniqueElement(arr3));
        System.out.print("8. Remove Duplicates: "); removeDuplicates(arr4);
        System.out.print("9. Rotate Array: "); rotateArrayByOne(arr1);
        System.out.println("10. Second Largest: " + findSecondLargest(arr5));
        System.out.println("11. Second Smallest: " + findSecondSmallest(arr5));
        System.out.println("12. Largest Subarray Length with Sum K: " + Arrays.toString(largestSubarrayWithSumK(arr1,k)));
        sc.close();
    }
}
