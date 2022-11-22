package labs_examples.repl;

public class ObjectCompositionMain {
    public static void main(String[] args) {

        Engine myEngine = new Engine(250);
        Stereo myStereo = new Stereo("Sony");
        Car myCar = new Car(myEngine, myStereo, "Ford F-150", "black");

        System.out.println("I drive a " + myCar.color + " " + myCar.model +
                " with an old " +myCar.stereo.brand + " stereo, and a " + myCar.engine.horsePower +
                " horse power engine");
    }
}
