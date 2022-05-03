package fin;

public class __11_RunLogicA {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 3, 6, 6, 6, 3, 3, 3, 3, 2, 1 }; 
		
		// where did the longest run of 6 end? (index?)
		System.out.println(maxRunIndex(arr,6));

	}
	
	public static int maxRunIndex(int[] arr, int n) {
		int currentRunLength=0;
		int maxRunLength=0;
		int maxRunIndex=0;
		for ( int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				currentRunLength++;
				if ( currentRunLength > maxRunLength ) {
					maxRunLength = currentRunLength;
					maxRunIndex=i;
				}
			} else {
				// alternate check for max..
				currentRunLength = 0;
			}
		}
		// alternate check for max..
		return maxRunIndex;
	}

}
