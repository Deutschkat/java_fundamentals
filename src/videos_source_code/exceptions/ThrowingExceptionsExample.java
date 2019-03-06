package videos_source_code.exceptions;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ThrowingExceptionsExample {

    public static void main(String[] args){
        try {
            methodOne();
        } catch(ArrayIndexOutOfBoundsException exc){
            // this catch is actually "re-catching" the exception thrown from methodTwo
            System.out.println("exception caught");
        }
    }


    // methodOne will immediately throw any exceptions that occur to the main()
    public static void methodOne() throws ArrayIndexOutOfBoundsException {
        // methodTwo throws an Exception - we're not going to catch it here
        // we're going to pass it up to the main() method to handle it as needed
        methodTwo();
    }


    public static void methodTwo() throws ArrayIndexOutOfBoundsException {
        int[] nums = {1,2,3};

        try {
            int x = nums[10];
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Exception caught in methodTwo");
            System.out.println("Now manually throwing exception back to methodOne");
            // the line below will "re-throw" the exception to methodOne
            throw exc;
        }
    }
}