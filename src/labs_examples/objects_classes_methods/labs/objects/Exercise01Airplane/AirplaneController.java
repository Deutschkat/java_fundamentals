package labs_examples.objects_classes_methods.labs.objects.Exercise01Airplane;

public class AirplaneController {
    public static void main(String[] args) {

        Engine planeOneEngine = new Engine(16000, "combustion");
        Cockpit planeOneCockpit = new Cockpit(3, true, "touch screen avionics");
        Fuselage planeOneFuselage = new Fuselage("aluminum", 300, 1);
        Propeller planeOnePropeller = new Propeller(3, "aluminum");
        Airplane planeOne = new Airplane(4500, 3000, planeOnePropeller, planeOneCockpit, planeOneFuselage, planeOneEngine);

        System.out.println(planeOne.toString());

    }
}
