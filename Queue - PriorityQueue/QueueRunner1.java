import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueRunner1 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.addAll(List.of("Zoe","Charlie", "Dave", "Alice", "Bob"));
        // By default PriorityQueue sorts elements in natural order
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
