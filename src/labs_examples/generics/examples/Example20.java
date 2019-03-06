package labs_examples.generics.examples;

class Wrong<T> {
    // Wrong, no static variables of type T.
    //static T ob;

    // Wrong, no static method can use T.
//    static T getob() {
//        return ob;
//    }

    // Wrong, no static method can access object
    // of type T.
    static void showob() {
        //System.out.println(ob);
    }
}
