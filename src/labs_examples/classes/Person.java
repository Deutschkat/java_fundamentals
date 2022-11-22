package labs_examples.classes;

public class Person {

    // instance variable
   public int age;
   public double height;
   public String name;


    // constructors // a method with no return that gets called when the keyword "new" is used.
    public Person(){} // for a default constructor to use with

    public Person(int age, double height, String name) {
        this.age = age;
        this.height = height; //parameterized constructor
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    // methods
    //...
}

