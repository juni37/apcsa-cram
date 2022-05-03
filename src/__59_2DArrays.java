package fin;

public class __59_2DArrays {

	public static void main(String[] args) {

		// 2D arrays
		int[][] arr2 = new int[3][4];
		int[][] arr = {
				{ 1, 2, 3, 4 },
				{ 11, 12, 13, 14},
				{ 21, 22, 23, 24}
		};
		
		// A 2D array is essentially an array of arrays.
		System.out.println("Number of rows: " + arr.length );
		// A 2D array with constant number of columns ( matrix )
		System.out.println("Number of columns: " + arr[0].length );

		System.out.println("-----------------------");
		
		// traversal: Row Major
		for ( int r=0; r<arr.length; r++ ) {
			for ( int c=0; c<arr[0].length; c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		// traversal: Column Major
		for ( int c=0; c<arr[0].length; c++) {	
			for ( int r=0; r<arr.length; r++ ) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		// rows with different lengths
		int[][] ints = { 
				{1, 2}, 
				{1, 2, 3}, 
				{1, 2, 3, 4} 
				}; 

		// traversing ints2
		System.out.println("// ints2");
		for ( int i=0; i<ints.length; i++) {		
			for ( int j=0; j<ints[i].length; j++) {
				System.out.print(ints[i][j]+", ");
			}
			System.out.println();
		}

		
	}

}
