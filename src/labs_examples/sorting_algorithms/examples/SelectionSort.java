package labs_examples.sorting_algorithms.examples;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {7,2,10,8,21,6,4,5,11};
        nums = selectionSort(nums);

        for(int i : nums){
            System.out.print(i);
        }
    }

    public static int[] selectionSort(int nums[]) {

        // iterate over the length of the array (outer loop)
        // we'll use "i" to indicate what is already sorted - everything at or below
        // "i" will be considered sorted, everything after "i" is unsorted
        for (int i = 0; i < nums.length; i++)
        {
            // set a default value for the index of the smallest value found
            int minVal = i;
            // Find the index of the smallest element in the unsorted array
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[minVal])
                    minVal = j;
            }
            // Swap the smallest element in the unsorted portion of the list
            // with the first element in the unsorted portion of the list

            int temp = nums[minVal];
            nums[minVal] = nums[i];
            nums[i] = temp;

            // when we loop, we're effectively moving the "sorted" marker (in this case "i") up by one
        }

        return nums;
    }
}
