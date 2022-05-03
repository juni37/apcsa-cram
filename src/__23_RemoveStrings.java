package fin;

import java.util.ArrayList;

public class __23_RemoveStrings {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<10; i++) {
			if(Math.random()<0.5) {
				list.add(new String("cat"));
			} else {
				list.add(new String("dog"));
			}
		}
		System.out.println(list);
		
		// remove all "cat"s from list
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals("cat")) {
				list.remove(i);
				i--;
			}
		}
		
		
		
		
		System.out.println(list);
		
	}

}
