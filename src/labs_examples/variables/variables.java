package labs_examples.variables;

public class variables {

    static double val = 123.45; // could be used everywhere. stopped 8 min into video.

    public static void main(String[] args) {
        int x = multiply(2,3);
    }

    //example of a local variable
    public static int multiply(int a, int b){
        int result = a * b;
        printNum(result);
        return result;
    }
// a and b would be parameters
    public static void printNum(int numToPrint){
        System.out.println(numToPrint);
    }
}
