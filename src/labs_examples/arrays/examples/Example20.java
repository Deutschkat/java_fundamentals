package labs_examples.arrays.examples;

// Use substring().
class SubStr {
    public static void main(String args[]) {
        String orgstr = "Java makes the Web move.";

        // construct a substring
        String substr = orgstr.substring(11, 18);


        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);

    }
}