package fin;

public class __34_PositiveNegative {

	public static void main(String[] args) {
		
		
		String str1 = "no no no no no";
		String str2 = "yes yes yes yes yes";
		String str3 = "i don't know...";
		
		// should be neg, pos, neut 
		System.out.println( posneg(str1) );
		System.out.println( posneg(str2) );
		System.out.println( posneg(str3) );
		
	}
	
	/**
	 * analyzes string s for context... respond to existence of 'no' or 'yes'
	 * @param s
	 * @return "positive" if s contains "yes", "negative" if s contains "no". 
	 * if s contains neither return "neutral".
	 */
	public static String posneg(String s) {
		if( s.indexOf(" no ")!=-1 ) return "negative";
		else if( s.indexOf("yes")!=-1 ) return "positive";
		else return "neutral";
	}

}
