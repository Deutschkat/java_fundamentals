package videos_source_code.oop.inheritance;


import videos_source_code.oop.polymorphism.Scooter;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class CarController {

    public static void main(String[] args) {

        Truck truck = new Truck("Ford", "F150", 120000, 500);
        Sedan sedan = new Sedan("Honda", "Civic", 60000, 80);

        MotorCycle moto = new MotorCycle("Ducati", "Monster", 500, 1000, false);

//        System.out.println(truck.getMake() + " " + truck.getModel()
//            + " " + truck.getBedCapacity());
//        truck.accelerate(10);
//
//
//        System.out.println(sedan.getMake() + " " + sedan.getModel()
//                + " " + sedan.getTrunkCapacity());
//        sedan.accelerate(20);
//
//
//        System.out.println(moto.getMake() + " " + moto.getModel()
//                + " " + moto.getCc());
//        moto.accelerate(30);
//
//        moto.demonstrateThisSuper();

        Scooter motorScooter = new Scooter();

        moto.start();
        motorScooter.start();

        moto.accelerate(100);
        motorScooter.accelerate(20);



    }

}
