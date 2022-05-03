package fin;

import java.util.Arrays;

public class __58_BinarySearch {

	public static void main(String[] args) {
	
		// create an array of 10 integers in range[1,99]
		int[] arr = new int[10];
		for( int i=0; i<arr.length; i++) {
			arr[i] = (int)( Math.random()*99+1); 
		} 
		arr[0] = 50;
		Arrays.sort(arr); // binarySearch won't work when array is unsorted. 
		System.out.println(Arrays.toString(arr));
		
		// write and test binarySearch()
		System.out.println("50 found at index: "+binarySearch(arr, 50));
		System.out.println("999 found at index: "+binarySearch(arr, 999));

	}
	

	/**
	 * assumptions: arr is sorted in ascending order
	 * @param arr
	 * @param num
	 * @return index of first occurrence of num in arr. if not found, return -1
	 */
	public static int binarySearch(int[] arr, int num) {
		int low = 0;
		int high = arr.length-1;
		while (low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==num) {
				return mid; 
			} else if (arr[mid]<num) {
				low=mid+1;
			} else if (arr[mid]>num) {
				high=mid-1;
			} 
		}
		return -1;
	}

}
