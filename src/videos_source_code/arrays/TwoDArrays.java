package videos_source_code.arrays;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class TwoDArrays {

    public static void main(String[] args){

        int[][] nums = new int[5][10];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = (i * j) * 7 / 3;
            }
        }

        for(int[] outer : nums){
            for(int val : outer){
                System.out.print(val + " -> ");
            }
            System.out.println();
        }

    }
}
