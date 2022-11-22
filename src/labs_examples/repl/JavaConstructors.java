package labs_examples.repl;

public class JavaConstructors {
    public static void main(String[] args) {

        Person newPerson = new Person("Kat", 30);
        Person anotherPerson = new Person("Chris", 37);

        System.out.println("Person one is named " + newPerson.name +
                " and they are " + newPerson.age + " years old.");
        System.out.println("Person two is named " + anotherPerson.name +
                " and they are " + anotherPerson.age + " years old.");

    }

    static class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
