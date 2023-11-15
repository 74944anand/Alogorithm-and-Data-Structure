package main;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class singlyLinkedList {

	static class node{
		private int data;
		private node next;
		
		public node() {
			data=0;
			next=null;
		}
		public node(int val) {
			data=val;
			next=null;
		}
	}
	private node head;
	public singlyLinkedList() {
		head=null;
	}
	
	void display() {
		node trav=head;
		System.out.println("List:");
		while(trav!=null) {
			System.out.println(trav.data);
			trav=trav.next;
		}
		System.out.println("");
	}
	
	void addFirst(int val) {
	node newnode= new node(val);	
		
		if(head==null) {
			head=newnode;
		}
		else {
			node trav=head;
			newnode.next=head;
			head=newnode;
		}
	}
	
	
	void addLast(int val) {
		node trav=head;
		node newnode= new node(val);
		if(head==null) {
			head=newnode;
		}
		else {
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next=newnode;
		}
		
	}
	
	void addAtPos(int val,int pos) {
		node trav=head;
		node newnode= new node(val);
		for(int i=1;i<pos-1;i++) {
			trav=trav.next;
		}
		newnode.next=trav.next;
	}
	
	void deleteAll() {
		head=null;
	}
	
	void deleteFirst() {
		node trav=head;
		trav=trav.next;
		head=trav;
	}
	
	void deleteLast() {
		node trav=head;
		node temp=trav;
		while(trav.next!=null) {
			temp=trav;
			trav=trav.next;
		}
		temp.next=null;
	}
	
	void deleteAtPos(int pos) {
		node trav=head;
		node temp=trav;
		for(int i=1;i<pos;i++) {
			temp=trav;
			trav=trav.next;
		}
		temp.next=trav.next;
		trav.next=null;
	}
	
	public static void main(String[] args) {
		singlyLinkedList list=new singlyLinkedList();
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
