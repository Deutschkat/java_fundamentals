package labs_examples.static_nonstatic.labs;

public class ClassA {

    public static void main(String[] args) {
        // From static to nonstatic

        printStatic();

        ClassA obj = new ClassA();
        obj.printNonStatic();

        ClassB.printStaticB();

        ClassB obj2 = new ClassB();
        obj2.printNonStaticB();

        //From nonstatic to static



    }

    public static void printStatic(){
        System.out.println("This is a static method");
    }

    public void printNonStatic(){
        System.out.println("This is a nonstatic method");
        printAnotherNonstatic(); // 5
    }

    public void printAnotherNonstatic(){
        System.out.println("Another nonstatic printed method.");
        printStatic(); // 7

    }


}

class ClassB {

    public static void printStaticB(){
        System.out.println("This is a static method in B class");
    }

    public void printNonStaticB(){
        System.out.println("This is a nonstatic method in B class");
        ClassA obj3 = new ClassA();
        obj3.printAnotherNonstatic(); // 6

        ClassA.printStatic();



    }





}