package videos_source_code.arrays;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class TraditionalArray {

    public static void main(String[] args) {

        // initialize new int array with length of 3
        int[] nums = new int[3];

        // place the int 34 at the zero index (the first spot) in the array
        nums[0] = 34;

        // place the int 45 at the one index (the second spot) in the array
        nums[1] = 45;

        // place the int 12 at the two index (the thrid spot) in the array
        nums[2] = 12;

        // if you umcomment the line below and run it it will generate an IndexOutOfBoundsException
        // nums[3] = 76; // there is no index of three

        // 3 will print - because the length is 3 - but the last index is two, because the indices start at 0
        System.out.println(nums.length);

        // print out all elements of the array
        System.out.println("the first element in the array is " + nums[0]);
        System.out.println("the second element in the array is " + nums[1]);
        System.out.println("the third element in the array is " + nums[2]);


        // alternate array decalaration - when you can immediately initialize the values
        String[] words = {"elephant", "tiger", "giraffe", "whale", "bird"};

    }
}
