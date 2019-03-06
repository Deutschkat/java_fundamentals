package labs_examples.inheritance.examples;

import java.lang.Override;

/**
 * Created by ryandesmond on 3/27/17.
 */
public class Animal {

    private boolean hasFur;
    private boolean seaDwelling;
    private int age;
    private double weight;
    private String color;
    private String geography;
    private boolean liveBorn;
    private String sound;

    public Animal(){};

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public boolean isSeaDwelling() {
        return seaDwelling;
    }

    public void setSeaDwelling(boolean seaDwelling) {
        this.seaDwelling = seaDwelling;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGeography() {
        return geography;
    }

    public void setGeography(String geography) {
        this.geography = geography;
    }

    public boolean isLiveBorn() {
        return liveBorn;
    }

    public void setLiveBorn(boolean liveBorn) {
        this.liveBorn = liveBorn;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "hasFur=" + hasFur +
                ", seaDwelling=" + seaDwelling +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", geography='" + geography + '\'' +
                ", liveBorn=" + liveBorn +
                ", sound='" + sound + '\'' +
                '}';
    }
}

