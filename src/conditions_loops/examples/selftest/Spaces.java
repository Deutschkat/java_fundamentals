package conditions_loops.examples.selftest;

// Count spaces.
public class Spaces {
//    public static void main(String args[])
//            throws java.io.IOException {
//
//        char ch;
//        int spaces = 0;
//
//        System.out.println("Enter a period to stop.");
//
//        do {
//            ch = (char) System.in.read();
//            if(ch == ' ') spaces++;
//        } while(ch != '.');
//
//        System.out.println("Spaces: " + spaces);
//    }

    public static void main(String args[]){


        for (int count = 1; count < 100000; count *= 2){
            System.out.println(count);
        }


//        for (int i = 0; i < 10; i++) {
//            System.out.print(i + " ");
//            if ((i%2) == 0)
//                continue;
//            System.out.println();
//        }
    }
}