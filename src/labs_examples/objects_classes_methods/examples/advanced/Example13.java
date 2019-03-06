package labs_examples.objects_classes_methods.examples.advanced;

// Initialize one object with another.
class Summation {
    int sum;
    int val;
    double rev;

    // Construct from an int.
    Summation(int num, int val, double rev) {
        this.sum = num;
        this.val = val;
        this.rev = rev;
    }

    // Construct from another object.
    Summation(Summation s1) {

        this.sum = s1.sum;
        this.val = s1.val;
        this.rev = s1.rev;
    }
}

class SumDemo {
    public static void main(String args[]) {
        Summation s1 = new Summation(5, 100, 200);
        Summation s2 = new Summation(s1);


        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s1.sum: " + s1.val);
        System.out.println("s1.sum: " + s1.rev);

        System.out.println("s2.sum: " + s2.sum);
        System.out.println("s2.sum: " + s2.val);
        System.out.println("s2.sum: " + s2.rev);

        Summation s3 = s2;

        s3.rev = 10;
        s3.sum = 10;
        s3.val = 10;

        System.out.println("s2.sum: " + s2.sum);
        System.out.println("s2.sum: " + s2.val);
        System.out.println("s2.sum: " + s2.rev);

        System.out.println("s3.sum: " + s3.sum);
        System.out.println("s3.sum: " + s3.val);
        System.out.println("s3.sum: " + s3.rev);
    }
}