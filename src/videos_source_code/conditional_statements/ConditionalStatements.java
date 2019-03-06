package videos_source_code.conditional_statements;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ConditionalStatements {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        boolean bool1 = true;
        boolean bool2 = false;

        if (a < b && a >= 0){
            // if statement code block
            System.out.println("a is less than b");
        } else if (b > 30){
            System.out.println("a is greater than 30");
        } else if (b > 20){
            System.out.println("a is greater than 20");
        } else if (b > 15){

            if (b > 18){
                if (b > 19){
                    if (b == 20){
                        System.out.println("b is 20");
                    }
                }
                System.out.println("b is 19");
            } else {
                System.out.println("a is greater than 15 and less than 19");
            }

        } else if (b > 30){
            System.out.println("a is greater than 30");
        } else {
            System.out.println("b and b is not greater than 30");
        }

    }

}
