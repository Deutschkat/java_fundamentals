package videos_source_code.oop.static_nonstatic.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ClassA {

    public static void main(String[] args) {

        // calling static methods in the same class
        staticMethod();
        int x = multiply(23, 56);
        System.out.println(x);


        // calling non-static methods in the same class
        ClassA obj = new ClassA();
        obj.nonStaticMethod();
        double y = obj.multiply(12.34, 67.89);
        System.out.println(y);
        obj.nonStatic1();

        // calling static methods in another class
        ClassB.staticMethod();

        // calling a non-static method in another class
        ClassB obj2 = new ClassB();
        obj2.nonStaticMethod();

    }

    public static void staticMethod(){
        System.out.println("printing staticMethod");
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public void nonStaticMethod(){
        System.out.println("printing nonStaticMethod");
    }


    public double multiply(double a, double b){
        return a * b;
    }

    public void nonStatic1(){
        nonStatic2();
    }

    public void nonStatic2(){
        System.out.println("printing non-static 2");
    }
    
}
