package labs_examples.packages.labs.katpackage1;

import labs_examples.packages.labs.katpackage1.katpackage2.ClassB;

public class ClassA {
    public static void main(String[] args) {

        ClassA obj = new ClassA();
        obj.printStatement();
        obj.printStatementPrivate();

        ClassB obj2 = new ClassB();
        obj2.doesThisPrint();

        //Cannot print obj2.thisWontPrint because it is a private method.



    }


    public void printStatement(){
        System.out.println("This is a print statement from class A. It is public and can be accessed.");
    }

    private void printStatementPrivate(){
        System.out.println("This is a print statement from class A. It is private and can be accessed because it is in the same class, and the same package.");
    }
}
