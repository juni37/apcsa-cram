package fin;

public class __49_StringByteoff2 {

	public static void main(String[] args) {

		String str = "abcdefghij";
		
		// print str: print a random number[1,3] of characters
		// from the beginning to the end of str
		// if the random number exceeds number of characters remaining, 
		// just print the remainder
		
		while(str.length()>0) {
			int r = (int)(Math.random()*3+1);
			if(r<=str.length()) {
				System.out.println( str.substring(r));
				str = str.substring(r);
			} else {
				System.out.println(str);
				str = "";
			}
		}
		
		


	}


}
