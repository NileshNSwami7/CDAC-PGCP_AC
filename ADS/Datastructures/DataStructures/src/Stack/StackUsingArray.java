package Stack;

import java.util.Scanner;

public class StackUsingArray {
	
	private int stack[];
	private int top;
	private int capacity;
	
	StackUsingArray(int capacity){
		this.stack = new int[capacity];
		this.top=-1;
	}
	
	public void push(int value) {
		if(top == stack.length-1) {
			System.out.println("Stack is overflow.");
			return;
		}
		stack[++top] = value;
	}
	
	public int pop() {
		if(top==-1) {
			System.out.println("Stack is empty.");
			return -1;
		}
		int value = stack[top--];
		return value;
	}
	
	public void peak() {
		if(top==-1) {
			System.out.println("Stack is empty.");
			return;
		}
		int value = stack[top];
		System.out.println("Poped value : "+value);
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("Stack is empty.");
			return;
		}
		for(int i=stack.length-1;i>=0;i--) {
			System.out.println(stack[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("================Stack Using Array=============");
		System.out.println();
		System.out.println("Please enter the capacity.");
		int capacity = scan.nextInt();
		if(capacity<=0) {
			System.out.println("Capacity shoul be greather than zero(0).");
			return;
		}
		StackUsingArray stackArray = new StackUsingArray(capacity);
		int option;
		do {
			System.out.println("Please select following options ");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peak");
			System.out.println("4.Display");
			System.out.println("5.Exit.");
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
			case 2: stackArray.pop();
					break;
			case 3: stackArray.peak();
					break;
			case 4: stackArray.display();
					break;
			case 5: System.exit(0);
					break;
			default :System.out.println("Enter wrong value please select proper option.");
			}
		}
		while(option != 5);
	}

}
