package labs_examples.objects_classes_methods.examples.advanced;

// Use a static variable.
class StaticDemo {
    int x;
    static int y;

    int sum() {
        return x + y;
    }
}

class SDemo {
    public static void main(String args[]) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // Each object has its own copy of an instance variable.
        ob1.x = 10;
        ob2.x = 20;

        StaticDemo.y = 2;

        int xx = ob1.sum();
        int yy = ob2.sum();

        System.out.println("ob1 sum = " + xx);
        System.out.println("ob2 sum = " + yy);
    }
}