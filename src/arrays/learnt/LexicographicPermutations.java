package arrays.learnt;

import java.util.Arrays;

class LexicographicPermutations {
    public static void generateAllPermutations(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort to start from the smallest lexicographic order
        System.out.println(Arrays.toString(nums));

        while (true) {
            if (!nextPermutation(nums)) break; // Stop when no next permutation exists
            System.out.println(Arrays.toString(nums));
        }
    }

    public static boolean nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i < 0) return false; // If no next permutation exists, return false

        int j = n - 1;
        // Step 2: Find the smallest element larger than nums[i] to swap with
        while (nums[j] <= nums[i]) {
            j--;
        }
        swap(nums, i, j);

        // Step 3: Reverse the subarray after index 'i' to get the next permutation
        reverse(nums, i + 1);
        return true;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Change input as needed
        generateAllPermutations(nums);
    }
}
