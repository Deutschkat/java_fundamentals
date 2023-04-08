package labs_examples.datastructures.linkedlist.labs;

import java.util.NoSuchElementException;

public class KatDoublyLinked <T> {
         KatNode first;
         KatNode last;
         int size;

        class KatNode {
            T data;
            KatNode next;
            KatNode prev;

            KatNode(T data) {
                this.data = data;
            }
        }


         public int size() {
         return size;
            }

        public void addFirst(T data) {


            KatNode newKatNode = new KatNode(data);

            if (first == null) {
                first = newKatNode;
                last = newKatNode;
            } else {
                newKatNode.next = first;
                first.prev = newKatNode;
                first = newKatNode;
            }

            size++;
        }



    public void removeFirst() {
            if (first == null) {
                throw new NoSuchElementException();
            }

            if (first == last) {
                first = null;
                last = null;
            } else {
                first = first.next;
                first.prev = null;
            }

            size--;
        }

        public void printList() {
        KatNode thisNode = first;

        while (thisNode != null) {
            System.out.print(thisNode.data + " ");
            thisNode = thisNode.next;
        }

        System.out.println();
    }

         public void addLast(T data) {
        KatNode newKatNode = new KatNode(data);

        if (last == null) {
            first = newKatNode;
            last = newKatNode;
        } else {
            last.next = newKatNode;
            newKatNode.prev = last;
            last = newKatNode;
        }

        size++;
    }
        public void removeLast() {
            if (last == null) {
                throw new NoSuchElementException();
            }

            if (first == last) {
                first = null;
                last = null;
            } else {
                last = last.prev;
                last.next = null;
            }

            size--;
        }


        public boolean isEmpty() {
            return size == 0;
        }


    }
