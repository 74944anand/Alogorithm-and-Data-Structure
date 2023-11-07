package main;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	
	public static int binarySearch(int[]x, int num) {
		
		int left=0,right,mid;
		right=x.length;
		
		while(right>= left) {
		mid=(left+right)/2;	
		if(x[mid]==num) {
			return mid;	
		}
		if(x[mid]<num) {
			left=mid+1;
		}
		else {
			right=mid-1;
		}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = new int[] { 22, 66, 44, 77, 11, 33, 55, 88, 99 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be searched in array");
		int num = sc.nextInt();
		
		Arrays.sort(arr);
		
		num= binarySearch(arr,num);
		
		if (num == -1) {
			System.out.println("Number not found");
		} else {
			System.out.println("Number found at index: " + num);
		}
		
	}
	
}
