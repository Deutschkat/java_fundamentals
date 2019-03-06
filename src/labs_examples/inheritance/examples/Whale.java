package labs_examples.inheritance.examples;

import java.lang.Override;

/**
 * Created by ryandesmond on 3/27/17.
 */
public class Whale extends Mammal {

    private boolean isOdontocetes;
    private boolean spotted;
    private int blubberThickness;
    private boolean isImprisonedInSeaWorld;

    public Whale(boolean isOdontocetes,
                 boolean spotted,
                 int blubberThickness,
                 boolean isImprisonedInSeaWorld) {
        this.isOdontocetes = isOdontocetes;
        this.spotted = spotted;
        this.blubberThickness = blubberThickness;
        this.isImprisonedInSeaWorld = isImprisonedInSeaWorld;
    }

    public boolean isOdontocetes() {
        return isOdontocetes;
    }

    public void setOdontocetes(boolean odontocetes) {
        isOdontocetes = odontocetes;
    }

    public boolean isSpotted() {
        return spotted;
    }

    public void setSpotted(boolean spotted) {
        this.spotted = spotted;
    }

    public int getBlubberThickness() {
        return blubberThickness;
    }

    public void setBlubberThickness(int blubberThickness) {
        this.blubberThickness = blubberThickness;
    }

    public boolean isImprisonedInSeaWorld() {
        return isImprisonedInSeaWorld;
    }

    public void setImprisonedInSeaWorld(boolean imprisonedInSeaWorld) {
        isImprisonedInSeaWorld = imprisonedInSeaWorld;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Whale{" +
                "isOdontocetes=" + isOdontocetes +
                ", spotted=" + spotted +
                ", blubberThickness=" + blubberThickness +
                ", isImprisonedInSeaWorld=" + isImprisonedInSeaWorld +
                '}';
    }


}
