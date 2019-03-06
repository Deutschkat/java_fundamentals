package videos_source_code.oop.polymorphism;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Scooter implements MotorizedTransport {

    @Override
    public boolean start() {
        System.out.println("start scooter");
        return false;
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
