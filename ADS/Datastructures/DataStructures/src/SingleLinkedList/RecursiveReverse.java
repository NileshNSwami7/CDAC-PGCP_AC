package SingleLinkedList;

public class RecursiveReverse {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insert(Node head, int data) {

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


    public static Node reverse(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverse(head.next);

        head.next.next = head;

        head.next = null;

        return newHead;
    }


    // ================= DISPLAY =================

    public static void display(Node head) {

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " → ");

            current = current.next;
        }

        System.out.println("null");
    }


    // ================= MAIN =================

    public static void main(String[] args) {

        Node head = null;

        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 4);
        head = insert(head, 5);

        System.out.println("Before reversing:");
        display(head);

        head = reverse(head);

        System.out.println("After reversing:");
        display(head);
    }
}