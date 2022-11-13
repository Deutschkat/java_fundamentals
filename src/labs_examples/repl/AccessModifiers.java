package labs_examples.repl;

public class AccessModifiers {

    public static void main(String[] args) {

        AccessMod obj = new AccessMod();


    }
}

class AccessMod {

    public String publicVar;
    protected String protectedVar;
    private String privateVar;

}

//What am i supposed to do here? Set each instance var on the object
