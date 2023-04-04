package labs_examples.datastructures.linkedlist.labs;

public class KatNode<T> {

    T data;

    KatNode next;

    public KatNode(T data){
        this.data = data;
        this.next = null;

    }

    public KatNode(T data, KatNode node){
        this.data = data;
        this.next = node;
    }
}
