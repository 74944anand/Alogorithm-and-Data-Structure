package main;

public class insertionSort {

	public static void sort(int []x) {
		
		
		for(int i=1;i<x.length;i++) {
			int temp=x[i], j;
			for(j=i-1;j>=0 && x[j]>temp;j--) {
				
				if(x[j]>temp) {
					x[j+1]=x[j];
				}
			}
			x[j+1]=temp;
			
		}
			
		for(int i: x) {
			System.out.println(i);
		}
		
	}
	
public static void main(String[] args) {
		
		int arr[]=new int[] {6,2,4,1,7,5,3,8};
		
		
		for(int i: arr) {
			System.out.println(i);
		}
		
		sort(arr);
	
}}
