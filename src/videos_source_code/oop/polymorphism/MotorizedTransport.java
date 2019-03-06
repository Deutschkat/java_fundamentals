package videos_source_code.oop.polymorphism;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public interface MotorizedTransport {

    public boolean start();

    public void stop();

    public void accelerate(double mph);

    public void decelerate(double mph);

}
