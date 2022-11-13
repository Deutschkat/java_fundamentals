package labs_examples.access_modifiers_2;

import labs_examples.access_modifiers.ClassOne;

public class ClassThree {
    public static void main(String[] args) {

        ClassOne classOne = new ClassOne();

        classOne.publicVar = 10;
        classOne.changePrivateVar(30);

    }
}
