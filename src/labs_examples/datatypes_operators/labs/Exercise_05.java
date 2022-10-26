package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        if (a || b){
            System.out.println("a is definitely true");
        }

        if (a & b){
            System.out.println("a and b are true");
        }

        if (a && b){
            System.out.println("a is true, and b could be true");
        }

        if (a ^ b){
            System.out.println("this statement could be true or false");
        }

        if (a != b){
            System.out.println("a does not equal b");
        }

    }

}

