package videos_source_code.oop.inheritance;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class MotorCycle extends Vehicle {

    private int cc;
    private boolean twoSeat;

    public MotorCycle(String make, String model, double miles, int cc, boolean twoSeat) {
        super(make, model, miles);
        this.cc = cc;
        this.twoSeat = twoSeat;
    }

    public void demonstrateThisSuper(){
        this.accelerate(20);
        super.accelerate(30);
    }

    @Override
    public boolean start() {
        System.out.println("starting motorcycle");
        return false;
    }

    @Override
    public void accelerate(double mph){
        System.out.println("motorcycle accelerating");
        // steps to accelerate a motorcycle
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isTwoSeat() {
        return twoSeat;
    }

    public void setTwoSeat(boolean twoSeat) {
        this.twoSeat = twoSeat;
    }
}
