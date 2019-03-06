package labs_examples.generics.examples;

// Can't create an instance of T.
class Gen4<T> {
    T ob;
    Gen4() {
       // ob = new T(); // Illegal!!!
    }
}