package fin;

import java.util.Arrays;

public class __03_RandomSelection2 {

	public static void main(String[] args) {

		int[] arr = { 11, 22, 33, 44, 55 }; 
		
		int num = 10;
		// print num numbers randomly selected from arr
		// do NOT allow repetition!
		// if arr runs out of numbers, print "N/A"
		for(int i=0; i<num; i++) {
			if(arr.length==0) {
				System.out.println( "N/A" );
			} else {
				int r = (int) (Math.random()*arr.length);
				System.out.println( arr[r] );
				// remove element at r
				int[] temp = new int[arr.length-1];
				int k=0;
				for(int j=0; j<arr.length; j++) {
					if(j!=r) {
						temp[k] = arr[j];
						k++;
					}
				}
				arr = temp;
			}
		}
	}

}
