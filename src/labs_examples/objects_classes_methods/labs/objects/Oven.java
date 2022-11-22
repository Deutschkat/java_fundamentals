package labs_examples.objects_classes_methods.labs.objects;

public class Oven {

    private boolean gasRange;
    private int maxTemp;
    private String brand;

    public Oven(boolean gasRange, int maxTemp, String brand) {
        this.gasRange = gasRange;
        this.maxTemp = maxTemp;  //Constructer use Alt Insert
        this.brand = brand;
    }

    public boolean isGasRange() {
        return gasRange;
    }

    public void setGasRange(boolean gasRange) {
        this.gasRange = gasRange;
    }

    public int getMaxTemp() { //Getter n Setter Alt Insert
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "gasRange=" + gasRange +  //To String Alt Insert
                ", maxTemp=" + maxTemp +
                ", brand='" + brand + '\'' +
                '}';
    }
}
