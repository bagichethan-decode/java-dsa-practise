public class LinkedList_2 {
    public static void main(String args[]){

        Node zero = new Node(5);
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        zero.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        Node head = zero;

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.print("null");

    }

    static class Node {
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
            this.next = next;
        }
    }
}
