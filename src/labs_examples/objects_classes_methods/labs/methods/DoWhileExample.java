package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class DoWhileExample {

    public static void main(String[] args) {
        int x = doWhileExample();
        System.out.println(x);
    }

    public static int doWhileExample() {

        int count = 0;
        int val = 0;

        do  {
            val += count;
            count++;
        } while (count < 10);

        return val;

    }

}
