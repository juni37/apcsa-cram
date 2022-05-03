package fin;

import java.util.ArrayList;

public class Javaflix {

	/** An ArrayList of stored Movie objects, instantiated in the constructor. */
	private ArrayList<Movie> flix;
	
	public Javaflix() {
		flix = new ArrayList<Movie>();
	}

	/**
	 * Creates and stores a Movie object in the ArrayList flix. 
	 * After every
	 * insertion, the list flix should be ordered, 
	 * as described in part (b).
	 */
	public void addMovie(String title, int length) {
		/* to be implemented in part (b) */ 
		Movie m = new Movie(title, length);
		for(int i=0; i<flix.size(); i++) {
			if(m.before(flix.get(i))) {
				flix.add(i, m);
				return;
			}
		}
		flix.add(m);
	}

	// There may be instance variables, constructors, and methods not shown.
	public void print() {
		for(Movie m:flix) {
			System.out.println(m);
		}
	}
	
}
