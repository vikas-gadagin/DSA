//package arrays.revision;
//
//import java.util.Scanner;
//
//public class ArrayRevisionTemplate {
//
//    // 1. Check if Array is Sorted
//    static boolean isSorted(int[] arr, int n) {
//        // Your logic here
//    }
//
//    // 2. Linear Search
//    static String search(int[] arr, int key) {
//        // Your logic here
//    }
//
//    // 3. Maximum Consecutive Ones
//    static int maxConsecutiveOnes(int[] arr) {
//        // Your logic here
//    }
//
//    // 4. Find Maximum Number in Array
//    static int findMax(int[] arr) {
//        // Your logic here
//    }
//
//    // 5. Find Minimum Number in Array
//    static int findMin(int[] arr) {
//        // Your logic here
//    }
//
//    // 6. Find Missing Number in an Array
//    static int findMissingNumber(int[] arr, int size) {
//        // Your logic here
//    }
//
//    // 7. Find Element that Appears Once
//    static int findUniqueElement(int[] arr) {
//        // Your logic here
//    }
//
//    // 8. Remove Duplicates from Sorted Array
//    static void removeDuplicates(int[] arr) {
//        // Your logic here
//    }
//
//    // 9. Rotate Array by One Position
//    static void rotateArrayByOne(int[] arr) {
//        // Your logic here
//    }
//
//    // 10. Find Second Largest Element
//    static int findSecondLargest(int[] arr) {
//        // Your logic here
//    }
//
//    // 11. Find Second Smallest Element
//    static int findSecondSmallest(int[] arr) {
//        // Your logic here
//    }
//
//    // 12. Find Largest Subarray with Sum K
//    static int largestSubarrayWithSumK(int[] arr, int k) {
//        // Your logic here
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {1, 1, 0, 1, 1, 1};
//        int[] arr3 = {4, 1, 2, 1, 2};
//        int[] arr4 = {1, 1, 2, 2, 2, 3, 3};
//        int[] arr5 = {15, 13, 12, 14, 11};
//        int[] arr6 = {1, 2, 4, 5};
//        int key = 4;
//        int size = arr1.length;
//        int k = 5;
//
//        System.out.println("1. Is Sorted: " + isSorted(arr1, size));
//        System.out.println("2. Search: " + search(arr1, key));
//        System.out.println("3. Max Consecutive Ones: " + maxConsecutiveOnes(arr2));
//        System.out.println("4. Max Number: " + findMax(arr1));
//        System.out.println("5. Min Number: " + findMin(arr1));
//        System.out.println("6. Missing Number: " + findMissingNumber(arr6, 5));
//        System.out.println("7. Unique Element: " + findUniqueElement(arr3));
//        System.out.print("8. Remove Duplicates: "); removeDuplicates(arr4);
//        System.out.print("9. Rotate Array: "); rotateArrayByOne(arr1);
//        System.out.println("10. Second Largest: " + findSecondLargest(arr5));
//        System.out.println("11. Second Smallest: " + findSecondSmallest(arr5));
//        System.out.println("12. Largest Subarray Length with Sum K: " + largestSubarrayWithSumK(arr1, k));
//
//        sc.close();
//    }
//}
