package labs_examples.objects_classes_methods.labs.objects.Exercise_3;

public class DogToyAssignController {
    public static void main(String[] args) {

        Dog pupOne = new Dog("Indiana");
        DogToy toyOne = new DogToy("purple", "stuffed unicorn");

        Dog pupTwo = new Dog("Rasmus");
        DogToy toyTwo = new DogToy("orange", "stuffed kangaroo");

        System.out.println(pupOne.name + " has a snazzy new " + toyOne.color + " " + toyOne.object);
        System.out.println(pupTwo.name + " has a snazzy new " + toyTwo.color + " " + toyTwo.object);

    }
}
