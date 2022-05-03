package fin;

public class __35_PositiveNegative2 {

	public static void main(String[] args) {
		
		
		String str1 = "no i say";
		String str2 = "i'm gonna say no to that";
		String str3 = "the answer is no";
		String str4 = "yes is my answer";
		String str5 = "i'll have to say yes to that";
		String str6 = "what can i say but yes";
		String str7 = "that's all folks!";
		
		// should be n n n p p p neut
		System.out.println( posneg(str1) );
		System.out.println( posneg(str2) );
		System.out.println( posneg(str3) );
		System.out.println( posneg(str4) );
		System.out.println( posneg(str5) );
		System.out.println( posneg(str6) );
		System.out.println( posneg(str7) );
		
	}
	
	/**
	 * analyzes string s for context... respond to existence of 'no' or 'yes'
	 * @param s
	 * @return "positive" if s contains "yes", "negative" if s contains "no". 
	 * if s contains neither return "neutral".
	 */
	// "  ino  "
	public static String posneg(String s) {
		if( s.indexOf(" no ")!=-1 ) return "negative";
		if( s.indexOf("no ") == 0 ) return "negative";
		if( s.indexOf(" no") == s.length()-3 ) return "negative";
		
		if( s.indexOf(" yes ")!=-1 ) return "positive";
		if( s.indexOf("yes ") == 0 ) return "positive";
		if( s.indexOf(" yes") == s.length()-4 ) return "positive";
		
		return "neutral";
	}

}
