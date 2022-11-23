package labs_examples.objects_classes_methods.labs.objects.Exercise01Airplane;

public class Engine {

    private double engineHorsePower;
    private String engingType;

    public Engine(double engineHorsePower, String engingType) {
        this.engineHorsePower = engineHorsePower;
        this.engingType = engingType;
    }

    public double getEngineHorsePower() {
        return engineHorsePower;
    }

    public void setEngineHorsePower(double engineHorsePower) {
        this.engineHorsePower = engineHorsePower;
    }

    public String getEngingType() {
        return engingType;
    }

    public void setEngingType(String engingType) {
        this.engingType = engingType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineHorsePower=" + engineHorsePower +
                ", engingType='" + engingType + '\'' +
                '}';
    }
}
