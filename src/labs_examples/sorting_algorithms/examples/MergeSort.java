package labs_examples.sorting_algorithms.examples;

/**
 * Created by GeeksForGeeks - https://www.geeksforgeeks.org/merge-sort/
 */
public class MergeSort {

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    // Main function that sorts nums[left..right] using merge()
    void sort(int nums[], int left, int right) {
        if (left < right)
        {
            // Find the middle point
            int middle = (left+right)/2;

            // Sort (recursive) first and second halves
            sort(nums, left, middle);
            sort(nums , middle+1, right);

            // Merge the sorted halves
            merge(nums, left, middle, right);
        }
    }

    // Merges two subarrays of nums[].
    // First subarray is nums[left ... middle]
    // Second subarray is nums[middle+1 ... right]
    void merge(int nums[], int left, int middle, int right)
    {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = nums[left + i];
        for (int j=0; j<n2; ++j)
            R[j] = nums[middle + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = left;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                nums[k] = L[i];
                i++;
            }
            else
            {
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            nums[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            nums[k] = R[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] arr) {
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

}
