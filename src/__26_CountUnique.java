package fin;

import java.util.ArrayList;

public class __26_CountUnique {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("cat");
		list.add("cat");
		list.add("rat");
		list.add("cat");
		list.add("dog");
		list.add("man");
		
		// how many unique animals are there in list?
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
		System.out.println("num of uniques: "+list.size());
		System.out.println(list);
		
		
	}

	
}
