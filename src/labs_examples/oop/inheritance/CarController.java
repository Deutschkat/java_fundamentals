package labs_examples.oop.inheritance;

public class CarController {

    public static void main(String[] args) {

        Truck truck = new Truck("Ford", "F-150", 80000, 900);
        Sedan sedan = new Sedan("Honda", "Civic", 70000, 500);

        Motorcycle moto = new Motorcycle("Ducati", "Monster", 500, 1000, false);


        System.out.println(sedan.getMake());
        sedan.accelerate(20);

        System.out.println(truck.getModel());
        truck.accelerate(19);

        System.out.println(moto.getMake() + " "  + moto.getModel() + " with " + moto.getMiles() + " miles and " + moto.getCc() + " CC.");
        moto.accelerate(30);

      //  moto.demonstrateThisSuper(); here just for reference

    }
}
