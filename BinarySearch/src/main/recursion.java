package main;

import java.util.Arrays;
import java.util.Scanner;

public class recursion {

	public static int binarySearch(int []x,int num,int left,int right) {
	     if (left > right) {
	            return -1;
	        }

	        int mid = (left+right) / 2;

	        if (x[mid] == num) {
	            return mid;
	        } else if (x[mid] < num) {
	            return binarySearch(x, num, mid + 1, right);
	        } else {
	            return binarySearch(x, num, left, mid - 1);
	        }
	}
	public static void main(String[] args) {
		int arr[] = new int[] { 22, 66, 44, 77, 11, 33, 55, 88, 99 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be searched in array");
		int num = sc.nextInt();
		
		Arrays.sort(arr);
		int left=0,right;
		right=arr.length;
		num= binarySearch(arr,num,left,right);
		if (num == -1) {
			System.out.println("Number not found");
		} else {
			System.out.println("Number found at index: " + num);
		}
		
	}
	
}
