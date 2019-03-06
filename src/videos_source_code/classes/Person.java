package videos_source_code.classes;

/**
 * Created by ryandesmond - https://codingnomads.co
 *
 * THIS CLASS IS CALLED A POJO
 *
 * A POJO is a Plain Old Java Object
 */
public class Person {

    // instance variables
    public int age;
    public double height;
    public String name;

    // constructors
    public Person(){}

    public Person(int age, double height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    // methods
    // ...


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}

