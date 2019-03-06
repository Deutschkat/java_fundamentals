package labs_examples.inheritance.examples;

// A multilevel hierarchy.
class TwoDShape7 {
    private double width;
    private double height;

    // A default constructor.
    TwoDShape7() {
        width = height = 0.0;
    }

    // Parameterized constructor.
    TwoDShape7(double w, double h) {
        width = w;
        height = h;
    }

    // Construct object with equal width and height.
    TwoDShape7(double x) {
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

// Extend TwoDShape.
class Triangle7 extends TwoDShape7 {
    private String style;

    // A default constructor.
    Triangle7() {
        super();
        style = "none";
    }

    Triangle7(String s, double w, double h) {
        super(w, h); // call superclass constructor

        style = s;
    }

    // One argument constructor.
    Triangle7(double x) {
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

// Extend Triangle.
class ColorTriangle extends Triangle7 {
    private String color;

    ColorTriangle(String c, String s,
                  double w, double h) {
        super(s, w, h);

        color = c;
    }

    String getColor() { return color; }

    void showColor() {
        System.out.println("Color is " + color);
    }
}

class Shapes6 {
    public static void main(String args[]) {
        ColorTriangle t1 =
                new ColorTriangle("Blue", "outlined", 8.0, 12.0);
        ColorTriangle t2 =
                new ColorTriangle("Red", "filled", 4.0, 2.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.area());
    }
}
