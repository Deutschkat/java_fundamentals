package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class DependencyForInterface {

    StoreInterface storeFront; // instance variable

    public DependencyForInterface(StoreInterface storeFront) {
        this.storeFront = storeFront;
    }

    public void interfaceMethods(){
        storeFront.scan();
        storeFront.total(0.00);
        storeFront.paid(0.00);
        storeFront.bye();
        System.out.println("-----------------------------");
    }

    public void setStoreFront(StoreInterface storeFront) {
        this.storeFront = storeFront;
    }
}
