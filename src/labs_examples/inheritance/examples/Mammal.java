package labs_examples.inheritance.examples;

import java.lang.Override;

/**
 * Created by ryandesmond on 3/27/17.
 */
public class Mammal extends Animal {

    private final boolean liveBorn = true;
    private final boolean isHasSpine = true;
    private final boolean isWarmBlooded = true;

    private int numLegs;

    public Mammal(){}

    public Mammal(int numLegs) {
        this.numLegs = numLegs;
    }

    public boolean isLiveBorn() {
        return liveBorn;
    }

    public boolean isHasSpine() {
        return isHasSpine;
    }

    public boolean isWarmBlooded() {
        return isWarmBlooded;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Mammal{" +
                "liveBorn=" + liveBorn +
                ", isHasSpine=" + isHasSpine +
                ", isWarmBlooded=" + isWarmBlooded +
                ", numLegs=" + numLegs +
                '}';
    }
}
