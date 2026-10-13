package SingleLinkedList;

import java.util.Scanner;

public class DetectCycle {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Detect cycle
    public static boolean hasCycle(Node head) {

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No nodes");
            return;
        }

        Node head = null;
        Node tail = null;

        // Create linked list
        for (int i = 1; i <= n; i++) {

            System.out.print("Enter value for node " + i + ": ");
            int data = sc.nextInt();

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Ask user whether to create cycle
        System.out.print("Enter position to create cycle (0 for no cycle): ");
        int position = sc.nextInt();

        if (position != 0) {

            Node cycleNode = head;

            // Move to the selected position
            for (int i = 1; i < position; i++) {
                cycleNode = cycleNode.next;
            }

            // Last node points to selected node
            tail.next = cycleNode;
        }

        // Detect cycle
        if (hasCycle(head)) {
            System.out.println("Cycle exists");
        } else {
            System.out.println("No cycle");
        }

        sc.close();
    }
}