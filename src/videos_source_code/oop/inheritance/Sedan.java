package videos_source_code.oop.inheritance;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Sedan extends Vehicle {

    private double trunkCapacity;

    public Sedan(String make, String model, double miles, double trunkCapacity){
        super(make, model, miles);
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public boolean start() {
        System.out.println("starting sedan");
        return false;
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
}
