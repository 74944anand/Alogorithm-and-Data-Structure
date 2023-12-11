package main;

import java.util.Scanner;

public class CustomStack {

	public static void main(String[] args) {

		boolean exit = false;

		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter Stack Size");
			Stack s= new Stack(sc.nextInt());
			while (!exit) {
				System.out.println("Enter Your Choice");
				System.out.println("1. Push");
				System.out.println("2. Pop");
				System.out.println("3. Top");
				System.out.println("4. GetMax");
				System.out.println("5. DisplayAll");
				System.out.println("6. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:// Push
						System.out.println("Enter value to be added");
						s.Push(sc.nextInt());
						break;
					case 2:// Pop
						s.Pop();
						break;
					case 3:// Top
							s.Top();
						break;
					case 4:// GetMax
						s.getMax();
						break;
					case 5:// DisplayAll
						s.displayAll();
					break;
					case 6:// Exit
							exit=true;
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
