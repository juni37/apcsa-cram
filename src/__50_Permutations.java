package fin;

import java.util.ArrayList;

public class __50_Permutations {

	public static void main(String[] args) {

		String str = "abc";
		
		ArrayList<String> list = new ArrayList<String>();
		// TODO: store all permutations of str in list
		// allowing repetition
		// n^n
		
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<str.length(); k++) {
					String temp = str.substring(i,i+1);
					temp += str.substring(j,j+1);
					temp += str.substring(k,k+1);
					list.add(temp);
				}
			}
		}
		
		
		// end TODO
		System.out.println(list.size() + " strings.");
		System.out.println(list);

	}
	



}
