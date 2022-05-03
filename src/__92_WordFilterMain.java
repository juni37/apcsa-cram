package fin;

// requires WordFilter.java
public class __92_WordFilterMain {

	public static void main(String[] args) {

		/*
		String str1 = "you-are-making-me-beat-up-grass";
		String str2 = "i,am,groot";
		String str3 = "i*just*had*a*great*idea*but*its*gone*now";
		"abc aab aaa cba aaa bcc abb aaa";
		*/
		
		String str = "you-are-making-me-beat-up-grass";
		
		WordFilter wf = new WordFilter("-");
		System.out.println(wf.filtered(str));
		
			
	}
	
}
