package datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below

    }

}

// src: https://www.geeksforgeeks.org/generics-in-java/
// A Simple Java program to show working of user defined Generic classes

// We use < > to specify Parameter type - This class is Generic
// when created by the user the user must provide the data type to be used
// when compiled, the user defined data type will replace "T" in all locations
class Test<T>
{
    // An object of type T is declared
    T obj;

    // constructor
    Test(T obj) {
        this.obj = obj;
    }
    // getter method that returns type "T"
    public T getObject(){
        return this.obj;
    }
}

// Driver class to test above
class Main
{
    public static void main (String[] args)
    {
        // instance of Integer type
        Test <Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test <String> sObj =
                new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}