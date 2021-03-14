package TheNewBostonIntermediate.DataStructures;
import java.util.*;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<String>();
        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.printf("%s ", q);
        System.out.println();

        System.out.printf("%s ", q.peek());//for the element with the highest priority 
        System.out.println();

        q.poll(); //it removes the element with the highest priority
        System.out.printf("%s ", q);
    }
}
