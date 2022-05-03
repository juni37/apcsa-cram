package fin;

public class __30_SwapCypher {

	public static void main(String[] args) {
		
		String str = "a1b2c3d4e5";
		
		// swap the first character with the second character, 
		// 3rd with 4th
		// 5th with 6th
		// ...
		// assume str has even number of characters

		System.out.println( str + " ==> " + swap(str) );

	}

	// complete this method
	private static String swap(String str) {
		String ret = "";
		for(int i=0; i<str.length(); i+=2 ) {
			ret += str.substring(i+1,i+2);
			ret += str.substring(i,i+1);
		}
		return ret;
	}

}
