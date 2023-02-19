package labs_examples.generics.labs;

public class ExerciseOne {
    public static void main(String[] args) {
        KatGenericClass object1 = new KatGenericClass("Hey there", 5);
        object1.print();

        System.out.println();

        KatGenericClass object2 = new KatGenericClass(24f, 35.7665);
        object2.print();

        System.out.println();

        KatGenericClass object3 = new KatGenericClass("Nix", 30);
        object3.print();



    }
}

class KatGenericClass <T,K> {

    T val1;
    K val2;

    public KatGenericClass(T val1, K val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public K getVal2() {
        return val2;
    }

    public void setVal2(K val2) {
        this.val2 = val2;
    }

    public void print(){
        System.out.println(val1);
        System.out.println(val2);
    }
}


