package labs_examples.lambdas.examples.method_references;
import java.util.Arrays;

/**
 * https://beginnersbook.com/2017/10/method-references-in-java-8/
 */

@FunctionalInterface
interface MyInterface{
    void display();
}

public class InstanceMethodReference {

    public void myMethod(){
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {
        InstanceMethodReference obj = new InstanceMethodReference();
        // Method reference using the object of the class
        MyInterface ref = obj :: myMethod;
        // Calling the method of functional interface
        ref.display();
    }
}


class ArbitraryObjectExample {

    public static void main(String[] args) {
        String[] stringArray = { "Kim", "Caden", "Martin", "Ryan", "Gilad", "Jay", "Sadie"};

        /* Method reference to an instance method of an arbitrary
         * object of a particular type
         */
        Arrays.sort(stringArray, String :: compareToIgnoreCase);

        for(String str : stringArray){
            System.out.println(str);
        }
    }
}