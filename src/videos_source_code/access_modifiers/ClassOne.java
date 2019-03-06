package videos_source_code.access_modifiers;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ClassOne {

    public int publicVar;
    protected int protectedVar;
    private int privateVar;

    public void changePrivateVar(int val){
        if (val >= 0 && val <= 1000){
            privateVar = val;
        }
    }

    /*
        ACCESS MODIFIERS - affect classes, instance variables and methods
            they play a large role in Encapsulation - one of the primary
            tenants of Object-Oriented Programming

        public
            any class, instance variable or method that is marked as "public"
            can be openly accessible from anywhere in the application
            it can also be accessed by external applications that are using
            this application (this is something we'll come back to)

        private
            only accessible from within the class where the private variable or
            method is declared. We do not have a thing such as a private class.

        protected
            only accessible by classes (and their members) that are decalred in
            the same package as the variable or method that is declared "protected".
            In addition, subclasses whether they are in the same package or not, can
            access protected members (we'll come back to this)

        default
            the same as protected but not accessible by subclasses

     */



}
