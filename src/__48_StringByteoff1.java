package fin;

import java.util.ArrayList;

public class __48_StringByteoff1 {

	public static void main(String[] args) {

		String str = "abcdefghij";
		
		for(int i=1; i<=5; i++) {
			System.out.println( bitOff(str, i) );
		}

	}

	// return string str with i characters bitten off from the beginning
	private static String bitOff(String str, int i) {
		return str.substring(i);
	}
	



}
