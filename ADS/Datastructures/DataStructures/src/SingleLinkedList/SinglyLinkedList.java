package SingleLinkedList;

import java.util.Scanner;

class SingleList {
	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head;
	Node tail;

	public void addList(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}

	public void display() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.data+"->");
			tempNode = tempNode.next;
		}
	}
	
	public void removeElements() {
		if(head == null) {
			System.out.println("Singly list is empty");
			return;
		}
		if(head.next == null) {
			head=null;
			tail=null;
			return;
		}
		Node tempNode = head;
		while(tempNode.next !=tail) {
			tempNode = tempNode.next;
		}
		tempNode.next=null;
		tail=tempNode;
	}
}

public class SinglyLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SingleList sl = new SingleList();

		
		System.out.println("---------------");
		System.out.println("Add Elements");
		for (int i = 0; i < 5; i++) {
			sl.addList(sc.nextInt());
		}
		
		sl.display();
		System.out.println();
		System.out.println("---------------------");
		
		sl.removeElements(); // It will delete last element only if we use delete all element we need to run loop. 
		System.out.println("-------------------");

		sl.addList(5); //add new data to list.
		sl.display();
		
	}

}
