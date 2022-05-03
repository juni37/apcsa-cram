package fin;

public class __27_ReverseString {

	public static void main(String[] args) {
		
		String[] table = {"a","b","c","d","e"};
		String str = "";
		for (int i = 0; i < 5; i++) {
			str += table[(int) (Math.random() * table.length)];
		}
		System.out.println(str);
		
		// store the reverse of string str in rts.
		String rts = "";
		// i : front to back
		// n-1-i : back to front
		for(int i=0; i<str.length(); i++) {
			rts += str.substring( str.length()-1-i, str.length()-i );
		}

		System.out.println(rts);
		
	}

}
