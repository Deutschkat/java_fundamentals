package labs_examples.repl;

public class TryCatchFinally {

    public static void main(String[] args) {

        int[] nums = {67, 43};

        try {

           // System.out.println(nums[1]);

            System.out.println(nums[5]);

        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Error detected. Sorry bout that!");
            System.out.println(exc.getMessage());
        }finally{
            System.out.println("Program Complete!");
        }


    }
}
