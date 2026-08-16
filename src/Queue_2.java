import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_2 {

    public static void main(String args[]) {
        Queue<Integer> queue = new ArrayDeque<>();


        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);


        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}


