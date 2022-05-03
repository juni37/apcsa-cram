package fin;

import java.util.ArrayList;

public class __62_Byteoff3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=44; i++) list.add(i);
		
		int[][] munch = new int[2][2];
		
		// 1. complete the routine Bite()
		// 2. use Bite() to complete the following task:
		// 	fill the munch[][] with numbers from list.
		//	print munch[][]
		//  repeat the above until no more numbers remain in list
		// printMatrix() has been provided for you
//		expected output:
//		|1	2|
//		|3	4|
//
//		|5	6|
//		|7	8|
//
//		|9	10|
//		|11	12|
//
//		|13	14|
//		|99	99|	
		
		
		// TODO: write code here
		while(list.size()>0) {
			Bite(list,munch);
			printMatrix(munch);
		}
		
	}
	
	
	
	// fills munch[][] with numbers from list in row major order
	// if list doesn't have enough numbers for munch[][], fill the shorts with 99
	// if list is empty, returns munch filled with 99
	// postcondition: any numbers used to fill munch[][] is removed from list
	private static void Bite(ArrayList<Integer> list, int[][] munch) {
		for(int r=0; r<munch.length; r++) {
			for(int c=0; c<munch[0].length; c++) {
				if(list.size()>0) {
					munch[r][c] = list.remove(0);
				} else {
					munch[r][c] = 99;
				}
			}
		}
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
