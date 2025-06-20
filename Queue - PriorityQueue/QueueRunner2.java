import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(), value2.length()); // Ascending order
    }
}
public class QueueRunner2 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        queue.addAll(List.of("Zoe","Charlie", "Dave", "Alice", "Mark", "Bob"));
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
