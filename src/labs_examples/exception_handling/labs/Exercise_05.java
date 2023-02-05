package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {

        try{
            methodOne();
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Exception!");
        }

    }

    public static void methodOne() throws ArrayIndexOutOfBoundsException{

        int[] nums = {1,2,3,4,5};

        try {
            int x = nums[20];
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Exception caught in method.");
            System.out.println("Throwing back now...");
            throw exc;
        }
    }

}