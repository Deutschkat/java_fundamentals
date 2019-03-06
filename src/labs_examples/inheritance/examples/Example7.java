package labs_examples.inheritance.examples;

// Add more constructors to TwoDShape.
class TwoDShape6 {
    private double width;
    private double height;

    // A default constructor.
    TwoDShape6() {
        width = height = 0.0;
    }

    // Parameterized constructor.
    TwoDShape6(double w, double h) {
        width = w;
        height = h;
    }

    // Construct object with equal width and height.
    TwoDShape6(double x) {
        width = height = x;
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
class Triangle6 extends TwoDShape6 {
    private String style;

    // A default constructor.
    Triangle6() {
        super();
        style = "none";
    }

    // Constructor
    Triangle6(String s, double w, double h) {
        super(w, h); // call superclass constructor

        style = s;
    }

    // One argument constructor.
    Triangle6(double x) {
        super(x); // call superclass constructor

        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shapes5 {
    public static void main(String args[]) {
        Triangle6 t1 = new Triangle6();
        Triangle6 t2 = new Triangle6("outlined", 8.0, 12.0);
        Triangle6 t3 = new Triangle6(4.0);

        t1 = t2;

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());

        System.out.println();
    }
}