package videos_source_code.oop.polymorphism;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Dependency {

    MotorizedTransport transport;

    public Dependency(MotorizedTransport transport) {
        this.transport = transport;
    }

    public void testMethods(){
        transport.start();
        transport.accelerate(20);
        transport.stop();
        System.out.println("--------------------------");
    }

    public void setTransport(MotorizedTransport transport) {
        this.transport = transport;
    }
}
