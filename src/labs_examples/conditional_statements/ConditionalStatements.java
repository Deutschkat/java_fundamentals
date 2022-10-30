package labs_examples.conditional_statements;

public class ConditionalStatements {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        boolean bool1 = true;
        boolean bool2 = false;


        if (a < b && bool1){
            System.out.println("a is less than b");
        } else if (b > 30){
            System.out.println("a is greater than 30");
        } else if (b > 15) {
            if (b == 20) {
                System.out.println("b is 20");
            } else {
                System.out.println("a is greater than 15 and less than 20");
            }
        } else {
            System.out.println("a is not less than b and b is not greater than 30");
        }
    }
}
