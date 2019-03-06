package labs_examples.inheritance.examples;

class TwoDShape8 {
    private double width;
    private double height;

    // A default constructor.
    TwoDShape8() {
        width = height = 0.0;
    }

    // Parameterized constructor.
    TwoDShape8(double w, double h) {
        width = w;
        height = h;
    }

    // Construct object with equal width and height.
    TwoDShape8(double x) {
        width = height = x;
    }

    // Construct an object from an object.
    TwoDShape8(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
    }

    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

// A subclass of TwoDShape for triangles.
class Triangle8 extends TwoDShape8 {
    private String style;

    // A default constructor.
    Triangle8() {
        super();
        style = "none";
    }

    // Constructor for Triangle.
    Triangle8(String s, double w, double h) {
        super(w, h); // call superclass constructor

        style = s;
    }

    // One argument constructor.
    Triangle8(double x) {
        super(x); // call superclass constructor

        style = "filled";
    }

    // Construct an object from an object.
    Triangle8(Triangle ob) {
        super(ob); // pass object to TwoDShape constructor
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

//class Shapes7 {
//    public static void main(String args[]) {
//        Triangle8 t1 =
//                new Triangle8("outlined", 8.0, 12.0);
//
//        // make a copy of t1
//        //Triangle8 t2 = new Triangle8(t1);
//
//        System.out.println("Info for t1: ");
//        t1.showStyle();
//        t1.showDim();
//        System.out.println("Area is " + t1.area());
//
//        System.out.println();
//
//        System.out.println("Info for t2: ");
//        t2.showStyle();
//        t2.showDim();
//        System.out.println("Area is " + t2.area());
//    }
//}