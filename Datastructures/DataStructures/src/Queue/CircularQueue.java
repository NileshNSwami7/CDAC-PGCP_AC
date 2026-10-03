package Queue;

public class CircularQueue {

	private int queue[];
	private int capacity;
	private int rear;
	private int front;
	private int size;

	public CircularQueue(int capacity) {
		this.capacity = capacity;
		this.queue = new int[capacity];
		this.front = 0;
		this.rear = 0;
		this.size = 0;
	}

	public void enqueue(int data) {
		if (size == capacity) {
			System.out.println("Circular is full");
			return;
		}
		queue[rear] = data;
		rear = (rear + 1) % capacity;
		size++;
	}

	public int dequeue() {
		if (size == 0) {
			System.out.println("Circular is empty");
			return -1;
		}
		int data = queue[front];
		front = (front + 1) % capacity;
		size--;
		return data;
	}

	public int size() {
		return this.size;
	}

	public void display() {
		if (size == 0) {
			System.out.println("Circular queue is empty");
			return;
		}

		for (int i = 0; i < size; i++) {
			int data = queue[(front + i) % capacity];
			System.out.print(data + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		CircularQueue cQueue = new CircularQueue(5);
		cQueue.enqueue(9);
		cQueue.enqueue(4);
		cQueue.enqueue(3);
		cQueue.enqueue(1);
		cQueue.enqueue(8);

		cQueue.display();
		cQueue.dequeue();
		cQueue.dequeue();
		cQueue.display();
		cQueue.enqueue(8);
		cQueue.enqueue(2);
		cQueue.display();
	}
}
