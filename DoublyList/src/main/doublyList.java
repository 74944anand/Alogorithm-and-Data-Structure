package main;

import java.util.Scanner;

public class doublyList {

	static class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node() {
			data=0;
			next=null;
			prev=null;
		}
		public Node(int val) {
			data=val;
			prev=next=null;
		}
	}
	
	private Node head;
	public doublyList() {
		head=null;
	}
	
	public boolean isEmpty() {
	return head==null;	
	}
	
	public void displayAll() {
		if(isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			Node trav=head;
			while(trav!=null) {
				System.out.println(trav.data);
				trav=trav.next;
			}
		}
	}
	
	public void addFirst(int val) {
		Node newNode= new Node(val);
		if(isEmpty()) {
			head=newNode;
		}
		else {
			head.prev=newNode;
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void addLast(int val) {
		Node newNode= new Node(val);
		if(isEmpty()) {
			head=newNode;
		}
		else {
			Node trav=head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next=newNode;
			newNode.prev=trav;
			
		}
	}
	
	public void addAtPosition(int pos,int val) {
		Node trav=head;
		Node temp=null;
		Node newNode= new Node(val);
		if(isEmpty()) {
			head=newNode;
		}
		else {
			for(int i=1;i<pos-1;i++) {
				trav=trav.next;
			}
			temp=trav.next;
			newNode.next=temp;
			newNode.prev=trav;
			trav.next=newNode;
			temp.prev=newNode;			
		}
		
	}
	
	public void deleteAll() {
		if(isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			head=null;
		}
		
	}
	
	public void deleteFirst() {
		
		if(isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			head=head.next;
			head.prev=null;
		}
		
	}
	
	public void deleteLast() {
		Node trav=head;
		Node temp;
		
		while(trav.next!=null) {
			trav=trav.next;
		}
		temp=trav.prev;
		trav.prev=null;
		temp.next=null;
	}
	
	public void deleteAtPosition(int pos){
		Node trav=head;
		if(isEmpty()) {
			System.out.println("List is empty");
		}
		else {
			for(int i=1;i<pos;i++) {
				trav=trav.next;
			}
			trav.prev.next=trav.next;
			if(trav.next!=null)
			trav.next.prev=trav.prev;
		}
	}
	
	public static void main(String[] args) {
		doublyList list = new doublyList();
		boolean exit=false;
		Scanner sc= new Scanner(System.in);
		
			while(!exit) {
				System.out.println("Options:");
				System.out.println("1. Display all data");
				System.out.println("2. add first ");
				System.out.println("3. add last ");
				System.out.println("4. add at paricular position");
				System.out.println("5. Delete All");
				System.out.println("6. Delete first");
				System.out.println("7. Delete Last");
				System.out.println("8. Delete at paricular position");
				try{
					switch(sc.nextInt()) {
					case 1://Display All data
						list.displayAll();
						break;
					case 2://add at First
						System.out.println("Enter value to be added");
						list.addFirst(sc.nextInt());
						break;
						
					case 3://Add Last
						System.out.println("Enter value to be added at Last");
						list.addLast(sc.nextInt());
						break;
					case 4://Add at Particular Position
						System.out.println("Enter Position and value to be added");
						list.addAtPosition(sc.nextInt(),sc.nextInt());
						break;
					case 5://Delete All
						list.deleteAll();
						break;
					case 6://Delete First
						list.deleteFirst();
						break;
					case 7://Delete Last
						list.deleteLast();
						break;
					case 8://Delete At Position
						System.out.println("Enter Position to be deleted");
						list.deleteAtPosition(sc.nextInt());
						break;
					case 9://Exit
						exit=true;
						break;
					}
					
				}
			catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
			
			}
			
			
			
		

	}

}
