package labs_examples.lambdas.labs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaLabEx3 {
    public static void main(String[] args) {

        // Calling a static method reference
        BiFunction<Integer, Integer, Integer> referenceStatic = LambdaLabEx3::add;
        int x = referenceStatic.apply(20, 5);
        System.out.println("Static method reference product is: " + x);

        // Instance method reference
        // ** Did I do this correctly? =/ **

        Singer singer1 = new Singer("David Bowie");
        Song song1 = new Song("Ziggy Stardust");

        singer1.execute(song1, singer1::sing);

        Singer singer2 = new Singer("James Taylor");
        Song song2 = new Song("Fire and Rain");

        singer2.execute(song2, singer2::sing);

        // Constructor method references
        UserGenerator userGenerator = User::new;
        User kat = userGenerator.createUser("Kat", 30);
        User chris = userGenerator.createUser("Chris", 36);
        System.out.println(kat.toString());
        System.out.println(chris.toString());



    }

    public static int add(int a, int b){
        return a + b;
    }
}

interface UserGenerator{
    User createUser(String name, int age);
}

class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Song {

    private String name;

    public Song(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Singer{
    private String singerName;

    public Singer(String singerName) {
        this.singerName = singerName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void sing(Song x){
        System.out.println( singerName+ " is singing the song: " + x.getName());


    }

    public void execute( Song song, Consumer<Song> x){
        x.accept(song);
    }

}
