package labs_examples.arrays.examples;

//for more array examples see: labs_examples.datatypes_operators/examples/labs_examples.arrays

// Find the minimum and maximum values in an array.
class Arrays {
    public static void main(String args[]) {
        // declare and initialize array size 10
        int nums[] = new int[10];
        int min, max;

        // populate array
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = 0;
        // check for min and max
        for(int i=0; i < 10; i++) {
            if(nums[i] < min)
                min = nums[i];
            if(nums[i] > max)
                max = nums[i];
        }
        // print out min and max
        System.out.println("min and max: " + min + " " + max);
    }
}
