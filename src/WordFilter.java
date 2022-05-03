package fin;

public class WordFilter {

	/** Stores the expression to be filtered. */
	private String target;

	/** Constructor. */
	public WordFilter(String w) {
		target = w;
	}

	/**
	 * Returns a string in which all occurrences of string stored in instance
	 * variable target has been substituted with a number of กฎ-กฎs equal in length to
	 * target.
	 */
	public String filtered(String str) {
		/* to be implemented in part (a) */ 
		int index = str.indexOf(target);
		
		String sub = "";
		for(int i=0; i<target.length(); i++) sub+= "-";
		
		while(index!=-1) {
			str = str.substring(0,index) + sub + str.substring(index+ sub.length());
			index = str.indexOf(target, index);
		}

		return str;
	}

	// There may be variables and methods not shown.
}
