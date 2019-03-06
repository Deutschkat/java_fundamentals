package labs_examples.inheritance.examples;

abstract class Circle extends TwoDShape9 {


    // A default constructor.
    Circle() {
        super();
    }

    // Construct Circle
    Circle(double x) {
        super(x, "circle"); // call superclass constructor
    }

    // Construct an object from an object.
    Circle(Circle ob) {
        super(ob); // pass object to TwoDShape constructor
    }

    double area() {
        return (getWidth() / 2) * (getWidth() / 2) * 3.1416;
    }

    public abstract int testAbstract();

}