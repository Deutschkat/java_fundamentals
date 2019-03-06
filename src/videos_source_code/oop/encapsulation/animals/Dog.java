package videos_source_code.oop.encapsulation.animals;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
// the class is the root of all encapsulation
// the Dog class can't affect/access the City class and vice versa
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
