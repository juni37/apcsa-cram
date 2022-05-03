package fin;

public class __40_FindkthOccurrence {

	public static void main(String[] args) {
		
		String str = "";
		for(int i=0; i<10; i++) {
			if(Math.random()>0.5) {
				str += "cat";
			} else {
				str += "dog";
			}
		}

		String s = "cat";
		
		// print indices of all occurrences of s in str
		System.out.println(str);
		System.out.println("012345678901234567890123456789");
		
		for(int n=1; n<=10; n++) {
			System.out.println("occurrence "+n+": "+ findNth(str, s, n));
		}
		System.out.println("null string: "+ findNth("", s, 1));
		System.out.println("no occurrence: "+ findNth("dogdog", "cat", 1));
		
	}
	private static int findNth(String str, String s, int n) {
		int index = str.indexOf(s);
		int count = 1;
		while(index!=-1 && count<n) {
			count++;
			index = str.indexOf(s,index+1);
		}
		return index;
	}
	
}
