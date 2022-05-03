package fin;

public class __31_SwapCypher2 {

	public static void main(String[] args) {
		
		String str1 = "a1b2c3d4e5";
		String str2 = "a1b2c3d4e5f";
		
		// swap the first character with the second character, 
		// 3rd with 4th
		// 5th with 6th
		// ...
		// if there are dangling character at the end(pairless) include it.

		System.out.println( str1 + " ==> " + swap(str1) );
		System.out.println( str2 + " ==> " + swap(str2) );

	}

	private static String swap(String str) {
		String ret = "";
		for(int i=0; i<str.length()-1; i+=2 ) {
			ret += str.substring(i+1,i+2);
			ret += str.substring(i,i+1);
		}
		if(ret.length()!=str.length()) 
			ret += str.substring(str.length()-1);
		return ret;
	}

}
