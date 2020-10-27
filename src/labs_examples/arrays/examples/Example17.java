package labs_examples.arrays.examples;

// Introduce String.
class StringDemo {
    public static void main(String args[]) {
        // declare strings in various ways
        String str1 = new String("Java strings are objects.");
        String str2 = "They are constructed various ways.";
        String str3 = new String(str2);

        String test = "this is a string";
        test = "this is a new string";

        String b = " This" + " is " + "a " + "String";


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(test);
        System.out.println(b);
    }
}