package main;

import java.util.Scanner;

public class ImplCircularQueue {

	public static void main(String[] args) {
		
		boolean exit=false;
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Size of Queue");
			CircularQueue q= new CircularQueue(sc.nextInt());
			while(!exit) {
				System.out.println("Enter Your Choice");
				System.out.println("1. Add Element ");
				System.out.println("2. Remove Element ");
				System.out.println("3. Get Size of Queue ");
				System.out.println("4. Print Queue ");
				
				try {
					
					switch(sc.nextInt()) {
					
					case 1://Add Element
						System.out.println("Enter element to be Added ");
						boolean added=q.add(sc.next());
						if(added) {
							System.out.println("Element Added");
						}
						break;
					case 2://Remove Element
						String removed=q.remove();
						if(removed!=null) {
							System.out.println("Removed element is: "+ removed);
						}
						break;
					case 3://Get Size of Queue
						int count=q.size();
						if(count!=0) {
							System.out.println("Size: "+count);
						}
						else {
							System.out.println("Queue is Empty");
						}
						break;
					case 4://Print Queue
						String Queue=q.toString();
						if(Queue!=null) {
							System.out.println("Queue: "+ Queue);
						}
						else {
							System.out.println("Queue is Empty");
						}
						break;
						
					}
					
					
					
				}catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
				
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
