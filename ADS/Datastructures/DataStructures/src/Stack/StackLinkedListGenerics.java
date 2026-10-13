package Stack;

import java.util.Scanner;

public class StackLinkedListGenerics<T> {
	
	private static class Node<T>{
		private T data;
		private Node<T>next;
		
		Node(T data){
			this.data = data;
		}
	}
	private int size;
	private Node<T> top;
	
	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.next = top;
		top = newNode;
		size++;
	}
	
	public T Pop(){
		if(size==0) {
			System.out.println("Stack is empty");
		}
		T value = top.data;
		top = top.next;
		size--;
		return value;
	}
	
	public T peek() {
		return (size==0)? null: top.data;
	}
	
	public int size() {
		return size;
	}
	public void display() {
		if(size == 0) {
			System.out.println("Statck is empty.");
			return;
		}
		Node<T> current = top;
		while(current != null) {
			System.out.println(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("================Stack Using Singly Linked List Generics =============");
		System.out.println();
		System.out.println("Please enter the capacity.");
		int capacity = scan.nextInt();
		if(capacity<=0) {
			System.out.println("Capacity shoul be greather than zero(0).");
			return;
		}
		StackLinkedListGenerics<Integer> stackArray = new StackLinkedListGenerics<>();
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
			case 2: int popedvalue=stackArray.Pop();
					System.out.println("Poped value: "+popedvalue);
					break;
			case 3: int top = stackArray.peek();
					System.out.println(top);
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
