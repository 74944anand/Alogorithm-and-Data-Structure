package main;

public class sort {

	public static int [] selectionSort(int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		int []arr = new int[] {5,8,6,1,2,7,4,3,9};
		
		arr=selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
