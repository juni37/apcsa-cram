package fin;

import java.util.ArrayList;

public class __63_PascalsTriangle {

	public static void main(String[] args) {
		
		// 1. finish pascalT()
		// 2. print the first 6 lines of Pascal's triangle
		/*
|1	0	0	0	0	0|
|1	1	0	0	0	0|
|1	2	1	0	0	0|
|1	3	3	1	0	0|
|1	4	6	4	1	0|
|1	5	10	10	5	1|		
		 */		
		
		int[][] p = pascalsTriangle(6);
		printMatrix(p);

	}
	
	public static int[][] pascalsTriangle(int n) {
		int[][] arr = new int[n][n];
		for (int r = 0; r < n; r++) {
			for (int c = 0; c <= r; c++) {
				if (r == c || c == 0) {
					arr[r][c] = 1;
				} else {
					arr[r][c] = arr[r - 1][c - 1] + arr[r - 1][c];
				}
			}
		}
		return arr;
	}

	public static void printMatrix(int[][] arr) {
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
