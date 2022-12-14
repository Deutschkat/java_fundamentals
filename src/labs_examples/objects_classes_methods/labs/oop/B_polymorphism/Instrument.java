package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Instrument implements StoreInterface {

    private String name;
    private String brand;
    private int numInstruments;
    private double cost;

    public Instrument(String name, String brand, int numInstruments, double cost) {
        this.name = name;
        this.brand = brand;
        this.numInstruments = numInstruments;
        this.cost = cost;
    }

    public void scan() {
        System.out.println("Item scanned.");
    }

    public void total(double totalCost) {
        System.out.println("Total cost is: ");
    }

    public void paid(){
        System.out.println("This much has been paid.");
    }

    public void bye(){
        System.out.println("Have a good day!");
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
}
