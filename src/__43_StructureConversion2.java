package fin;

import java.util.ArrayList;
import java.util.Arrays;

public class __43_StructureConversion2 {

	public static void main(String[] args) {

		String str = "Hey Jude!";
		
		// TODO: remove all non-alphabet characters from str.
		// postcondition: str should be all lowercase, alphabet characters
		// ascii code for a: 97 z: 122
		
		str = str.toLowerCase();
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0; i<str.length(); i++) {
			list.add(str.charAt(i));
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)>'z' || list.get(i)<'a') {
				list.remove(i);
				i--;
			}
		}
		str = "";
		for(int i=0; i<list.size(); i++) {
			str += list.get(i);
		}

		
		// end TODO
		
		System.out.println( "after conversion: "+ str);
		
	}
	
}
