package main;

import java.util.Scanner;

public class singlyCircularLinkedList {

	static class node {
		private int data;
		private node next;

		public node() {
			data = 0;
			next = null;
		}

		public node(int value) {
			data = value;
			next = null;

		}
	}

	private node head;
	private node tail;

	public singlyCircularLinkedList() {
		head = null;
	}

	public void displayAll() {

		if (head == null) {
			System.out.println("Empty List");
		} else {
			node trav = head;
			System.out.println("List:");
			do {
				System.out.println(trav.data);
				trav = trav.next;
			}while (trav.next !=head);
		if(trav.next==head) {
			System.out.println(trav.data);
		}
		}
		
	}

	public void addFirst(int value) {
		node trav = head;
		node newnode = new node(value);
		newnode.next = trav;
		if (head == null) {
			tail = newnode;
			System.out.println("Tail Data");
			System.out.println(tail.data);
		}
		head = newnode;	
	}

	public void addLast(int value) {
		node newnode = new node(value);
		if (head == null) {
			newnode.next = head;
			head = newnode;
		tail=newnode;
		} else {
			newnode.next=head;
			tail.next=newnode;
			tail=newnode;
		}

	}

	public void addAtPosition(int pos, int val) {
		node trav=head;
		node prev = null;
		if(head==null) {
			System.out.println("Empty Array");
		}
		node newnode=new node(val);
		for(int i=0;i<pos-1;i++) {
			prev=trav;
			trav=trav.next;
		}
		newnode.next=trav;
		prev.next=newnode;
	}
	
	public static void main(String[] args) {

		singlyCircularLinkedList list = new singlyCircularLinkedList();
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
						list.addAtPosition(sc.nextInt(),sc.nextInt());
						break;
					case 5:
						list.displayAll();
						break;
					case 6:
						list.displayAll();
						break;
					case 7:
						list.displayAll();
						break;
					case 8:
						list.displayAll();
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
