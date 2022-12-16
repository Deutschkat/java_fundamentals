package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Instrument implements StoreInterface {

    private String name;
    private String brand;
    private int numInstruments;
    private double cost;

    private double totalPaid;


    public Instrument(String name, String brand, int numInstruments, double cost, double totalPaid) {
        this.name = name;
        this.brand = brand;
        this.numInstruments = numInstruments;
        this.cost = cost;
        this.totalPaid = totalPaid;
    }

    public void scan() {
        System.out.println("---------------------------------------------");
        System.out.println("Scanned " + getNumInstruments() + " " + getBrand() + " " + getName() + "(s).");
    }

    public void total(double cost) {
        System.out.println("Total cost is: " + (getNumInstruments() * getCost()));
    }

    public void paid(double totalPaid){
        System.out.println("Amount paid : $" + getTotalPaid());
        System.out.println("Change owed: $" + (getTotalPaid() - (getNumInstruments() * getCost())));
    }

    public void bye(){
        System.out.println("Have a good day! Enjoy your instrument(s)!");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumInstruments() {
        return numInstruments;
    }

    public void setNumInstruments(int numInstruments) {
        this.numInstruments = numInstruments;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }
}
