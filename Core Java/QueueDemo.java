import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("India");
        queue.add("Germany");
        queue.add("Japan");

        System.out.println(queue);

        queue.remove();

        System.out.println(queue);

        String head = queue.peek();
        System.out.println("Head of the queue : " + head);

        head = queue.poll();
        System.out.println("Removed head : " + head);
    }
}
