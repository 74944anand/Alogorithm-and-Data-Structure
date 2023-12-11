package main;

public class LinkedList {

	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		public Node() {
			this.data = 0;
			this.next = null;
		}
	}

	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean isNull() {
		return head == null;
	}

	public void add(int val) {
		Node newNode = new Node(val);
		if (isNull()) {
			head = newNode;
		} else {
			Node trav = head;

			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
		}
	}

	public void addFirst(Node newNode) {
		if (isNull()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addAtPos(int pos, int val) {
		Node newNode = new Node(val);
		if (isNull() || pos == 1) {
			addFirst(newNode);
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}

	public void removeAllOccur(int val) {
		if (!isNull()) {
			Node trav = head;
			Node temp = trav;
			if (head.data == val) {
				head = head.next;
			}
			while (trav.next != null) {
				if (trav.data == val) {
					temp.next = trav.next;
				}
				temp = trav;
				trav = trav.next;
				if (trav.next == null && trav.data == val) {
					temp.next = null;
				}
			}

		}

	}

	public void displayAll() {
		if (!isNull()) {
			Node trav = head;
			System.out.println("List:");
			 do{
				System.out.print(trav.data+", ");
				trav = trav.next;
			}while (trav!= null);
		}
	}

	public void reverseLinkkedList() {
		
		if(!isNull()) {
		Node oldNode = head;
		head=null;
			while (oldNode != null) {

				Node temp=oldNode;
				oldNode = oldNode.next;
				temp.next = head;
				head = temp;
			}
			
		}
	}
	
	public void addSorted(int val) {
		Node newNode = new Node(val);
		if (isNull()) {
			head = newNode;
		} else {
			Node trav = head;
			Node temp=trav;
			if(head.data>val) {
				newNode.next=head;
				head=newNode;
				return;
			}
			while (trav.next != null) {
				if(trav.data>val) {
					newNode.next=temp.next;
					temp.next=newNode;
					return;
				}
				temp=trav;
				trav = trav.next;	
			}
			trav.next = newNode;
		}
	}
	
	public void allAll(LinkedList list2) {
		if(!isNull()) {
			Node trav=head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next=list2.head;
		}
	}
	public int getPostion(int val) {
		int pos=0;
		Node trav=head;
		if(!isNull()) {
			while(trav!=null) {
				++pos;
				if(trav.data==val) {
					return pos;
				}
				trav=trav.next;
			}
		}
		
		return -1;
	}
	
	public boolean isSorted() {
		Node trav=head;
		Node temp=trav;
		trav=trav.next;
		if(!isNull()) {
			while(trav!=null) {
				if(trav.data<temp.data) {
					return false;
				}
				temp=trav;
				trav=trav.next;
			}
		}
		return true;
	}
}
