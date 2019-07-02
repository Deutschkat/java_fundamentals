package labs_examples.sorting_algorithms.examples;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {7,2,10,8,21,6,4,5,11};
        nums = insertionSort(nums);

        for(int i : nums){
            System.out.print(i);
        }
    }

    public static int[] insertionSort(int nums[])
    {
        // iterate over the length of the array
        for (int i = 1; i < nums.length; ++i) {
            // get the value at nums[i]
            int val = nums[i];

            // get the index before the current value of "key"
            int j = i - 1;

            // while j is greater than 0 and nums[j] is greater than key
            while (j >= 0 && nums[j] > val) {
                // move the value of nums[j] to the right by one index
                nums[j + 1] = nums[j];
                // decrement j
                j--;
            }
            // once nums[j] is no longer bigger than "val" - then we can insert it val just after nums[j]
            nums[j + 1] = val;
        }

        // return nums
        return nums;
    }
}
