package Queue;

import java.util.Scanner;

public class Dequeue {

	private int queue[];
	private int front;
	private int rear;
	private int capacity;
	private int size;

	public Dequeue(int capacity) {
		this.capacity = capacity;
		this.queue = new int[capacity];
		this.front = -1;
		this.rear = -1;
	}

	public boolean isFull() {
		if (size == capacity) {
			System.out.println("Queue is full");
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (this.size == 0) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}

	public void enqueueFront(int data) {
		if (isFull()) {
			return;
		}
		if (isEmpty()) {
			front = 0;
			rear = 0;
		} else if (front == 0) {
			front = (front-1+capacity)%capacity;
		} else {
			front--;
		}
		queue[front] = data;
		size++;
	}

	public void enqueueRear(int data) {
		if (isFull()) {
			return;
		}
		if (isEmpty()) {
			front = 0;
			rear = 0;
		} else {
			rear=(rear+1)%capacity;
		}
		queue[rear] = data;
		size++;
	}

	public int dequeueFront() {
		if (isEmpty()) {
			return -1;
		}
		int value = queue[front];

		if (size==1) {
			front = -1;
			rear = -1;
		} else if (front == 0) {
			front= (front+1)%capacity;
		} else {
			front++;
		}
		size--;
		return value;
	}

	public int dequeueRear() {
		if (isEmpty()) {
			return -1;
		}
		int value = queue[rear];

		if (size==1) {
			front = -1;
			rear = -1;
		} else {
			rear = (rear - 1 + capacity)%capacity;
		}
		size--;
		return value;
	}

	public int getFront() {
		if (isEmpty()) {
			return -1;
		}
		return queue[front];
	}

	public int getRear() {
		if (isEmpty()) {
			return -1;
		}
		return queue[rear];
	}

	public void display() {
		if (isEmpty()) {
			return;
		}

		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % capacity] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the capacity");
		int capacity = scan.nextInt();
		Dequeue dq = new Dequeue(capacity);

		int choice;
		do {
			System.out.println("Please eneter choice.");
			System.out.println("1.EnqueueFront");
			System.out.println("2.EnqueueRear");
			System.out.println("3.DequeueFront");
			System.out.println("4.DequeueRear");
			System.out.println("5.Display");
			System.out.println("6.Exit.");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter values");
				dq.enqueueFront(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter values");
				dq.enqueueRear(scan.nextInt());
				break;
			case 3:
				dq.dequeueFront();
				break;
			case 4:
				dq.dequeueRear();
				break;
			case 5:
				dq.display();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input.");
			}
		} while (choice != 6);
	}
}
