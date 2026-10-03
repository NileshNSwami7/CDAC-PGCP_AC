package Queue;

public class SimpleQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleQueue simpleQueue = new SimpleQueue(5);
		simpleQueue.enqueue(3);
		simpleQueue.enqueue(5);
		simpleQueue.enqueue(1);
		simpleQueue.display();
		simpleQueue.dequeue();
		simpleQueue.display();
		simpleQueue.enqueue(8);
		simpleQueue.enqueue(9);
		simpleQueue.enqueue(7);
		simpleQueue.display();
	}

}
