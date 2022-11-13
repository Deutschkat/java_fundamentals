package labs_examples.access_modifiers;

public class ClassTwo {

    public static void main(String[] args) {

        ClassOne classOne = new ClassOne();

        classOne.publicVar = 10;
        classOne.protectedVar = 20;
        classOne.changePrivateVar(30);

    }
}
