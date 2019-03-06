package videos_source_code.classes;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
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

        System.out.println("the first person is named " + somePerson.name +
            " he/she is " + somePerson.height + " inches tall and he/she is " +
            somePerson.age + " years old");

        System.out.println("the second person is named " + someOtherPerson.name +
                " he/she is " + someOtherPerson.height + " inches tall and he/she is " +
                someOtherPerson.age + " years old");


    }

}
