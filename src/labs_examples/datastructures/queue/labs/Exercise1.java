package labs_examples.datastructures.queue.labs;
import java.util.PriorityQueue;
public class Exercise1 {
        public static void main(String[] args) {

            //Make my queue
            PriorityQueue<String> KatQueue = new PriorityQueue<>();

            //add stuff to it
            KatQueue.add("this");
            KatQueue.add("is");
            KatQueue.add("how");
            KatQueue.add("we");
            KatQueue.add("queue");
            KatQueue.add("it");

            //peek at top
            System.out.println(KatQueue.peek());

            //contains
            boolean hasThis = KatQueue.contains("this");
            System.out.println("This queue does contain: " + hasThis);

            //remove something from front
            String r1 = KatQueue.remove();
            System.out.println(r1);

            //just printing to show queue
            System.out.println();

            //gets the head or top of queue
            String e1 = KatQueue.element();
            System.out.println(e1);

            //Iterate & print
            for(String s : KatQueue){
                System.out.println(s);
            }

            //Clear it all
            KatQueue.clear();





        }
    }