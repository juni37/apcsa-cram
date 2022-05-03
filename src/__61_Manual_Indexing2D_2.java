package fin;

public class __61_Manual_Indexing2D_2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		// TODO: complete method fit()
		
		fit(arr, nums);
		printMatrix(arr);
//		 output should be:
//		|1  2  3  4|
//		|5  6  7  8|
//		|9  0  0  0|
		

	}
	

	// fits all numbers in nums into arr in row major order
	// part of the code has been provided; complete the rest!
	// any overflows should be ignored
	// any shorts should be left 0
	public static void fit(int[][] arr, int[] nums) {
		int row = 0;
		int col = 0;
		for(int i=0; i<nums.length; i++) {
			arr[row][col] = nums[i];
			// TODO: add code here...
			col++;
			if(col==arr[0].length) {
				col=0;
				row++;
			}
			// end TODO 
		}
		
	}
	
	public static void printMatrix(int[][] arr) {
		for ( int r=0; r<arr.length; r++ ) {
			System.out.print("|");
			for ( int c=0; c<arr[0].length-1; c++) {
				System.out.print(arr[r][c]+"  ");
			}
			System.out.print(arr[r][arr[0].length-1]);
			System.out.println("|");
		}
		System.out.println();
	}

}
