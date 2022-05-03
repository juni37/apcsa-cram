package fin;

public class __60_Manual_Indexing2D_1 {

	public static void main(String[] args) {
		
		String[][] arr = new String[3][5];
		
		// TODO: complete method fit()
		
		fit(arr, "abracadabra");
		printMatrix(arr);
//		 output should be:
//		|a	b	r	a	c|
//		|a	d	a	b	r|
//		|a	null	null	null	null|
		
		fit(arr, "mullberry");
		printMatrix(arr);
//		 output should be:
//		|m	u	l	l	b|
//		|e	r	r	y	null|
//		|null	null	null	null	null|	

	}
	
	// fits str character by character into 2D string array arr
	// in row major order. any overflows should be ignored.
	// any shorts should be left as null
	public static void fit(String[][] arr, String str) {
		int i=0;
		for ( int r=0; r<arr.length; r++ ) {
			for ( int c=0; c<arr[0].length; c++) {
				if(i<str.length()) {
					arr[r][c] = str.substring(i, i+1);
					i++;
				} else {
					arr[r][c] = null;
				}
			}
		}
		
	}
	
	public static void printMatrix(String[][] arr) {
		for ( int r=0; r<arr.length; r++ ) {
			System.out.print("|");
			for ( int c=0; c<arr[0].length-1; c++) {
				System.out.print(arr[r][c]+"\t");
			}
			System.out.print(arr[r][arr[0].length-1]);
			System.out.println("|");
		}
		System.out.println();
	}

}
