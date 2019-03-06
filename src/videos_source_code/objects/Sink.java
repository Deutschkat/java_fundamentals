package videos_source_code.objects;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Sink {

    private boolean dualSink;
    private String brand;
    private String basinType;

    public Sink(boolean dualSink, String brand, String basinType) {
        this.dualSink = dualSink;
        this.brand = brand;
        this.basinType = basinType;
    }

    public boolean isDualSink() {
        return dualSink;
    }

    public void setDualSink(boolean dualSink) {
        this.dualSink = dualSink;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBasinType() {
        return basinType;
    }

    public void setBasinType(String basinType) {
        this.basinType = basinType;
    }

    @Override
    public String toString() {
        return "Sink{" +
                "dualSink=" + dualSink +
                ", brand='" + brand + '\'' +
                ", basinType='" + basinType + '\'' +
                '}';
    }
}
