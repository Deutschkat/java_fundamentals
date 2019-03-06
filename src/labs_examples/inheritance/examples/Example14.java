package labs_examples.inheritance.examples;

// A superclass reference can refer to a subclass object.
//class X {
//    int a;
//
//    X(int i) { a = i; }
//}
//
//class Y extends X {
//    int b;
//
//    Y(int i, int j) {
//        super(j);
//        b = i;
//    }
//}
//
//class SupSubRef {
//    public static void main(String args[]) {
//        X x = new X(10);
//        X x2;
//        Y y = new Y(5, 6);
//
//        x2 = x; // OK, both of same type
//        System.out.println("x2.a: " + x2.a);
//
//        x2 = y; // still Ok because Y is derived from X
//        System.out.println("x2.a: " + x2.a);
//
//        // X references know only about X members
//        x2.a = 19; // OK
////    x2.b = 27; // Error, X doesn't have a b member
//    }
//}
