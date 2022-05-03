package fin;

import java.util.ArrayList;
import java.util.Arrays;

public class __04_RandomSelection3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = randIntArrayList(5, 100, 110);
		
		int num = 7;
		// print num numbers randomly selected from list
		// do NOT allow repetition!
		// if arr runs out of numbers, print "N/A"

		for(int i=0; i<num; i++) {
			if( list.size()==0 ) {
				System.out.println("N/A");
			} else {
				int r = (int) (Math.random()*list.size()); 
				System.out.println( list.get(r) );
				list.remove(r);
			}
			System.out.println(list);
		}
		
	}
	
	// creates and returns a list containing n integers in range [min, max]
	public static ArrayList<Integer> randIntArrayList(int n, int min, int max) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {  // not ret.size()!!!
			int r = (int) (Math.random()*(max-min+1)+min);
			ret.add(r);
		}
		return ret;
	}

}
