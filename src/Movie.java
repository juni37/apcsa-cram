package fin;

public class Movie {
	
	private String title;
	private int length;
	
	public Movie(String t, int l) {
		title = t;
		length = l;
	}

	/** Returns the title of this Movie. */
	public String getTitle() {
		/* implementation not shown */ 
		return title;
	}

	/** Returns the length(mins) of this Movie. */
	public int getLength() {
		/* implementation not shown */ 
		return length;
	}

	/**
	 * Returns true if this movie's title should come before the other, as described
	 * in part (a), false otherwise.
	 */
	public boolean before(Movie other) {
		/* to be implemented in (a) */ 
		if( getTitle().compareTo(other.getTitle()) < 0 ) {
			return true;
		}
		if( getTitle().compareTo(other.getTitle()) == 0 && getLength() > other.getLength()) {
			return true;
		}
		return false;
	}

	// There may be instance variables, constructors, and methods not shown.
	public String toString() {
		return getTitle()+"("+getLength()+")";
	}
}
