package labs_examples.static_nonstatic.examples;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ClassA {

    public static void main(String[] args) {

        // SAME CLASS ----------------------------- SAME CLASS
        // calling static method in same class
        staticMethod();

        // calling non-static methods in same class (create an object first)
        ClassA thisClass = new ClassA();
        thisClass.nonStaticMethod1();
        int x = thisClass.nonStaticReturnMethod(2,3);



        // DIFFERENT CLASSES ----------------------------- DIFFERENT CLASSES
        // calling a static method in another class (use the class name)
        ClassB.staticMethod();

        // calling a non-static method in another class (use an object)
        ClassB thatClass = new ClassB();
        thatClass.nonStaticMethod();

    }

    public static void staticMethod(){
        System.out.println("ClassA staticMethod printing");
    }

    public void nonStaticMethod1(){
        System.out.println("ClassA nonStaticMethod1 printing");

    }

    public int nonStaticReturnMethod(int a, int b){
        System.out.println("ClassA nonStaticReturnMethod printing");
        return a * b;
    }

}
