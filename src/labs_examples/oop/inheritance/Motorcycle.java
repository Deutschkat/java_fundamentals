package labs_examples.oop.inheritance;

public class Motorcycle extends Vehicle {

    //TIP : if you extend from parent class before creating constructors it will
    //do it automatically.

    private int cc;
    private boolean twoSeat;

    public Motorcycle(String make, String model, double miles, int cc, boolean twoSeat) {
        super(make, model, miles);
        this.cc = cc;
        this.twoSeat = twoSeat;
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

//    public void demonstrateThisSuper(){
//        this.accelerate(20);
//        super.accelerate(30);
//    }

    @Override // shows how this overrode the parent accelerate method
    public void accelerate(double mph){
        System.out.println("motorcycle accelerating");
    }

}
