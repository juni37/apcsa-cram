package fin;

import java.util.Arrays;

public class __57_InsertionSort {

	public static void main(String[] args) {

		// create an array of 10 integers in range[1,99]
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 99 + 1);
		}
		System.out.println("Unsorted: \t\t" + Arrays.toString(arr));

		// write and use insertionSort() to sort arr
		insertionSort(arr);
		System.out.println("Sorted(ascending): \t" + Arrays.toString(arr));
		
	}
	
	/**
	 * sorts arr in ascending order
	 * @param arr
	 */
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}


}
