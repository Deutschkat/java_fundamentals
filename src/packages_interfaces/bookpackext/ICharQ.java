package packages_interfaces.bookpackext;

// A character queue interface.
public interface ICharQ {
    // Put a characer into the queue.
    void put(String ch);

    // Get a character from the queue.
    char get();
}