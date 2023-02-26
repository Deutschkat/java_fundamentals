package labs_examples.repl;

import java.util.function.Predicate;

public class StaticMethodRefREPL {
    public static void main(String[] args) {

        // Step 1) modify the Predicate below to use a Method Reference rather than a Lambda expression

        Predicate<Integer> predicateStatic = NumberUtil::isEven;
        System.out.println(predicateStatic.test(15));
        System.out.println(predicateStatic.test(10));


    }
}

class NumberUtil {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
