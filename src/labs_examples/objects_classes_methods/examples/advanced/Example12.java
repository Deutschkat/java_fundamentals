package labs_examples.objects_classes_methods.examples.advanced;

// Demonstrate an overloaded constructor.
class MyClass3 {
    int x;
    int j;

    MyClass3() {
        System.out.println("Inside MyClass().");
        x = 0;
    }

    MyClass3(int i) {
        System.out.println("Inside MyClass(int).");
        x = i;
    }

    MyClass3(double d) {
        System.out.println("Inside MyClass(double).");
        x = (int) d;
    }

    MyClass3(int i, int j) {
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    }


}

class OverloadConsDemo {
    public static void main(String args[]) {
        MyClass3 t1 = new MyClass3();
        MyClass3 t2 = new MyClass3(88);
        MyClass3 t3 = new MyClass3(17.23);
        MyClass3 t4 = new MyClass3(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}