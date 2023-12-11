package main;

public class CircularQueue implements ICircularQueue {

	private int front;
	private int rear;
	private String arr[];
	private int count;

	public CircularQueue(int Size) {
		front = -1;
		rear = -1;
		count = 0;
		arr = new String[Size];
	}

	public boolean isEmpty() {
		if (front == -1 && front == rear) {
			System.out.println("Queue is Empty");
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (front != -1 && front == rear || front == -1 && rear == arr.length - 1) {
			System.out.println("Queue is Full");
			return true;
		}
		return false;
	}

	@Override
	public boolean add(String element) {
		if (isFull()) {
			rear=-1;
			return false;
		}

		System.out.println("rear:" + rear);
		if (rear == arr.length - 1) {
			rear = -1;
			System.out.println("rear:" + rear);
		}
		++rear;
		arr[rear] = element;
		count++;
		return true;
	}

	@Override
	public String remove() {
		if (isEmpty()) {
			return null;
		}
		if (front == arr.length - 1) {
			front = -1;
			System.out.println("rear:" + rear);
		}
		++front;
		count--;
		return arr[front];
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
		String Queue = "";
		if (front == -1) {
			int temp = front + 1;
			while (temp != arr.length) {
				Queue = Queue.concat(arr[temp] + ",");
				temp++;
			}
			return Queue;
		} else if (front >= 0 && rear == arr.length - 1) {
			int temp = front+1;
			while (temp != arr.length) {
				Queue = Queue.concat(arr[temp] + ",");
				temp++;
			}
			return Queue;
		} else {
			String EndQueue = "";
			String StartQueue = "";
			int temp = front;
			if (rear < front && front > 0) {
				while (temp != arr.length) {
					EndQueue = EndQueue.concat(arr[temp] + ",");
					temp++;
				}
				temp = 0;
				while (temp != rear + 1) {
					StartQueue = EndQueue.concat(arr[temp] + ",");
					temp++;
				}
				Queue = StartQueue.concat(EndQueue);
				return Queue;
			}

		}
		front=-1;
		rear = 0;
		isEmpty();
		return "";

	}

//	public String toString() {
//		if(isEmpty()) {
//			return "";
//		}
//		String Queue="";
//		if(front==-1) {
//			for(int i=0;i<=rear;i++) {
//				Queue=Queue.concat(arr[i]+",");
//			}	
//			System.out.println("Inside full1 queue" + Queue);
//			return Queue;
//			
//		}
//		if(rear>front && front>=0) {
//			for(int i=front+1;i<=rear;i++) {
//				Queue=Queue.concat(arr[i]+",");
//			}	
//			System.out.println("Inside full2 queue" + Queue);
//			return Queue;
//			
//		}
//		else if(front!=rear){
//			String EndQueue="";
//			String StartQueue="";
//			int start=front;
//				if(rear<front && front>0) {					
//					while(start!=arr.length-1) {
//						EndQueue=EndQueue.concat(arr[start]+ ",");
//						start++;
//			
//					}
//					System.out.println("Inside front endqueue"+ EndQueue);
//				}
//				start=0;
//				while(start!=rear) {
//					StartQueue=StartQueue.concat(arr[start]+ ",");
//					start++;
//				}
//				System.out.println("Inside front startqueue"+ StartQueue);
//				Queue=StartQueue.concat(EndQueue);
//			}
//		else if(front==rear){
//			front=rear=-1;
//			isEmpty();
//			return "";
//		}
//		
//		
//		return Queue;
//	}
//	

}
