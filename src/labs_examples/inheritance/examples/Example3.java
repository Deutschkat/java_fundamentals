package labs_examples.inheritance.examples;

// Private members are not inherited.

// This example will not compile.

// A class for two-dimensional objects.
class TwoDShape2 {
    private double width;  // these are
    private double height; // now private

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}

// A subclass of TwoDShape for triangles.
class Triangle2 extends TwoDShape2 {
    String style;

//    double area() {
//        return width * height / 2; // Error! can't access
//    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
