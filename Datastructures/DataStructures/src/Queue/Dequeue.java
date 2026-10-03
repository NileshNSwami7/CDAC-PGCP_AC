package Queue;

public class Dequeue {
	
	private int queue[];
	private int capacity;
	private int front;
	private int rear;
	private int size;
	
	public Dequeue(int capacity) {
		this.capacity = capacity;
		this.queue = new int[capacity];
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isFull() {
		if(size == capacity-1) {
			System.out.println("Queue is full");
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(this.size==0) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}
	
	public void enqueueFront(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		
		if(isEmpty()) {
			front = 0;
			rear = 0;
		}
		else if(front == 0){
			front = capacity - 1;
		}else {
			front--;
		}
		queue[front] = data;
		size--;
	}
	
	public void insertRear(int data) {
		
		if(isFull()) {
			System.out.println("Queue is full");
		}
		
		if(isEmpty()) {
			rear=0;
			front=0;
		}else if(size == capacity-1) {
			rear=0;
		}
		else {
			rear++;
		}
		queue[rear]=data;
		size++;
	}
	
	public int deleteFront() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int data = queue[front];
		if(front == rear) {
			front = -1;
			rear = -1;
		}else if(front==capacity-1) {
			
			front = 0;
		}else {
			front++;
		}
		size--;
		return data;
	}
	
	public int deleteRear() {
		if(isEmpty()) {
			System.out.println();
			return -1;
		}
		int data = queue[rear];
		if(front == rear) {
			front = 0;
			rear = 0;
		}
		else if(rear==0) {
			rear = rear-capacity-1;
		}else {
			rear--;
		}
		size--;
		return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
