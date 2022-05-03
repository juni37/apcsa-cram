package fin;

public class Crossword {
	private Square[][] puzzle; 
	
	/** Constructs a crossword puzzle grid.
	** Each element is a Square object with a color (black or white) and a number. 
	** puzzle[r][c] represents the square in row r, column c.
	* There is at least one row in the puzzle.
	* Precondition: There is at least one row in blackSquares. Postcondition:
	* if and only if blackSquares[r][c] is true.
	*  The crossword puzzle grid has the same dimensions as blackSquares.
	*  The Square object at row r, column c in the crossword puzzle grid is black
	*  Part (a) begins on page 14.
	*/
	public Crossword(boolean[][] blackSquares)
	{ /* to be implemented in part (b) */ 
		puzzle = new Square[blackSquares.length][blackSquares[0].length];
		int num = 1;
		for(int r=0; r<puzzle.length; r++) {
			for(int c=0; c<puzzle[0].length; c++) {
				if( toBeLabeled(r,c,blackSquares) ) {
					puzzle[r][c] = new Square(blackSquares[r][c], num);
					num++;
				} else {
					puzzle[r][c] = new Square(blackSquares[r][c], 0);
				}
			}
		}
	}
	
	/** Returns true if the square at row r, column c should be labeled with a positive number; * false otherwise.
	* The square at row r, column c is black if and only if blackSquares[r][c] is true. * Precondition: r and c are valid indexes in blackSquares.
	*/
	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
	{ /* to be implemented in part (a) */ 
		if( !blackSquares[r][c] ) {
			if(r==0||c==0) return true;
			if(blackSquares[r-1][c]) return true;
			if(blackSquares[r][c-1]) return true;
		}
		return false;
	}
	
	public void print() {
		for (int r = 0; r < puzzle.length; r++){
			for (int c = 0; c < puzzle[0].length; c++){
				String str;
				if (puzzle[r][c].isBlack()) 
					str = "-";
				else 
					str = "" + puzzle[r][c].getNum();
				System.out.print("("+str+")");
			}
			System.out.println();
		}
	}
	public void print2() {
		for (int r = 0; r < puzzle.length; r++){
			for (int c = 0; c < puzzle[0].length; c++){
				System.out.print("("+(puzzle[r][c].isBlack()?"T":"F")+")");
			}
			System.out.println();
		}
	}
	
	// There may be instance variables, constructors, and methods that are not shown.
}
