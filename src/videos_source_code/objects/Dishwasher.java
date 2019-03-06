package videos_source_code.objects;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Dishwasher {

    private boolean isEnergyEfficient;
    private String brand;
    private int yearsOld;

    public Dishwasher(boolean isEnergyEfficient, String brand, int yearsOld) {
        this.isEnergyEfficient = isEnergyEfficient;
        this.brand = brand;
        this.yearsOld = yearsOld;
    }

    public boolean isEnergyEfficient() {
        return isEnergyEfficient;
    }

    public void setEnergyEfficient(boolean energyEfficient) {
        isEnergyEfficient = energyEfficient;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public String toString() {
        return "Dishwasher{" +
                "isEnergyEfficient=" + isEnergyEfficient +
                ", brand='" + brand + '\'' +
                ", yearsOld=" + yearsOld +
                '}';
    }
}
