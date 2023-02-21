package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo {

    public static void main(String[] args) {

        GenericArrayList<Integer> arrayList = new GenericArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(15);


        int counter = 0;

        for(int x = 0; x < arrayList.getData().size(); x++ ){
           counter += arrayList.getData().get(x) ;
        }

        System.out.println(counter);

    }



}


class GenericArrayList<T extends Number> {

    private ArrayList<T> data;

    public GenericArrayList() {
        data = new ArrayList<T>();
    }


    public void add(T object) {
        if (!data.contains(object))
            data.add(object);
    }

    public boolean contains(T object) {
        return (data.contains(object));
    }

    public void remove(T object) {
        data.remove(object);
    }

    public ArrayList<T> getData() {
        return data;
    }
}