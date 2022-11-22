package labs_examples.repl;

import labs_examples.classes.Person;

public class JavaObjects {
    public static void main(String[] args) {


        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "Chris";
        person1.age = 37;

        person2.name = "Kat";
        person2.age = 30;

        System.out.println("Person 1 is named " + person1.name +
                " and they are " + person1.age + " years old.");

        System.out.println("Person 2 is named " + person2.name +
                " and they are " + person2.age + " years old.");

    }
}
