package labs_examples.objects_classes_methods.labs.objects.Exercise01Airplane;

public class Airplane {
    private double fuelCapacity;
    private double currentFuelLevel;

    private Propeller planeOnePropeller;
    private Cockpit planeOneCockpit;
    private Fuselage planeOneFuselage;
    private Engine planeOneEngine;

    public Airplane(double fuelCapacity, double currentFuelLevel, Propeller planeOnePropeller, Cockpit planeOneCockpit, Fuselage planeOneFuselage, Engine planeOneEngine) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.planeOnePropeller = planeOnePropeller;
        this.planeOneCockpit = planeOneCockpit;
        this.planeOneFuselage = planeOneFuselage;
        this.planeOneEngine = planeOneEngine;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public Propeller getPlaneOnePropeller() {
        return planeOnePropeller;
    }

    public void setPlaneOnePropeller(Propeller planeOnePropeller) {
        this.planeOnePropeller = planeOnePropeller;
    }

    public Cockpit getPlaneOneCockpit() {
        return planeOneCockpit;
    }

    public void setPlaneOneCockpit(Cockpit planeOneCockpit) {
        this.planeOneCockpit = planeOneCockpit;
    }

    public Fuselage getPlaneOneFuselage() {
        return planeOneFuselage;
    }

    public void setPlaneOneFuselage(Fuselage planeOneFuselage) {
        this.planeOneFuselage = planeOneFuselage;
    }

    public Engine getPlaneOneEngine() {
        return planeOneEngine;
    }

    public void setPlaneOneEngine(Engine planeOneEngine) {
        this.planeOneEngine = planeOneEngine;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", planeOnePropeller=" + planeOnePropeller +
                ", planeOneCockpit=" + planeOneCockpit +
                ", planeOneFuselage=" + planeOneFuselage +
                ", planeOneEngine=" + planeOneEngine +
                '}';
    }
}


