package objects_classes_methods.labs.objects;

/**
 * Created by ryandesmond - https://codingnomads.co
 * /
 * */

class Example {

    public static void main(String[] args){

        Engine myEngine = new Engine(400);

        Stereo myStereo = new Stereo("Panasonic");

        Car myCar = new Car(myEngine, myStereo, "XTerra", "Blue");

        System.out.println("I drive a " + myCar.color + " " + myCar.model + " with a "

                + myCar.stereo.brand + " stereo, and a " + myCar.engine.horsePower + " engine");

    }

}

class Engine {

    double horsePower;

    public Engine(double horsePower){

        this.horsePower = horsePower;

    }

}

class Stereo {

    String brand;

    public Stereo(String brand){

        this.brand = brand;

    }

}

class Car {

    Engine engine;

    Stereo stereo;

    String model;

    String color;

    public Car(Engine engine, Stereo stereo, String model, String color){

        this.engine = engine;

        this.stereo = stereo;

        this.model = model;

        this.color = color;

    }

}

