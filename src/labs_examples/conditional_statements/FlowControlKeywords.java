package labs_examples.conditional_statements;

public class FlowControlKeywords {
    public static void main(String[] args) {

        //flow control
        //continue, break, return

        //CONTINUE
        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 7) {
                //forces early loop iteration.
                // proceeds directly after continue
                //if parameters met
                continue;
            }
            System.out.println("i = " + i);
        }


        System.out.println();
        System.out.println();
        System.out.println();

        //BREAK

        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 7) {
               //exits the nearest loop
                break;
            }
            System.out.println("i = " + i);

        }

        System.out.println("Done with loop");

        System.out.println();
        System.out.println();

        someMethod(1);
    }
        //RETURN
    public static int someMethod(int val){

        if (val == 0) {
            System.out.println("1) Will this print?");
            return 0;
        } else if (val == 1) {
            System.out.println("2) Will this print?");
            return 1;
        }else {
            System.out.println("3) Will this print?");
            return -1;
        }

        }


        }

