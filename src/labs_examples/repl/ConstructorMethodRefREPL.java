package labs_examples.repl;

public class ConstructorMethodRefREPL {public static void main(String[] args) {

    // Modify the line below to use a constructor reference rather than a lambda expression

    CatInterface catInterface = Cat::new;
    Cat kitty1 = catInterface.createCat("Pumpkin", "orange");
    Cat kitty2 = catInterface.createCat("Tony", "white and tan");

    System.out.println(kitty1.toString());
    System.out.println(kitty2.toString());

}
}

interface CatInterface {
    Cat createCat(String name, String color);
}

class Cat {
    String name;
    String color;

    public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString(){
        return name + " the cat is " + color;
    }
}
