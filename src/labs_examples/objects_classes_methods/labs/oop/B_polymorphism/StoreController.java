package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import labs_examples.oop.Polymorphism.Dependency;

public class StoreController {

    public static void main(String[] args) {


        Instrument customer1 = new Instrument("Drum Kit","Pearl", 2, 659.00,1318.00);
        Guitar customer2 = new Guitar("RG421PB Electric Guitar","Ibanez",1,399.99,400.00,6);

        //Using the injected dependency for an item that is specified (guitar)
        DependencyForInterface example = new DependencyForInterface(customer2);
        example.interfaceMethods();

        //Using the injected dependency for an item that is non-specific with no method overriding (a drum kit)
        DependencyForInterface example2 = new DependencyForInterface(customer1);
        example2.interfaceMethods();







    }
}
