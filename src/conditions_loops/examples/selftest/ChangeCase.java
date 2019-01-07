package conditions_loops.examples.selftest;

// Change case.
public class ChangeCase {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        int changes = 0;

        System.out.println("Enter period to stop.");
        //Scanner input = new Scanner(System.in);

        do {
            ch = (char) System.in.read();
            if(ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            }
            else if(ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        } while(ch != '.');
        System.out.println("Case changes: " + changes);
    }
}