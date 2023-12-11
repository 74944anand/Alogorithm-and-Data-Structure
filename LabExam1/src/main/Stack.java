package main;

import utility.*;

public class Stack {
	private int top=-1;
	private int arr[];

	public Stack(int size) {
		arr = new int[size];
	}

	public boolean isFull() {
		return top == arr.length;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void Push(int val) throws ExceptionHandler {

		if (isFull()) {
			throw new ExceptionHandler("Stack is Full");
		}
		++top;
		arr[top] = val;
		
	}

	public void Pop() throws ExceptionHandler {
		if (isEmpty()) {
			throw new ExceptionHandler("Stack is Empty");
		}
		top--;
	}

	public void Top() throws ExceptionHandler {
		if (isEmpty()) {
			throw new ExceptionHandler("Stack is Empty");
		}
		System.out.println(arr[top]);
	}

	public void getMax() {
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i] > max) {
				max = arr[i];
			}	
		}
//		for (int i : arr) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
		System.out.println("MAX: " + max);
	}

	public void displayAll() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);	
		}
//		for (int i : arr) {
//			System.out.println(arr[i]);
//		}
	}
}
