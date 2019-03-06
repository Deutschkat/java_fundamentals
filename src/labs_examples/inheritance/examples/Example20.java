package labs_examples.inheritance.examples;

// Use dynamic method dispatch.
class TwoDShape9 {
    private double width;
    private double height;
    private String name;

    // A default constructor.
    TwoDShape9() {
        width = height = 0.0;
        name = "none";
    }

    // Parameterized constructor.
    TwoDShape9(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Construct object with equal width and height.
    TwoDShape9(double x, String n) {
        width = height = x;
        name = n;
    }

    // Construct an object from an object.
    TwoDShape9(TwoDShape9 ob) {
        width = ob.width;
        height = ob.height;
        //name = ob.name;
    }

    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }

    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}

// A subclass of TwoDShape for triangles.
class Triangle9 extends TwoDShape9 {
    private String style;

    // A default constructor.
    Triangle9() {
        super();
        style = "none";
    }

    // Constructor for Triangle.
    Triangle9(String s, double w, double h) {
        super(w, h, "triangle");

        style = s;
    }

    // One argument constructor.
    Triangle9(double x) {
        super(x, "triangle"); // call superclass constructor

        style = "filled";
    }

    // Construct an object from an object.
    Triangle9(Triangle9 ob) {
        super(ob); // pass object to TwoDShape constructor
        style = ob.style;
    }

    // Override area() for Triangle.
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

// A subclass of TwoDShape for Rectangle2s.
class Rectangle2 extends TwoDShape9 {
    // A default constructor.
    Rectangle2() {
        super();
    }

    // Constructor for Rectangle2.
    Rectangle2(double w, double h) {
        super(w, h, "Rectangle2"); // call superclass constructor
    }

    // Construct a square.
    Rectangle2(double x) {
        super(x, "Rectangle2"); // call superclass constructor
    }

    // Construct an object from an object.
    Rectangle2(Rectangle2 ob) {
        super(ob); // pass object to TwoDShape constructor
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    // Override area() for Rectangle2.
    double area() {
        return getWidth() * getHeight();
    }
}

class DynShapes {
    public static void main(String args[]) {
        TwoDShape9 shapes[] = new TwoDShape9[5];

        shapes[0] = new Triangle9("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle2(10);
        shapes[2] = new Rectangle2(10, 4);
        shapes[3] = new Triangle9(7.0);
        shapes[4] = new TwoDShape9(10, 20, "generic");

        for(int i=0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());

            System.out.println();
        }
    }
}
