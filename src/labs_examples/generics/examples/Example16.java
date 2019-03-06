package labs_examples.generics.examples;

/*
    Demonstrate a generic queue class.
*/
class GenQDemo {
    public static void main(String args[]) {
        // Create in integer queue.
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers.");
        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + i + " to q.");
                q.put(i); // add integer value to q

            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(int i=0; i < 5; i++) {
                System.out.print("Getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();

        // Create a Double queue.
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);

        Double dVal;

        System.out.println("Demonstrate a queue of Doubles.");
        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + (double)i/2 +
                        " to q2.");
                q2.put((double)i/2); // add double value to q2
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(int i=0; i < 5; i++) {
                System.out.print("Getting next Double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}