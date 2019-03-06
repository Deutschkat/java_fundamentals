package labs_examples.datatypes_operators.examples;

/*
   Compute the distance to a lightening
   strke whose sound takes 7.2 seconds
   to reach you.
*/
class Sound {
    public static void main(String args[]) {
        double dist;

        dist = 7.2 * 1100;

        System.out.println("The lightening is " + dist +
                " feet away.");

    }
}