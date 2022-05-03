package fin;

import java.util.Arrays;

public class __08_ConditionalCount1 {

	public static void main(String[] args) {

		int[] arr = {1,7,4,8,4,7,2,9,3,4,8,9,6,3,5,8}; 
		
		// how many numbers greater than the average value of arr?
		// should get:
		// 8 greater than mean of 5.5

		int sum = 0;
		int num = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			num++;
		}
		double mean = (double)sum/num; // even though mean is a double, you need a cast

		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>mean) {
				count++;
			}
		}
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(count +" greater than mean of "+ mean);

	}

}
