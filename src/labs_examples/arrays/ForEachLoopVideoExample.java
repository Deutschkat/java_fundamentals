package labs_examples.arrays;

public class ForEachLoopVideoExample {

    public static void main(String[] args) {


        //single array for each
        int[] nums = new int[5];

        for(int i =  0; i < nums.length; i++){
            nums[i] = i * 14;
        }

        for(int element : nums){
            System.out.println(element);
        }


        // 2d array for each

        int[][] twoDArray = new int [3][5];

        for(int i = 0; i < twoDArray.length; i++){
            for(int x = 0; x < twoDArray[i].length; x++){
                twoDArray[i][x] = i * x;


            }
        }

        for(int[] val : twoDArray){
            for(int i : val){
                System.out.print(i + " ");
            }
            System.out.println("***");
        }


    }
}
