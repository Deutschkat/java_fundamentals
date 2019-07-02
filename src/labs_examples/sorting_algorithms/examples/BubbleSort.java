package labs_examples.sorting_algorithms.examples;

import java.util.stream.IntStream;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums1 = {7,2,10,8,21,6,4,5,11};
        int[] nums2 = {8,3,11,9,22,7,5,6,12};

        nums1 = bubbleSort(nums1);
        nums2 = bubbleSortStream(nums2);

        printArray(nums1);
        printArray(nums2);
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // check to see if the two adjacent elements are out of order
                if (arr[j] > arr[j+1]) {
                    // if so, swap the two elements that are out of order

                    // create a copy of the value at "arr[j]"
                    int temp = arr[j];
                    // copy the value at "arr[j+1]" to "arr[j]"
                    arr[j] = arr[j+1];
                    // place the original value of "arr[j]" (that we created a copy of earlier) at "arr[j+1]"
                    arr[j+1] = temp;
                }
            }
        }
        // return the sorted array
        return arr;
    }

    public static int[] bubbleSortStream(int[] arr){
        int n = arr.length;
        // now the Stream API to stream over the length of the Array and Bubble Sort it

        // get the range of the entire array
        IntStream.range(0, n - 1)
                // flatMap all elements except the first (since we'll swap at arr[j-1] - this avoids null pointers
                .flatMap(i -> IntStream.range(1, n - i))
                // iterate over the list
                .forEach(j -> {
                    // if elements need to be swapped
                    if (arr[j - 1] > arr[j]) {
                        // back up arr[j]
                        int temp = arr[j];
                        // overwrite arr[j] with value at arr[j-1]
                        arr[j] = arr[j - 1];
                        // overwrite arr[j-1] with backup of arr[j]
                        arr[j - 1] = temp;
                    }
                });
        // return the sorted array
        return arr;
    }

    private static void printArray(int[] nums) {

        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
