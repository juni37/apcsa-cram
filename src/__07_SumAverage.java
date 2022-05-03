package fin;

import java.util.Arrays;

public class __07_SumAverage {

	public static void main(String[] args) {

		int[] arr = randomIntArray(10, 1, 9);
		System.out.println(Arrays.toString(arr));
		
		// 2. finish method listSum() to find the sum of numbers in list
		int sum = listSum(arr);
		
		// 3. print the sum and average.
		System.out.println("sum: " + sum);
		
		// don't do this!
		double avr = sum/arr.length;
		System.out.println("average: "  + avr );
		
//		System.out.println("average: "  + (double)sum/arr.length );
		
	}
	
	/**
	 * 
	 * @param list
	 * @return : sum of all numbers in list
	 */
	public static int listSum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	// creates and returns a array containing n numbers in range [min, max]
	public static int[] randomIntArray(int n, int min, int max) {
		int[] ret = new int[n];
		for(int i=0; i<ret.length; i++) {  // ret.size() will NOT work
			int r = (int) (Math.random()*(max-min+1)+min);
			ret[i] = r;
		}
		return ret;
	}

}
