public class LinkedList_1 {
    public static void main(String args[]){
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);


        first.next = second;
        second.next = third;
        third.next = fourth;

        Node head = first;

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
