package main;

import java.util.Scanner;

public class linearSearch {

	public static int linearSearching(int[] x, int num) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = new int[] { 22, 66, 44, 77, 11, 33, 55, 88, 99 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be searched in array");
		int num = sc.nextInt();
		num = linearSearching(arr, num);
		if (num == -1) {
			System.out.println("Number not found");
		} else {
			System.out.println("Number found at index: " + num);
		}
	}
}
