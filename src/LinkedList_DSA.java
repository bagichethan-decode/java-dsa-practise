public class LinkedList_DSA {


    // NODE

    static void printList(Node head) {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }


    // PRINT / TRAVERSAL

    static Node addFirst(Node head, int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        return head;
    }


    // INSERT AT BEGINNING

    static Node addLast(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return head;
    }


    // INSERT AT END

    static Node deleteFirst(Node head) {

        if (head == null) {
            return null;
        }

        head = head.next;

        return head;
    }

    // DELETE FIRST NODE

    static Node deleteLast(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;

        return head;
    }


    // DELETE LAST NODE

    static boolean search(Node head, int target) {

        Node current = head;

        while (current != null) {

            if (current.data == target) {
                return true;
            }

            current = current.next;
        }

        return false;
    }


    // SEARCH

    static int length(Node head) {

        int count = 0;

        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }


    // LENGTH

    static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    // FIND MIDDLE
    // SLOW + FAST POINTER

    static Node reverse(Node head) {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        return previous;
    }


    // REVERSE LINKED LIST
    // PREV + CURRENT + NEXT

    static Node nthFromEnd(Node head, int n) {

        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {

            if (first == null) {
                return null;
            }

            first = first.next;
        }

        while (first != null) {

            first = first.next;
            second = second.next;
        }

        return second;
    }


    // NTH NODE FROM END
    // TWO POINTER

    static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }


    // DETECT CYCLE
    // FLOYD'S ALGORITHM

    static Node cycleStart(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }


    // FIND START OF CYCLE

    static boolean isPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        // Find middle
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);

        Node firstHalf = head;

        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }


    // PALINDROME

    static Node merge(Node head1, Node head2) {

        Node dummy = new Node(0);

        Node current = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {

                current.next = head1;
                head1 = head1.next;

            } else {

                current.next = head2;
                head2 = head2.next;
            }

            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        }

        if (head2 != null) {
            current.next = head2;
        }

        return dummy.next;
    }


    // MERGE TWO SORTED LISTS

    static Node removeNthFromEnd(Node head, int n) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node first = dummy;
        Node second = dummy;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        while (first.next != null) {

            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;
    }

    // REMOVE NTH NODE FROM END
    // DUMMY NODE

    static Node removeDuplicates(Node head) {

        Node current = head;

        while (current != null && current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }


    // REMOVE DUPLICATES
    // SORTED LIST

    static Node intersection(Node headA, Node headB) {

        Node a = headA;
        Node b = headB;

        while (a != b) {

            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a;
    }


    // INTERSECTION OF TWO LISTS

    static Node reverseRecursive(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }


    // REVERSE RECURSIVELY

    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original:");
        printList(head);

        System.out.println("Length: " + length(head));

        System.out.println("Search 30: " + search(head, 30));

        Node middle = findMiddle(head);
        System.out.println("Middle: " + middle.data);

        head = addFirst(head, 5);
        System.out.println("After add first:");
        printList(head);

        head = addLast(head, 50);
        System.out.println("After add last:");
        printList(head);

        head = deleteFirst(head);
        System.out.println("After delete first:");
        printList(head);

        head = deleteLast(head);
        System.out.println("After delete last:");
        printList(head);

        head = reverse(head);
        System.out.println("Reversed:");
        printList(head);
    }

    // MAIN

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}