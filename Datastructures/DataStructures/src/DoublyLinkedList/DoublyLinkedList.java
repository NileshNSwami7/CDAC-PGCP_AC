package DoublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {

        private int data;
        private Node previous;
        private Node next;

        Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
            return;
        }

        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;

        length++;
    }

    public void displayForward() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println();
    }

    public void displayBackward() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.previous;
        }

        System.out.println();
    }

    public void findFirst() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("First element: " + head.data);
    }

    public void findLast() {

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Last element: " + tail.data);
    }

    public void insertNodeInBetween(int position, int data) {

        if (position < 1 || position > length) {
            System.out.println("Invalid position");
            return;
        }

        Node temp = head;

        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }

        Node previous = temp;
        Node nextNode = previous.next;

        Node currentNode = new Node(data);

        previous.next = currentNode;
        currentNode.previous = previous;

        currentNode.next = nextNode;

        if (nextNode != null) {
            nextNode.previous = currentNode;
        }

        length++;
    }

    public void removeElement() throws IllegalAccessException {

        if (head == null) {
            throw new IllegalAccessException("Linked list is Empty");
        }

        if (head == tail) {
            head = null;
            tail = null;
            length--;
            return;
        }

        Node previousNode = tail.previous;

        previousNode.next = null;
        tail.previous = null;

        tail = previousNode;

        length--;
    }

    public boolean search(int value) {

        Node temp = head;

        if (head == null) {
            System.out.println("List is Empty");
            return false;
        }

        while (temp != null) {

            if (temp.data == value) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public void deleteHead() {

        if (head == null) {
            System.out.println("No node available.");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            length--;
            return;
        }

        head = head.next;
        head.previous = null;

        length--;
    }

    public void deleteTail() {

        if (tail == null) {
            System.out.println("No node available");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            length--;
            return;
        }

        Node previousNode = tail.previous;

        previousNode.next = null;
        tail.previous = null;

        tail = previousNode;

        length--;
    }

    public static void main(String[] args) throws IllegalAccessException {

        Scanner sc = new Scanner(System.in);

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add(5);
        dll.add(7);
        dll.add(2);
        dll.add(6);
        dll.add(9);

        dll.displayForward();
        dll.displayBackward();

        dll.findFirst();
        dll.findLast();

        dll.removeElement();
        dll.displayForward();

        dll.insertNodeInBetween(2, 10);
        dll.displayForward();

        System.out.println("Enter number to check whether it is present or not:");

        int value = sc.nextInt();

        boolean present = dll.search(value);

        System.out.println("Data present: " + present);

        dll.deleteHead();
        dll.displayForward();

        dll.deleteTail();
        dll.displayForward();

        sc.close();
    }
}