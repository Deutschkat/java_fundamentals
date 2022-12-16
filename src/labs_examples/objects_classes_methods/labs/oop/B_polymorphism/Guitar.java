package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Guitar extends Instrument {

    private int numStrings;

    public Guitar(String name, String brand, int numInstruments, double cost, double totalPaid, int numStrings) {
        super(name, brand, numInstruments, cost, totalPaid);
        this.numStrings = numStrings;
    }

    //Overriding example
    @Override
    public void scan() {
        System.out.println("---------------------------------------------");
        System.out.println("Scanned " + getNumInstruments() + " " + getBrand() + " " + getNumStrings() + " " + getName() + "(s).");
    }

    @Override
    public void total(double cost) {
        System.out.println("Total cost of purchase is: $" + (getNumInstruments()* getCost()) + ".");
    }

    @Override
    public void paid(double totalPaid) {
        System.out.println("Amount paid : $" + getTotalPaid());
        System.out.println("Change owed: $" + Math.ceil(getTotalPaid() - getCost())* 10 / 1000.0 );
    }

    @Override
    public void bye(){
        System.out.println("Have a good day! Enjoy your guitar(s)!");
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
}
