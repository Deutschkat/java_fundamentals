package labs_examples.datastructures_algorithms.examples.hashmap.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class JavaHashMapExample {

    public static void main(String[] args){

        // create the hashmap
        // the "key" will be the email, a String
        // the "value" will the Person object
        HashMap<String, Person> peopleMap = new HashMap();

        // create a few Person objects
        Person ryan = new Person("Ryan", "Desmond", "ryan@codingnomads.co");
        Person kim = new Person("Kim", "Desmond", "kim@codingnomads.co");
        Person martin = new Person("Martin", "Breuss", "martin@codingnomads.co");
        Person caden = new Person("Caden", "Mackenzie", "caden@codingnomads.co");

        // "put" the Person objects into the HashMap
        peopleMap.put(ryan.getEmail(), ryan);
        peopleMap.put(kim.getEmail(), kim);
        peopleMap.put(martin.getEmail(), martin);
        peopleMap.put(caden.getEmail(), caden);



        // demonstrate "getting" an element out of the HashMap
        Person example = peopleMap.get("caden@codingnomads.co");

        System.out.println(example.toString());

        // demonstrate iterating through the entries of a HashMap
        Set entries = peopleMap.entrySet();
        Iterator iterator = entries.iterator();

        // loop through the entries
        while(iterator.hasNext()) {
            // get each Entry individually
            Map.Entry person = (Map.Entry)iterator.next();
            // print out the entry's key and value
            System.out.print("The key is: "+ person.getKey()
                    + " and the value is: " + person.getValue().toString());
        }
    }
}

class Person {
    private String firstName;
    private String lastName;
    private String email;

    public Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
