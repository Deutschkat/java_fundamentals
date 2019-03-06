package labs_examples.objects_classes_methods.examples.advanced;

// Add f(byte).
class Overload3 {
    void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}

class TypeConv2 {
    public static void main(String args[]) {
        Overload3 ob = new Overload3();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;


        ob.f(i); // calls ob.f(int)
        ob.f(d); // calls ob.f(double)

        ob.f(b); // calls ob.f(byte) -- now, no type conversion

        ob.f(s); // calls ob.f(int) -- type conversion
        ob.f(f); // calls ob.f(double) -- type conversion
    }
}