package fin;

import java.util.ArrayList;
import java.util.Arrays;

public class __44_Merge1 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		int[] arr = {};
				
		// TODO: instantiate and populate arr.
		// postcondition: arr is a concatenation of arr1 and arr2 
		// i.e. arr should be [1, 2, 3, 4, 5, 6]

		arr = new int[arr1.length+arr2.length];
		int j=0;
		for (int i=0;i<arr1.length;i++){
			arr[j]=arr1[i];
			j++;
		}
		for (int i=0;i<arr2.length;i++){
			arr[j]=arr2[i];
			j++;
		}


		// end TODO
		
		System.out.println("after merge: "+ Arrays.toString(arr));
		
	}
	
}
