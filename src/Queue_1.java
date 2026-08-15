import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_1 {
    public static void main(String args[]) {

        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(10);       // add
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue.peek()); // 10
        System.out.println(queue.poll()); // removes 10
        System.out.println(queue.peek()); // 20

        System.out.println(queue.isEmpty());
    }
}