package labs_examples.exception_handling.labs;

public class Ex1 {
    public static void main(String[] args) {


        int[] nums = {6, 7, 8, 9, 0};

        try{
            int x = nums[0] / nums[4];
        }catch(ArithmeticException aex){
            System.out.println("This number not divisible by zero.");
        }



    }
}
