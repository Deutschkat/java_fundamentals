package labs_examples.objects_classes_methods.examples;

// A parameterized constructor.

class MyClass {
    int x;

    MyClass(int i) {
        x = i;
    }
}

class ParmConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }
}