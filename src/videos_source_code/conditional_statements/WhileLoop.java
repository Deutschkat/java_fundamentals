package videos_source_code.conditional_statements;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class WhileLoop {

    public static void main(String[] args) {

        int outterCount = 0;
        int innerCount = 0;


        while(outterCount < 10){

            while (innerCount < 10){
                System.out.println("outer count = " + outterCount
                + " and inner count = " + innerCount);
                innerCount++;
            }

            innerCount = 0;
            outterCount++;
        }

        System.out.println("all done with while loop!");

    }

}
