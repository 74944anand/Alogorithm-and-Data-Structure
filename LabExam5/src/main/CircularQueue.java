package main;

import java.util.StringJoiner;

public class CircularQueue implements ICircularQueue {

	private int front;
	private int rear;
	private int Size;
	private String arr[];
	private int count;

	public CircularQueue(int Size) {
		front = -1;
		rear = -1;
		count = 0;
		this.Size=Size;
		arr = new String[Size];
	}

	public boolean isEmpty() {
		return front==-1;
	}

	public boolean isFull() {
		return front == 0 && rear==Size-1 || front != -1 && rear == front-1;
	}

	@Override
	public boolean add(String element) {
		if (isFull()) {
			System.out.println("Queue is Full");
			return false;
		}
		if(isEmpty()) {
			front=rear=0;
		}
		else{
			rear=(rear+1)%Size;
		}
		arr[rear]=element;
		count++;
		return true;
	}

	@Override
	public String remove() {
		int temp=0 ;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		if(front==rear) {
			front=rear=-1;
		}
		else {
			temp=front;
			front=(front+1)%Size;
		}
		count--;
		return arr[temp];
	}

	@Override
	public int size() {
		if (isEmpty()) {
			return 0;
		}

		return count;
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "";
		}
		 StringJoiner joiner = new StringJoiner(", ");
		    int i = front;
		    do {
		        joiner.add(arr[i]);
		        i = (i + 1) % Size;
		    } while (i != (rear + 1) % Size);
	
		    
		   return joiner.toString();
	}
	
	public void pos() {
		System.out.println("front: "+ front+ " Rear: "+ rear);
	}

}
