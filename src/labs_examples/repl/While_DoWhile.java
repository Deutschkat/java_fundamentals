package labs_examples.repl;

public class While_DoWhile {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        do {
            System.out.println(x);
            x = x + 5;
        } while (x <= 100);

        System.out.println();
        System.out.println("Now for the while loop:");
        System.out.println();

        while (y <= 100) {
            System.out.println(y);
            y = y + 3;
        }

    }
}
