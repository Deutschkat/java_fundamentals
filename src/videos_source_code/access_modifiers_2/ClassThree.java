package videos_source_code.access_modifiers_2;


import videos_source_code.access_modifiers.ClassOne;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ClassThree {

    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();

        classOne.publicVar = 10;

        // the line below doesn't work because "protectedVar" is declared as "protected"
        // and it is declared in a seperate package
        //classOne.protectedVar = 20;

        classOne.changePrivateVar(30);
    }
}
