package arrays.learnt;

public class RemoveDuplicatesin_placefromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int[] arr){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }

        for (int j= 0; j<=i; j++) {
            System.out.print(arr[j]+" ");
        }


    }
}
