package labs_examples.oop.inheritance;

public class CarController {

    public static void main(String[] args) {

        Truck truck = new Truck("Ford", "F-150", 80000, 900);
        Sedan sedan = new Sedan("Honda", "Civic", 70000, 500);


        System.out.println(sedan.getMake());
        System.out.println(truck.getModel());
    }
}
