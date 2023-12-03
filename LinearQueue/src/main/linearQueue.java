package main;

import java.util.Scanner;

public class linearQueue {

	private int front;
	private int rear;
	int arr[];
	public linearQueue(int size) {
		front=rear=-1;
		arr=new int[size];
	}
	
	
	public void displayAll(){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public void push(int val) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}else {
			++rear;
			rear=rear%arr.length;
			arr[rear]=val;	
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			front++;
		}
		
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}else {
			System.out.println(arr[front+1]);
		}
		
	}
	
	public boolean isFull() {
	return front==rear && front!=-1 || front==-1 && rear==arr.length-1;	
	}
	
	public boolean isEmpty() {
		return front==rear && front==-1;	
		}
	
	
	public static void main(String[] args) {
		boolean exit=false;
		linearQueue q= new linearQueue(4);
		
		try(Scanner sc=new Scanner(System.in);){
		while(!exit) {
			System.out.println("Circular Queue");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display All ");
			System.out.println("5. Exit");
			try{		
			
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter value");
				q.push(sc.nextInt());
				break;
			case 2:
				q.pop();
				break;
			case 3:
				q.peek();
				break;
			case 4:
				q.displayAll();;
				break;
			case 5:
				exit=true;
				break;
			}
			
			}catch(Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
		}

	}

}}
