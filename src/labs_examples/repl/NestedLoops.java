package labs_examples.repl;

public class NestedLoops {
    public static void main(String[] args) {

        System.out.println("Starting...");
        for (int i = 0; i < 10; i++){
            System.out.println("** Outter Loop - i = " + i + " **");
            for (int j = 0; j < 7; j++){
                System.out.print("Inner Loop: j = " + j + " | ");
            }
            // this is just two line breaks
            System.out.println("\n\n");
        }
        System.out.println("Done!");
    }
}

