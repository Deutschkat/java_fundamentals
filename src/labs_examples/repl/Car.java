package labs_examples.repl;

public class Car {

    Engine engine;

    Stereo stereo;
    String model;
    String color;

    public Car(Engine engine, Stereo stereo, String model, String color) {
        this.engine = engine;
        this.stereo = stereo;
        this.model = model;
        this.color = color;
    }
}
