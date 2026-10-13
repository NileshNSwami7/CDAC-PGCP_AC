package Stack;

import java.util.Scanner;

public class MinStack {

    private int stack[];
    private int minStack[];

    private int top;
    private int minTop;

    private int capacity;

    public MinStack(int capacity) {

        this.capacity = capacity;

        stack = new int[capacity];
        minStack = new int[capacity];

        top = -1;
        minTop = -1;
    }


    // ================= PUSH =================

    public void push(int data) {

        if (top == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }

        // Push into normal stack
        stack[++top] = data;

        // Push into min stack
        if (minTop == -1 || data <= minStack[minTop]) {
            minStack[++minTop] = data;
        }
    }


    // ================= POP =================

    public int pop() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = stack[top--];

        // If popped element is current minimum
        if (value == minStack[minTop]) {
            minTop--;
        }

        return value;
    }


    // ================= PEEK =================

    public int peek() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }


    // ================= GET MIN =================

    public int getMin() {

        if (minTop == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return minStack[minTop];
    }


    // ================= DISPLAY =================

    public void display() {

        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }


    // ================= MAIN =================

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter capacity:");
        int capacity = scan.nextInt();

        MinStack ms = new MinStack(capacity);

        int choice;

        do {

            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Get Minimum");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.println("Enter choice:");
            choice = scan.nextInt();

            switch (choice) {

            case 1:

                System.out.println("Enter data:");
                int data = scan.nextInt();

                ms.push(data);

                break;


            case 2:

                int value = ms.pop();

                if (value != -1) {
                    System.out.println("Popped: " + value);
                }

                break;


            case 3:

                int topValue = ms.peek();

                if (topValue != -1) {
                    System.out.println("Top: " + topValue);
                }

                break;


            case 4:

                int minimum = ms.getMin();

                if (minimum != -1) {
                    System.out.println("Minimum: " + minimum);
                }

                break;


            case 5:

                ms.display();

                break;


            case 6:

                System.out.println("Exit");
                break;


            default:

                System.out.println("Invalid choice");
            }

        } while (choice != 6);

        scan.close();
    }
}