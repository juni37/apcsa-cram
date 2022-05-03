package fin;

//requires Crossword.java, Square.java
public class __93_CrosswordMain {

	public static void main(String[] args) {
		boolean[][] blackSquares = {
				{true, false, false, true, true, true, false, false, false},
				{false, false, false, false, true, false, false, false, false},
				{false, false, false, false, false, false, true, true, true},
				{false, false, true, false, false, false, true, false, false},
				{true, true, true, false, false, false, false, false, false},
				{false, false, false, false, true, false, false, false, false},
				{false, false, false, true, true, true, false, false, true},
		};
		Crossword cw = new Crossword(blackSquares);

		cw.print2();
		System.out.println();
		cw.print();

	}

}
