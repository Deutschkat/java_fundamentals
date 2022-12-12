package labs_examples.oop.inheritance;

import labs_examples.oop.Polymorphism.MotorizedTransport;

public class Vehicle implements MotorizedTransport {

    protected String make;
    protected String model;
    protected double miles;
    public final double PI = 3.1417; // final variables always capitalized

    public Vehicle(String make, String model, double miles) {
        this.make = make;
        this.model = model;
        this.miles = miles;
    }
// if you were to put "Final" before void, the override would break


    @Override
    public boolean start() {
        System.out.println("starting vehicle");
        return true;
    }

    @Override
    public void stop() {
        System.out.println("stopping vehicle");
    }

    @Override
    public void accelerate(double mph) {
        System.out.println("accelerating vehicle");
    }

    @Override
    public void decelerate(double mph) {
        System.out.println("decelerating vehicle");

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
