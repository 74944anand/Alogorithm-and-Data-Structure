package main;

import java.util.Scanner;

public class doublyCircularList {

	static class Node {
		private int data;
		private Node prev;
		private Node next;

		public Node() {
			data = 0;
			next = prev = null;
		}

		public Node(int val) {
			data = val;
			next = prev = null;
		}
	}

	private Node head;

	public doublyCircularList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void displayAll() {

		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			Node trav = head;
			System.out.println("List:");
			do{
				System.out.println(trav.data);
				trav = trav.next;
			}while (trav.next != head);
			if(trav.next==head) {
				System.out.println(trav.data);
			}
		}
	}

	public void addFirst(int val) {
		Node newNode = new Node(val);
		if (isEmpty()) {
			head = newNode;
			newNode.prev = head;
			newNode.next = head;
		} else {
			Node trav=head;
			newNode.prev= trav.prev;
			newNode.next = trav;
			trav.prev.next=newNode;
			trav.prev=newNode;
			head=newNode;
			
		}
	}

	public void addLast(int val) {
		Node newNode = new Node(val);
		if (isEmpty()) {
			head = newNode;
			newNode.prev = head;
			newNode.next = head;
		}
		else {
			Node trav=head;
			while(trav.next!=head) {
				trav=trav.next;
			}
			newNode.next=trav.next;
			newNode.prev=trav;
			trav.next=newNode;
			head.prev=newNode;
		}
	}

	public void addAtPosition(int pos, int val) {
		Node trav=head;
		Node newNode= new Node(val);
		for(int i=1;i<pos-1;i++) {
			trav=trav.next;
		}
		 newNode.prev=trav;
		 newNode.next=trav.next;
		 trav.next.prev=newNode;
		 trav.next=newNode;
	}

	public void deleteAll() {
		head.next=null;
		head.prev=null;
		head=null;
	}

	public void deleteFirst() {
		Node trav=head;
		trav.prev=trav.next.prev;
		head=trav.next;
		while(trav.next!=null) {
			trav=trav.next;
		}
		trav.next=head;
	}

	public void deleteLast() {
		Node trav=head;
		
		while(trav.next!=head) {
			trav=trav.next;
		}
		head.prev=trav.prev;
		trav=trav.prev;
		trav.next=head;
	}

	public void deleteAtPos(int pos) {
		Node trav=head;
		
		for(int i=1;i<pos-1;i++) {
			trav=trav.next;
		}
		trav.next.next.prev=trav;
		trav.next=trav.next.next;
	}

	public static void main(String[] args) {

		doublyCircularList list = new doublyCircularList();
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println("Options:\n" + "1.Display All data\n" + "2.Add at First\n" + "3.Add last\n"
							+ "4.Add At Position\n" + "5.Delete All\n" + "6.Delete First\n" + "7.Delete Last\n"
							+ "8.Delete at Position\n" + "0. Exit");

					switch (sc.nextInt()) {
					case 1:
						list.displayAll();
						break;
					case 2:
						System.out.println("Enter value to be added at first position");
						list.addFirst(sc.nextInt());
						System.out.println("Added");
						break;
					case 3:
						System.out.println("Enter value to be added at last position");
						list.addLast(sc.nextInt());
						System.out.println("Added");
						break;
					case 4:
						System.out.println("Enter position and Value to be added");
						list.addAtPosition(sc.nextInt(), sc.nextInt());
						break;
					case 5:
						list.deleteAll();
						break;
					case 6:
						list.deleteFirst();
						break;
					case 7:
						list.deleteLast();
						break;
					case 8:
						System.out.println("Enter Position to be deleted");
						list.deleteAtPos(sc.nextInt());
						break;
					case 0:
						exit = true;
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			}

		}
	}

}
