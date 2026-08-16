import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_1{
    public static void main(String args[]){

        Deque<Integer> Stack= new ArrayDeque<>();

        Stack.push(10);
        Stack.push(20);
        Stack.push(30);

        System.out.println(Stack.peek());
        System.out.println(Stack.pop());
        System.out.println(Stack.peek());

        System.out.println(Stack.isEmpty());
    }
}




