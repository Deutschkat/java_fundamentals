package labs_examples.datatypes_operators.examples;

/*
   Use the Pythagorean theorem to find
   find the length of the hypotenuse
   given the lengths of the two opposing
   sides.
*/
class Hypot {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;

        // calls sqrt() method from Math class
        z = Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is " +z);
    }
}