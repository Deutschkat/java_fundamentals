package videos_source_code.exceptions;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class SomeClass {

    public static void someMethod(int[] nums){

        try {
            int i = nums[1];
        } catch(Exception exc){
            System.out.println("error detected");
        } finally {
            System.out.println("will always execute");
        }

        System.out.println("Program complete");
    }
}
