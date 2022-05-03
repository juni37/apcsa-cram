package fin;

import java.util.ArrayList;
import java.util.Arrays;

public class __46_Merge2 {

	public static void main(String[] args) {
		
		int[] a1 = {1, 2, 6, 9};
		int[] a2 = {3, 4, 5, 7, 8};
		int[] r = new int[a1.length+a2.length];
		
		merge(a1, a2, r);
		System.out.println(Arrays.toString(r));
		// output:
		// [1, 2, 3, 4, 5, 6, 7, 8, 9]

	}
	
	// precondition: []a, []b are sorted in ascending order
	// postcondition: r contains all elements of []a and []b 
	//				  r is sorted in ascending order
	public static void merge(int[] a, int[] b, int[] r) {
		int i=0; // index for a
		int j=0; // index for b
		int k=0; // index for r
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				r[k]=a[i];
				k++;
				i++;
			} else {
				r[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			r[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			r[k]=b[j];
			k++;
			j++;
		}
		
	}

}







