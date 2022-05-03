package fin;

import java.util.ArrayList;
import java.util.Arrays;

public class __13_ComparisonTraversal {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*9+1);
		}
		
		System.out.println(Arrays.toString(arr));
		// print all numbers that are repeated at least once
		// do NOT use extra structures
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j] = -1;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				System.out.print(arr[i]+" ");
			}
		}

//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					System.out.print(arr[i] +" ");
//				}
//			}
//		}

	}

}
