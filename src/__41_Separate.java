package fin;

import java.util.Arrays;

public class __41_Separate {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			int r = (int)(Math.random()*99+1);
			arr[i] = r;
		}
		System.out.println( Arrays.toString(arr));
		
		int[] odds=null, evens=null;
		
		// TODO: put all the odd numbers in list into odds, even numbers in evens
		odds = new int[arr.length];
		evens = new int[arr.length];
		int j=0;
		int k=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				evens[k] = arr[i];
				k++;
			} else {
				odds[j] = arr[i];
				j++;
			}
		}
		
		// end TODO
		System.out.println("odds: "+ Arrays.toString(odds));
		System.out.println("evens: "+ Arrays.toString(evens));
		
	}
	
}
