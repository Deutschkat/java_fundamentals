package labs_examples.oop.encapsulation.animals;

// class level is the root of all encapsulation
public class Dog {

// access modifiers are the next level of encapsulation
    private String breed;
    private String name;
    private int age;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

