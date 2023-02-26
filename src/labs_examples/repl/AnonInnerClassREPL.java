package labs_examples.repl;

public class AnonInnerClassREPL {
    public static void main(String[] args) {

    // Step 1) Please demonstrate the creation of an anonymous inner class from the interface AnonymousInner below

        AnonymousInner obj = new AnonymousInner() {
            @Override
            public void methodOne() {
                System.out.println("This is method one.");

            }

            @Override
            public int methodTwo(int a) {
                System.out.println("Method two here:");
                return a;
            }
        };





    // Step 2) Demonstrate calling both methods using the object you created (by creating an anonymous inner class)

        obj.methodOne();
        int x = obj.methodTwo(10);

        System.out.println(x);
}
}

interface AnonymousInner {
    public void methodOne();
    public int methodTwo(int a);
}
