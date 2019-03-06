package videos_source_code.methods.pass_by_reference;


import videos_source_code.classes.Person;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class PassByRef {

    public static void main(String[] args) {
        Person ryan = new Person(36, 75, "Ryan");

        System.out.println(ryan.toString());

        addYearToPerson(ryan);

        System.out.println(ryan.toString());
    }

    public static void addYearToPerson(Person person){
        person.age = person.age + 1;
    }
}
