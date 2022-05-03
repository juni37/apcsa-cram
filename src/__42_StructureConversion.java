package fin;

import java.util.ArrayList;
import java.util.Arrays;

public class __42_StructureConversion {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			int r = (int)(Math.random()*9+1);
			arr[i] = r;
		}
		System.out.println( Arrays.toString(arr));
		
		// TODO: remove all even numbers from arr. 
		// result should be an array containing only the odd numbers in arr
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				tmp.add(arr[i]);
			}
		}
		arr = new int[tmp.size()];
		for(int i=0; i<tmp.size(); i++) {
			arr[i] = tmp.get(i);
		}

		
		
		// end TODO
		
		System.out.println( "after removing evens: "+ Arrays.toString(arr));
		
	}
	
}
