package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Guitar extends Instrument {

    private int numStrings;

    public Guitar(String name, String brand, int numInstruments, double cost, int numStrings) {
        super(name, brand, numInstruments, cost);
        this.numStrings = numStrings;
    }



    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
}
