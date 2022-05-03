package fin;

import java.util.ArrayList;
import java.util.Arrays;

public class __45_Shuffle {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 2, 4, 6, 8, 10 };
		int[] arr = {};
				
		// TODO: instantiate and populate arr.
		// postcondition: arr is a shuffle of arr1 and arr2
		// arr should take one element from arr1, then one element from arr2
		// without repetition until all elements are exhausted.
		// assume arr1 and arr2 have same lengths
		// i.e. arr should be [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		arr = new int[arr1.length+arr2.length];
		for (int i=0;i<arr1.length;i++){
			arr[2*i]=arr1[i];
			arr[2*i+1]=arr2[i];
		}
		
		

		// end TODO
		
		System.out.println("after shuffle: "+ Arrays.toString(arr));
		
	}
	
}
