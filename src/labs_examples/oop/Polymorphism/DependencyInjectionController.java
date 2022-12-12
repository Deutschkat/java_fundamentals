package labs_examples.oop.Polymorphism;

import labs_examples.oop.inheritance.Motorcycle;
import labs_examples.oop.inheritance.Sedan;
import labs_examples.oop.inheritance.Truck;

public class DependencyInjectionController {
    public static void main(String[] args) {

        Motorcycle  moto = new Motorcycle("Ducati", "Monster", 500, 1000, false);
        Truck truck = new Truck("Ford", "F150", 120000, 500);
        Sedan sedan = new Sedan("Honda", "Civic", 60000, 80);

        Dependency example = new Dependency(truck);
        example.testMethods();

        example.setTransport(sedan);
        example.testMethods();

        example.setTransport(moto);
        example.testMethods();


    }
}
