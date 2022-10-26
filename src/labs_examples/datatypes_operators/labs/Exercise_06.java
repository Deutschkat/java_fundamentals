package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        float pi = 3.14f;
        float rad = 3.14f;
        int height = 5;

        float vol = (pi * ((rad * rad) * height));
        System.out.println(vol);

        float surfaceArea1 = ((2) * (pi) * (rad) * (5));
        float surfaceArea2 = ((2) * (pi) * (rad) * (rad));
        float totalSurfaceArea = surfaceArea1 + surfaceArea2;
        System.out.println(totalSurfaceArea);

        // Sorry, I'm not great with math, and I know there is probably a cleaner way to type these
        // out but I knew this would get the job done.





    }
}