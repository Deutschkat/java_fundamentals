package labs_examples.conditional_statements;

public class WhileLoop {

    public static void main(String[] args) {

        int outerCount = 0;
        int innerCount = 0;

        while(outerCount < 10) {
            while (innerCount < 10) {
                System.out.println("outer count is " + outerCount + " and inner count = " + innerCount);
                innerCount++;
            }
            outerCount++;

        }
        System.out.println("all done with while loop!");
    }
        }
