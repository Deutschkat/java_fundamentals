package labs_examples.objects_classes_methods.examples.advanced;

// A Queue2 class for characters.
class Queue2 {
    private char q[]; // this array holds the Queue2
    private int putloc, getloc; // the put and get indices

    // Construct an empty Queue2 given its size.
    Queue2(int size) {
        q = new char[size]; // allocate memory for Queue2
        putloc = getloc = 0;
    }

    // Construct a Queue2 from a Queue2.
    Queue2(Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // copy elements
        for(int i=getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    // Construct a Queue2 with initial values.
    Queue2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i = 0; i < a.length; i++) put(a[i]);
    }

    // Put a characer into the Queue2.
    public void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" -- Queue2 is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // Get a character from the Queue2.
    public char get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue2 is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// Demonstrate the Queue2 class.
class QDemo2 {
    public static void main(String args[]) {
        // construct 10-element empty Queue2
        Queue2 q1 = new Queue2(10);

        char name[] = {'T', 'o', 'm'};
        // construct Queue2 from array
        Queue2 q2 = new Queue2(name);

        char ch;
        int i;

        // put some characters into q1
        for(i=0; i < 10; i++)
            q1.put((char) ('A' + i));

        // construct Queue2 from another Queue2
        Queue2 q3 = new Queue2(q1);

        // Show the Queue2s.
        System.out.print("Contents of q1: ");
        for(i=0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for(i=0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for(i=0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}