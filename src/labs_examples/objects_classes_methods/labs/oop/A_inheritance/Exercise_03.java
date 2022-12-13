package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer:
 * Because they are a hierarchy and it trickles downward. Prints the parent class first, then downward.
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
    }
}
