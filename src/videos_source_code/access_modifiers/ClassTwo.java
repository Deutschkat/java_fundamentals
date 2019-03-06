package videos_source_code.access_modifiers;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ClassTwo {

    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();

        classOne.publicVar = 10;
        classOne.protectedVar = 20;
        classOne.changePrivateVar(30);
    }
}
