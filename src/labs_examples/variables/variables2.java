package labs_examples.variables;
public class variables2 {

    //global variable. not commonly used, but sometimes needed.
    //field
    //instance variable
    static double val = 123.45;

    public static void main(String[] args) {

        person myPerson = new person("Kat", 29);
        myPerson.age = 30;
        person yourPerson = new person("Till", 50);
        person einstein = new person("Einstein", 110);
        person chris = new person("Chris",37);

        System.out.println(myPerson.toString());
        System.out.println(yourPerson.toString());
        System.out.println(einstein.toString());
        System.out.println(chris.toString());



      //  double x = multiply(val, val * 2);
    }


    public static double multiply(double a, double b){
        double result = a * b;
        printNum(result);
        return result;
    }

    public static void printNum(double numToPrint){

        System.out.println(numToPrint);
        System.out.println(val);
    }

}
