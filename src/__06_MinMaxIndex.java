package fin;

public class __06_MinMaxIndex {

	public static void main(String[] args) {

		int[] arr = randomIntArray(10, 1, 99);
		
		// what are the smallest and largest values in arr?
		// complete minIndex() and maxIndex() which return the indices of min and max

		
		System.out.println("min: " + arr[ minIndex(arr) ]);
		System.out.println("max: " + arr[ maxIndex(arr) ]);

	}
	
	public static int minIndex(int[] arr) {
		int min = Integer.MAX_VALUE;
		// or min = arr[0];
		int minIndex = -1;
		for(int i=0; i<arr.length; i++) {
			int cur = arr[i];
			if( cur < min ) {
				min = cur;
				minIndex = i;
			}
		}
		return minIndex;
	}	
	
	public static int maxIndex(int[] arr) {
		int max = Integer.MIN_VALUE;
		// or max = arr[0];
		int maxIndex = -1;
		for(int i=0; i<arr.length; i++) {
			int cur = arr[i];
			if( cur > max ) {
				max = cur;
				maxIndex = i;
			}
		}
		return maxIndex;
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
