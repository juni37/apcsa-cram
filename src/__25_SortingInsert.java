package fin;

import java.util.ArrayList;

public class __25_SortingInsert {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		String[] table = {"a","b","c","d","e"};
		for(int i=0; i<5; i++) {
			String tmp = "";
			for(int j=0; j<3; j++) {
				tmp += table[(int)(Math.random()*table.length)];
			} 
			list.add(tmp);
		}
		System.out.println(list);

		// use sorted() to sort list in ascending order, using sortingInsert algorithm
		// hint: use a new list to insert into.

		System.out.println( sorted(list) );
		
	}
	
	// returns a sorted version of list.
	private static ArrayList<String> sorted(ArrayList<String> list) {
		ArrayList<String> temp = new ArrayList<String>();
		for(int i=0; i<list.size(); i++) {
			int num = temp.size();
			for(int j=0; j<temp.size(); j++) {
				if(list.get(i).compareTo(temp.get(j))<0 ) {
					temp.add(j, list.get(i));
					break;
				}
			}
			if(num==temp.size()) {
				temp.add(list.get(i));
			}
		}
		return temp;
	}

}
