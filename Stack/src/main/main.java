package main;

import java.util.Scanner;

class stack {
	private int[] arr;
	private int top;

	public stack(int size) {
		arr = new int[size];
		top = -1;
	}

	public void push(int val)throws IndexOutOfBoundsException {
		if (isFull()) {
			throw new IndexOutOfBoundsException("Stack is Full");
		}
		top++;
		arr[top] = val;
	}

	public void pop() {
		if (isEmpty())
			throw new RuntimeException("Stack is Empty");

		top--;
	}

	public int peek() {
		if (isEmpty())
			throw new RuntimeException("Stack is Empty");
		return arr[top];
	}

	public boolean isFull() {
		return top == arr.length;
	}

	public boolean isEmpty() {
		return top == -1;
	}

}

public class main {

	public static void main(String[] args) {
		boolean exit = false;
		 Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter the stack size");
			stack newstack = new stack(sc.nextInt());
			while (!exit) {
				System.out.println("Enter Your Choice");
				System.out.println("1.Push");
				System.out.println("2.Pop");
				System.out.println("3.Peek");
				System.out.println("0. Exit");

				switch (sc.nextInt()) {

				case 1:
					System.out.println("Enter value to be added");
					newstack.push(sc.nextInt());
					break;
				case 2:
					int val = newstack.peek();
					newstack.pop();
					System.out.println("Poped the value: " + val);
					break;
				case 3:
					val = newstack.peek();
					System.out.println("Value at top is: " + val);
					break;

				case 4:
					exit = false;
					break;
				}
			}} catch (Exception e) {
			e.printStackTrace();
			sc.nextLine();
		}

	}

}
