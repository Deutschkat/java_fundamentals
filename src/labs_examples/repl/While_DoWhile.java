package labs_examples.repl;

public class While_DoWhile {

    public static void main(String[] args) {

        int x = 0;

        do {
            System.out.println(x);
            x += 5;
        } while (x <= 100);

        System.out.println();
        System.out.println("Now for the while loop:");
        System.out.println();

        x = 0;

        while (x <= 100) {
            System.out.println(x);
            x = x + 3;
        }

    }
}
