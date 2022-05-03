package fin;

public class __29_Cypher {

	public static void main(String[] args) {
		
		String str = "alea iacta est"; 
		
		// encrypt str with a caesar cypher +1 ( a=>b, b=>c .. z=>a );
		// assume only lowercase in str.
		// ascii codes for a~z are: 97~122
	
		System.out.println( cypher("abcxyz", 1) );
		System.out.println( cypher("abcxyz", 2) );
		System.out.println( cypher(str, 1) );
		
	}

	private static String cypher(String str, int n) {
		String ret = "";
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			int asc = (int) c;
			asc = asc - 97;
			asc = (asc + n) % 26;
			asc = asc + 97;
			c = (char) asc;
			ret += c;
		}
		return ret;
	}

}
