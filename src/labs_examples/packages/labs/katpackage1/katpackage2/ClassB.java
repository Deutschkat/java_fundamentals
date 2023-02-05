package labs_examples.packages.labs.katpackage1.katpackage2;

public class ClassB {

    public void doesThisPrint(){
        System.out.println("This statment is a public statement in class B. It can be accessed and printed from the other package when imported.");
    }

    private void thisWontPrint(){
        System.out.println("This statement won't print because it is private and in another class and package.");
    }

}
