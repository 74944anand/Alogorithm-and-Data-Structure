package main;

import java.util.Scanner;
public class hashTableMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		hashTable ht= new hashTable();
		ht.put(1, "Ganesh");
		ht.put(22, "Ramesh");
		ht.put(33, "Dilip");
		ht.put(23, "Sak");
		ht.put(40, "Nil");
		ht.put(5, "Rup");
		ht.put(7, "Raghu");
		System.out.println("Enter roll no");
		String name=ht.getValue(sc.nextInt());
		if(name==null)
			System.out.println("Name not found");
		else
		System.out.println("Name found"+ name);
	
		
	}

}
