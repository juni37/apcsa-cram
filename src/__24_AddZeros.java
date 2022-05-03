package fin;

import java.util.ArrayList;

public class __24_AddZeros {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("original:\t"+list);
		
		// 1. finish method addZeroes()
		addZeroes(list);
		System.out.println("after adding zeros :\n\t\t"+list);

	}
	
	/**
	 * add a zero before all nonzero numbers in list
	 * @param list
	 */
	public static void addZeroes(ArrayList<Integer> list) {
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i)!=0) {
				list.add(i,0);
			}
		}
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i)!=0) {
//				list.add(i,0);
//				i++;
//			}
//		}
	}
	


}
