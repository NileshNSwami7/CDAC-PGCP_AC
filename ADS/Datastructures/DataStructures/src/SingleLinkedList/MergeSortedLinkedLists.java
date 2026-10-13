package SingleLinkedList;


public class MergeSortedLinkedLists {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    // Insert at end
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


    // Merge two sorted linked lists
    public static Node merge(Node head1, Node head2) {

        // If one list is empty
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        Node head;

        // Select first node
        if (head1.data <= head2.data) {

            head = head1;
            head1 = head1.next;

        } else {

            head = head2;
            head2 = head2.next;
        }

        Node current = head;

        // Merge both lists
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

        // Attach remaining nodes
        if (head1 != null) {
            current.next = head1;
        }

        if (head2 != null) {
            current.next = head2;
        }

        return head;
    }


    // Display
    public static void display(Node head) {

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " → ");
            current = current.next;
        }

        System.out.println("null");
    }


    public static void main(String[] args) {

        Node head1 = null;
        Node head2 = null;

        // First sorted list
        head1 = insert(head1, 1);
        head1 = insert(head1, 4);
        head1 = insert(head1, 7);

        // Second sorted list
        head2 = insert(head2, 2);
        head2 = insert(head2, 3);
        head2 = insert(head2, 8);

        System.out.println("First list:");
        display(head1);

        System.out.println("Second list:");
        display(head2);

        Node mergedHead = merge(head1, head2);

        System.out.println("Merged list:");
        display(mergedHead);
    }
}