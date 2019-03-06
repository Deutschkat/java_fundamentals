package labs_examples.objects_classes_methods.examples.advanced;

// Use a static block
class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

class SDemo3 {
    public static void main(String args[]) {
        StaticBlock ob = new StaticBlock("Inside Constructor");

        System.out.println("Square root of 2 is " +
                StaticBlock.rootOf2);
        System.out.println("Square root of 3 is " +
                StaticBlock.rootOf3);

    }
}