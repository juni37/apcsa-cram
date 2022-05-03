package fin;

public class __38_FindAllOccurrences {

	public static void main(String[] args) {
		
		String str = "dogdogcatdogcatcatdogdogcatdog";
		String s = "cat";
		
		// print indices of all occurrences of s in str
		
		findAll(str, s);
		
	}
	
	private static void findAll(String str, String s) {
		int index = str.indexOf(s);
		while(index != -1) {
			System.out.println(index);
			index = str.indexOf(s,index+1);
		}
	}

}
