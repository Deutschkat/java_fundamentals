package videos_source_code.classes;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class PersonController2 {

    public static void main(String[] args) {

        Person somePerson = new Person(36, 75, "Ryan");
        Person someOtherPerson = new Person(33, 65, "Kim");

        System.out.println("the first person is named " + somePerson.name +
                " he/she is " + somePerson.height + " inches tall and he/she is " +
                somePerson.age + " years old");

        System.out.println("the second person is named " + someOtherPerson.name +
                " he/she is " + someOtherPerson.height + " inches tall and he/she is " +
                someOtherPerson.age + " years old");

    }
}
