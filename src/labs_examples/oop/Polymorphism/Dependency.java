package labs_examples.oop.Polymorphism;

public class Dependency {
//Dependency injection
    MotorizedTransport transport;

    public Dependency(MotorizedTransport transport) {
        this.transport = transport;
    }

    public void testMethods(){
        transport.start();
        transport.accelerate(20);
        transport.decelerate(10);
        transport.stop();
        System.out.println("------------------------");
    }

    public void setTransport(MotorizedTransport transport) {
        this.transport = transport;
    }
}
