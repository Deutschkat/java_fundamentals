package packages_interfaces.bookpackext;

class MyIFImp2 implements MyIF {
    // Here, implementations for both getUserID( ) and getAdminID( ) are
    // provided.
    public int getUserID() {
        return 100;
    }

    public int getAdminID() {
        return 42;
    }
}