package fin;

public class __05_MinMax {

	public static void main(String[] args) {

		int[] arr = randomIntArray(10, 1, 99);
		
		// what are the smallest and largest values in arr?
		// complete minVal() and maxVal() 

		
		System.out.println("min: " + minVal(arr));
		System.out.println("max: " + maxVal(arr));

	}
	
	public static int minVal(int[] arr) {
		int min = Integer.MAX_VALUE;
		// or min = arr[0];
		for(int i=0; i<arr.length; i++) {
//			if(i==0) {
//				min = arr[i];
//			}
			int cur = arr[i];
//			if( cur < min ) {
//				min = cur;
//			}
			min = Math.min(min, cur);
		}
		return min;
	}	
	
	public static int maxVal(int[] arr) {
		int max = Integer.MIN_VALUE;
		// or max = arr[0];
		for(int i=0; i<arr.length; i++) {
			int cur = arr[i];
			if( cur > max ) {
				max = cur;
			}
		}
		return max;
	}
	
	// creates and returns a array containing n numbers in range [min, max]
	public static int[] randomIntArray(int n, int min, int max) {
		int[] ret = new int[n];
		for(int i=0; i<ret.length; i++) {  
			int r = (int) (Math.random()*(max-min+1)+min);
			ret[i] = r;
		}
		return ret;
	}

}
