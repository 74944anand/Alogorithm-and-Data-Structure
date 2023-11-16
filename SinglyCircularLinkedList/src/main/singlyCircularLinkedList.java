package main;

import java.util.Scanner;

public class singlyCircularLinkedList {

	
	static class node{
		private int data;
		private node next;
		private node tail;
		
		public node() {
			data=0;
			next=null;
			tail=null;
		}
		public node(int value) {
			data=value;
			next=null;
			tail=null;
		}
	}
	private node head;
	
	public singlyCircularLinkedList() {
		head=null;
	}
	
	public void displayAll() {
		
		if(head==null) {
			System.out.println("Empty List");
		}
		else {
			node trav=head;
			System.out.println("List:");
		while(trav.next!=null) {
		System.out.println(trav.data);
			trav=trav.next;
		}
		}
	}
	public void addFirst(int value) {
		node trav=head;
		node newnode= new node(value);
		newnode.next=trav;
		head=newnode;
		
	}
	
	public static void main(String[] args) {
		
		singlyCircularLinkedList list= new singlyCircularLinkedList();
		try(Scanner sc= new Scanner(System.in)){
		boolean exit=false;	
		
				while(!exit) {
					try {
						System.out.println("Options:\n"
								+ "1.Display All data\n"
								+ "2.Add at First\n"
								+ "0. Exit");
					
						
						switch (sc.nextInt()) {
						case 1:
							list.displayAll();
							break;
						case 2:
							System.out.println("Enter value to be added at first position");
							list.addFirst(sc.nextInt());
							System.out.println("Added");
							break;
						case 0:
							exit=true;
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
