package labs_examples.variables;

public class person {

        String name;
        int age;
        static int numPersonsCreated;

    public person (String name, int age) {
        this.name = name;
        this.age = age;
        numPersonsCreated++;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numPersonsCreated=" + numPersonsCreated +
                '}';
    }

}
