package labs_examples.lambdas.examples.method_references;

/**
 * Created by ryandesmond - https://codingnomads.co
 */

@FunctionalInterface
interface UserGenerator{
    User createUser(String firstName, String lastName);
}

public class ContructorReferences {
    public static void main(String[] args) {
        UserGenerator userGenerator = User :: new;
        User ryan = userGenerator.createUser("Ryan", "Desmond");
        User kim = userGenerator.createUser("Kim", "Desmond");
        System.out.println(kim.toString());
        System.out.println(ryan.toString());
    }
}

class User{
    String firstName;
    String lastName;

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}