package labs_examples.repl;

public class ForLoops {
    public static void main(String[] args) {

        for(int x = 0; x <= 100; x++){
            System.out.println(x);
        }

        for(int x = 99; x > 0; x -= 2){
            System.out.println(x);
        }

        for(int cats = 0; cats < 10; cats++){
            for(int dogs = 0; dogs < 20; dogs += 2){
                System.out.println("Cats: " + cats);
                System.out.println("Dogs: " + dogs);
            }
        }
    }
}
