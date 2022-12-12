package labs_examples.oop.inheritance;

public class Vehicle {

    protected String make;
    protected String model;
    protected double miles;

    public Vehicle(String make, String model, double miles) {
        this.make = make;
        this.model = model;
        this.miles = miles;
    }

    public void accelerate(double mph){
        System.out.println("Vehicle accelerating by " + mph + " mph");
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
