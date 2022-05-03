package fin;

// requires Javaflix.java, Movie.java
public class __91_JavaflixMain {

	public static void main(String[] args) {
		Javaflix jf = new Javaflix();

		jf.addMovie("Iron Man", 126);
		jf.addMovie("Iron Man 2", 124);
		jf.addMovie("Thor", 114);
		jf.addMovie("Captain America", 109);
		jf.addMovie("The Avengers", 143);
		jf.addMovie("Iron Man 3", 131);
		jf.addMovie("Thor: The Dark World", 112);
		jf.addMovie("Guardians of the Galaxy", 125);
		jf.addMovie("Thor", 184); // with commentary
		jf.addMovie("The Avengers", 303); // with commentary

		
		jf.print();
		
/* ordered
Captain America(109)
Guardians of the Galaxy(125)
Iron Man(126)
Iron Man 2(124)
Iron Man 3(131)
The Avengers(303)
The Avengers(143)
Thor(184)
Thor(114)
Thor: The Dark World(112)
*/
		
	}
	
}
