package fin;

public class __32_Jitter1 {

	public static void main(String[] args) {
		
		String str = "112334566788";
		
		// a message consisting of non-repeating numerical sequence is incoming
		// the message may have gone through a connection problem, 
		// so one or more of the numbers may have been repeated (jitter) once.
		// remove the jitters(if any) and retrieve the original message
		// you may assume that there are no jitters of three. ( no 333, only 33 )
		
		String ori = "";
		
		// TODO: write code so 'ori' contains the original message
		for(int i=0; i<str.length()-1; i++) {
			if( str.substring(i,i+1).equals(str.substring(i+1,i+2)) ) {
				ori += str.substring(i,i+1);
				i++; //!!!
			} else {
				ori += str.substring(i,i+1);
			}
		}
		
		
		
		System.out.println(ori); // expected: "12345678"

	}

}
