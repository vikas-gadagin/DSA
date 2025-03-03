package arrays.learnt;

public class secondlsmallest{
    static int secSmallest(int arr[], int n) {
        if (n < 2) {
            System.out.println("Array must have at least two distinct elements.");
            return -1;  // Error case
        }

        int smallest = Integer.MAX_VALUE;
        int sec_smallest = Integer.MAX_VALUE;

        // Single pass approach
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                sec_smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < smallest && arr[i] > sec_smallest) {
                sec_smallest = arr[i];
            }
        }

        return (sec_smallest == Integer.MAX_VALUE) ? -1 : sec_smallest;
    }

    public static void main(String args[]) {
        int arr[] = {15,13,12,14,11};
        int n = arr.length;
        int result = secSmallest(arr, n);

        if (result != -1) {
            System.out.println("Second smallest element: " + result);
        } else {
            System.out.println("No second smallest element found.");
        }

    }
}

