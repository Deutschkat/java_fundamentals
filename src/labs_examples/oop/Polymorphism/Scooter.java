package labs_examples.oop.Polymorphism;

public class Scooter implements MotorizedTransport{

    @Override
    public boolean start() {
        System.out.println("starting scooter");
        return true;
    }

    @Override
    public void stop() {
        System.out.println("stopping scooter");
    }

    @Override
    public void accelerate(double mph) {
        System.out.println("accelerating scooter");

    }

    @Override
    public void decelerate(double mph) {
        System.out.println("decelerating scooter");

    }
}
