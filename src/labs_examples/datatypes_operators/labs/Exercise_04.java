package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        int c = 3;

        if (a < b){
            System.out.println("a is less than b");
        }

        if (b < c){
            System.out.println("b is less than c");
        }

        if (a <= b){
            System.out.println("a is less than or equal to b");
        }

        if (b > c){
            System.out.println("b is greater than c");
        }

        if (b >= a){
            System.out.println("b is greater than or equal to a");
        }

        if (b == c){
            System.out.println("b is equal to c");
        }


    }

}

