package labs_examples.datastructures.linkedlist.labs;

public class KatLinkedList<T> {

    KatNode first;
    KatNode last;
    int N;


    public KatLinkedList(T... data) {

        if (data.length < 1) {
            first = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                add(data[i]);
            }
        }
    }

    //Adding specifically to the head of the list.

    public void addAtFirst(T val){
        KatNode<T> temp = new KatNode<>(val);
        temp.next = first;
        first = temp;

        if(last == null){
            last = temp;
        }
    }

    // Adding Specifically to the end of the list.
    public void addAtEnd(T val){
        if(last == null){
            addAtFirst(val);
            return;
        }
        KatNode<T> temp = new KatNode<T>(val);
        last.next = temp;
        last = temp;
    }


    //Add Method - Just randomly creating a base of the list.
    public void add(T data) {
        if (data == null) {
            throw new NullPointerException("Argument null.");
        }
        if (!isEmpty()) {
            KatNode temp = last;
            last = new KatNode(data, null);
            temp.next = last;
        } else {last = new KatNode(data, null);
            first = last;
        }
        N++;


    }
    //If empty

    public boolean isEmpty(){
        return N == 0;
    }

    //To make it readable
    public String toString(){
        KatNode iterator = first;
        String output = "";

        while (iterator != null){
            output += iterator.data + " ";
            iterator = iterator.next;
        }
        return output;
    }

    //Helper Method For Getting Size

    public int size(){
        N = 0;
        KatNode iterator = first;

        while(iterator != null) {
            N++;
            iterator = iterator.next;
        }
        return N;

    }

    public KatNode getFirst() {
        return first;
    }

    public void setFirst(KatNode first) {
        this.first = first;
    }

    public KatNode getLast() {
        return last;
    }

    public void setLast(KatNode last) {
        this.last = last;
    }
// Possible Delete
    public String getFirstToString() {
        return "KatLinkedList{" +
                "first=" + first +
                '}';
    }

    public T get(T value){
        try{

            KatNode iterator = first;

            while(iterator.getData() != value){
                iterator = iterator.next;
            }
            return (T) iterator.data;
        }catch(NullPointerException ex){
            return null;
        }
    }

    // **WORKING HERE**
    public void remove(T value) {

        if (this.first != null) {

            KatNode node = first;
            KatNode previous = null;

            while (node.getData() != value) {
                previous = node;
                node = node.next;
            }
            if (node != null) {
                if(previous.equals(first)){
                first = first.next;
                }else{
                previous.next = node.next;
            }
            }else{
                node.next = null;
            }


        }
    }







}