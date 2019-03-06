package videos_source_code.oop.polymorphism;


import videos_source_code.oop.inheritance.MotorCycle;
import videos_source_code.oop.inheritance.Sedan;
import videos_source_code.oop.inheritance.Truck;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class DependencyInjectionController {

    public static void main(String[] args) {

        Truck truck = new Truck("Ford", "F150", 120000, 500);
        Sedan sedan = new Sedan("Honda", "Civic", 60000, 80);

        MotorCycle moto = new MotorCycle("Ducati", "Monster", 500, 1000, false);

        Dependency example = new Dependency(truck);
        example.testMethods();

        example.setTransport(sedan);
        example.testMethods();

        example.setTransport(moto);
        example.testMethods();

    }

}
