package labs_examples.conditional_statements;

public class DoWhile {

    public static void main(String[] args) {

        int count = 0;

        do {
            System.out.println("count is " + count);
            count++;
        } while(count < 10);

        System.out.println("all done with do-while loop");
    }
}
