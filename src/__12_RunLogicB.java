package fin;

public class __12_RunLogicB {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 3, 6, 6, 6, 3, 3, 3, 3, 2, 1 }; 
		
		// where does the longest run in arr begin? (index)
		System.out.println(maxRunIndex(arr));

	}
	
	public static int maxRunIndex(int[] arr) {
		int maxRun = 1;
		int currentRun = 1;
		int maxRunIndex = -1;
		for(int i=0; i<arr.length-1; i++) {
			if ( arr[i]==arr[i+1] ) {
				currentRun++;
				if ( currentRun > maxRun ) {
					maxRun = currentRun;
					maxRunIndex = i+1-(currentRun-1); 
				}
			} else {
				currentRun = 1;
			}
		}
		return maxRunIndex;
	}
}
