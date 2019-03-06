package labs_examples.datatypes_operators.examples;

// Side-effects can be important.
class SideEffects {
    public static void main(String args[]) {
        int i;

        i = 0;

    /* Here, i is still incremented even though
       the if statement fails. */
        if(false & (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statements executed: " + i); // displays 1

    /* In this case, i is not incremented because
       the short-circuit operator skips the increment. */
        if(false && (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statements executed: " + i); // still 1 !!
    }
}