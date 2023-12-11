package main;

import java.util.Scanner;

public class SinglyLinkedList {

	public static void main(String[] args) {
		boolean exit = false;
		try (Scanner sc = new Scanner(System.in)) {
			LinkedList list= new LinkedList();
			while (!exit) {

				System.out.println("Enter Your Choice");
				System.out.println("1. Add");
				System.out.println("2. Add at Position");
				System.out.println("3. Remove all occurances of number");
				System.out.println("4. Display All Elements");
				System.out.println("5. Reverse the Linked List");
				System.out.println("7. Add sortedly");
				System.out.println("8. Add All");
				System.out.println("9. Get Position of X");
				System.out.println("10. Check if List is Sorted");
				try {

					switch (sc.nextInt()) {

					case 1:// Add
						System.out.println("Enter value to be added");
						list.add(sc.nextInt());
						break;
					case 2:// Add at Position
						System.out.println("Enter position and value to be added");
						list.addAtPos(sc.nextInt(), sc.nextInt());
						break;
					case 3:// Remove all occurances of number
						System.out.println("Enter value to be removed");
						list.removeAllOccur(sc.nextInt());
						break;// Display All Elements
					case 4://Display All Elements
						list.displayAll();
						break;// Reverse the Linked List
					case 5://Reverse the Linked List
						list.reverseLinkkedList();
						break;
					case 6:// Exit
						exit = true;
						break;
					case 7:// add Sorted
						System.out.println("Enter Value to be added");
						list.addSorted(sc.nextInt());
						break;
					case 8:// add All
						LinkedList list2= new LinkedList();
						list.allAll(list2);
						System.out.println("This is List 2:");
						list2.displayAll();
						break;
					case 9:// add Sorted
						System.out.println("Enter Value to be searched");
						int pos=list.getPostion(sc.nextInt());
						System.out.println("Position: "+pos);
						break;
					case 10:// add Sorted
						System.out.println("Enter Value to be searched");
						boolean isSorted=list.isSorted();
						if(isSorted) {
							System.out.println("List is Sorted");
						}
						else {
							System.out.println("List is not Sorted");	
						}
						break;
					
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
