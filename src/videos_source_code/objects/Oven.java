package videos_source_code.objects;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Oven {

    private boolean gasRange;
    private int maxTemp;
    private String brand;

    public Oven(boolean gasRange, int maxTemp, String brand) {
        this.gasRange = gasRange;
        this.maxTemp = maxTemp;
        this.brand = brand;
    }

    public boolean isGasRange() {
        return gasRange;
    }

    public void setGasRange(boolean gasRange) {
        this.gasRange = gasRange;
    }

    public int getMaxTemp() {
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
                "gasRange=" + gasRange +
                ", maxTemp=" + maxTemp +
                ", brand='" + brand + '\'' +
                '}';
    }
}
