package labs_examples.classes;

public class PersonController {
    public static void main(String[] args) {

        Person somePerson = new Person();
        Person someOtherPerson = new Person();

        somePerson.age = 36;
        somePerson.height = 75;
        somePerson.name = "Ryan";

        someOtherPerson.age = 33;
        someOtherPerson.height = 65;
        someOtherPerson.name = "Kim";

        System.out.println("The first person is named " + somePerson.name +
            " and he is " + somePerson.height + " inches tall." + " He is " + somePerson.age +
            " years old.");
        System.out.println("The second person is named " + someOtherPerson.name +
                " and she is " + someOtherPerson.height + " inches tall." + " She is " + someOtherPerson.age +
                " years old.");
    }
}
