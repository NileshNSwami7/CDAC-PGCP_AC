package Stack;

import java.util.Scanner;

public class StackUsingSinglyLinkedlist {

	private static class Node{
		private int data;
		private Node next;
		
		Node(int data){
			this.data = data; 
		}
	}
	private Node top;
	private int size;
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top=newNode;
		size++;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int value = top.data;
		top=top.next;
		size--;
		return value;
	}
	public boolean isEmpty() {
		return top == null;
	}
	public int size() {
		return size;
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return;
		}
		int value = top.data;
		System.out.println(value+" ");
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return;
		}
		Node current = top;
		while(current != null) {
			System.out.println(current.data+" ");
			current = current.next;
		}
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("================Stack Using Singly Linked List =============");
		System.out.println();
		System.out.println("Please enter the capacity.");
		int capacity = scan.nextInt();
		if(capacity<=0) {
			System.out.println("Capacity shoul be greather than zero(0).");
			return;
		}
		StackUsingSinglyLinkedlist stackArray = new StackUsingSinglyLinkedlist();
		int option;
		do {
			System.out.println("Please select following options ");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peak");
			System.out.println("4.Display");
			System.out.println("5.size");
			System.out.println("6.Exit.");
			option = scan.nextInt();
			switch(option) {
			case 1: System.out.println("How many value do you add?");
					int num = scan.nextInt();
					System.out.println("Enter the values."); 
					for(int i=0;i<num;i++) {
						int value = scan.nextInt();
						stackArray.push(value);
					}
					break;
			case 2: int popedvalue=stackArray.pop();
					System.out.println("Poped value: "+popedvalue);
					break;
			case 3: stackArray.peek();
					break;
			case 4: stackArray.display();
					break;
			case 5: int size = stackArray.size();
					System.out.println("Size :"+size);
					break;
			case 6: System.exit(0);
					break;
			default :System.out.println("Enter wrong value please select proper option.");
			}
		}
		while(option != 6);
	}

}
