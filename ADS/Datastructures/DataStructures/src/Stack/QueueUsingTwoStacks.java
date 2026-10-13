package Stack;

import java.util.Scanner;

public class QueueUsingTwoStacks {

    private int stackA[];
    private int stackB[];

    private int topA;
    private int topB;

    private int capacity;

    public QueueUsingTwoStacks(int capacity) {

        this.capacity = capacity;

        stackA = new int[capacity];
        stackB = new int[capacity];

        topA = -1;
        topB = -1;
    }


    // ================= ENQUEUE =================

    public void enqueue(int data) {

        if (topA == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }

        stackA[++topA] = data;
    }

    public int dequeue() {

        if (topA == -1 && topB == -1) {
            System.out.println("Queue is empty");
            return -1;
        }


        if (topB == -1) {

            while (topA != -1) {

                stackB[++topB] = stackA[topA--];
            }
        }

        return stackB[topB--];
    }


    // ================= PEEK =================

    public int peek() {

        if (topA == -1 && topB == -1) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (topB == -1) {

            while (topA != -1) {
                stackB[++topB] = stackA[topA--];
            }
        }

        return stackB[topB];
    }


    // ================= DISPLAY =================

    public void display() {

        if (topA == -1 && topB == -1) {
            System.out.println("Queue is empty");
            return;
        }

        // B contains elements in queue order
        for (int i = topB; i >= 0; i--) {
            System.out.print(stackB[i] + " ");
        }

        // A contains newer elements
        for (int i = 0; i <= topA; i++) {
            System.out.print(stackA[i] + " ");
        }

        System.out.println();
    }


    // ================= MAIN =================

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter capacity:");
        int capacity = scan.nextInt();

        QueueUsingTwoStacks queue =
                new QueueUsingTwoStacks(capacity);

        int choice;

        do {

            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.println("Enter choice:");
            choice = scan.nextInt();

            switch (choice) {

            case 1:

                System.out.println("Enter data:");
                int data = scan.nextInt();

                queue.enqueue(data);

                break;


            case 2:

                int value = queue.dequeue();

                if (value != -1) {
                    System.out.println("Deleted: " + value);
                }

                break;


            case 3:

                int front = queue.peek();

                if (front != -1) {
                    System.out.println("Front: " + front);
                }

                break;


            case 4:

                queue.display();

                break;


            case 5:

                System.out.println("Exit");
                break;


            default:

                System.out.println("Invalid choice");
            }

        } while (choice != 5);

        scan.close();
    }
}