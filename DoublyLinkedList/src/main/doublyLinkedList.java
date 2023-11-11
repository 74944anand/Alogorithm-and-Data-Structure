package main;

import java.util.Scanner;

public class doublyLinkedList {

	static class node{
		private node prev;
		private int data;
		private node next;
		
		public node() {
			prev=null;
			data=0;
			next=null;
		}
		public node(int value) {
			prev=null;
			data=value;
			next=null;
		}
		
	}
	private node head;
	public void display(){
		System.out.println("List: ");
		node trav=head;
		while(head!=null) {
			System.out.println(trav.data);
			trav=trav.next;
		}
	}
	void addFirst(int value){
		node trav=head;
		node newnode= new node(value);
		newnode.next=trav;
		trav.prev=newnode;
		head=newnode;
	}
	
	
	void addLast(int value) {
		node trav=head;
		node newnode= new node(value);
		while(trav.next!=null) {
			trav=trav.next;
		}
		newnode.prev=trav;
		trav.next=newnode;
	}
	
	void addAtPos(int value,int pos) {
		
	}
	
	void deleteAll() {
		head=null;
	}
	
	void deleteFirst(){
	node trav=head;
	head=trav.next;
	}
	void deleteLast() {
		node trav=head;
		while(trav.next!=null) {
			trav=trav.next;
		}
		trav=trav.prev;
		trav.next=null;
	}
	
	void deleteAtPos(int pos){
		
	}
	public static void main(String[] args) {
		doublyLinkedList list=new doublyLinkedList();
		Scanner sc= new Scanner(System.in);
		boolean exit=false;
		while(!exit) {
			System.out.println("Options:");
			System.out.println("1. Display all data");
			System.out.println("2. add first ");
			System.out.println("3. add last ");
			System.out.println("4. add paricular position");
			System.out.println("5. Delete All");
			System.out.println("6. Delete first");
			System.out.println("7. Delete Last");
			System.out.println("8. Delete at paricular position \n");
			
			switch (sc.nextInt()) {
			case 1://Display
				list.display();
				break;
			case 2://add first
				System.out.println("Enter value to be added at first");
				list.addFirst(sc.nextInt());
				break;
			case 3://add last
				System.out.println("Enter value to be added");
				list.addLast(sc.nextInt());
				break;
			case 4://add at particular position
				System.out.println("Enter value to be added & its position");
				list.addAtPos(sc.nextInt(),sc.nextInt());
				break;
			case 5://Delete all
				list.deleteAll();
				break;
			case 6://Delete at first
				list.deleteFirst();
				break;
			case 7://Delete last
				list.deleteLast();
				break;
			case 8://Delete at particular position
				System.out.println("Enter position to be deleted");
				list.deleteAtPos(sc.nextInt());
				break;
			default:
				break;
			}

		}
	}
}
