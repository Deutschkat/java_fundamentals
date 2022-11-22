package labs_examples.objects_classes_methods.labs.objects;

public class Refrigerator {

    private boolean isDoubleWide;
    private String brand;
    private double volume;

    public Refrigerator(boolean isDoubleWide, String brand, double volume) {
        this.isDoubleWide = isDoubleWide;
        this.brand = brand;
        this.volume = volume;
    }

    public boolean isDoubleWide() {
        return isDoubleWide;
    }

    public void setDoubleWide(boolean doubleWide) {
        isDoubleWide = doubleWide;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "isDoubleWide=" + isDoubleWide +
                ", brand='" + brand + '\'' +
                ", volume=" + volume +
                '}';
    }
}
