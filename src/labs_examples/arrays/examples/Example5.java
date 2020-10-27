package labs_examples.arrays.examples;

/*
   Demonstrate the Bubble sort.
*/

class Bubble {
    public static void main(String args[]) {
        String str[] = {"this", "is", "a", "bubble", "sort!"};

        int a, b;
        int size;
        String t;


        // display original array
        System.out.print("Original array is:");
        for(int i=0; i < str.length; i++)
            System.out.print(" " + str[i]);

        System.out.println();

        // This is the bubble sort.
        for(a=1; a < str.length; a++) {
            for (b = str.length - 1; b >= a; b--) {
                if (str[b - 1].compareTo(str[b]) > 1) { // if out of order
                    t = str[b - 1];
                    str[b - 1] = str[b];
                    str[b] = t;
                }
            }
        }

        String str2 = "sorter";
        int i = str2.indexOf('r');
        int y = str2.lastIndexOf('r');

        System.out.println(i);
        System.out.println(y);
    }
}