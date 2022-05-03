package fin;

public class __39_FindLastOccurrence {

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
		
		// print index of last occurrence of s in str
		System.out.println(str);
		System.out.println("012345678901234567890123456789");
		
		System.out.println("index of last: "+ findLast(str, s));
		
	}
	
	private static int findLast(String str, String s) {
		int index = str.indexOf(s);
		int last = -1;
		while(index != -1) {
			last = index;
			index = str.indexOf(s,index+1);
		}
		return last;
	}

}
