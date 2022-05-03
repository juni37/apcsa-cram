package fin;

public class __65_Minefield {

	public static void main(String[] args) {

		// init variables
        int[][] mines = new int[10][10];		// -1 is a mine.
		
        // populate mines
        int num_mines = initMines(mines);
        System.out.println(num_mines+" mines in field.");
        showMines(mines);
        
        
        // complete mines with proximity alert
        putHints(mines);
        showMines(mines);

	}
	
	public static void showMines(int[][] mines) {
		System.out.println();
        for (int r = 0; r<mines.length; r++) {
        	for(int c=0; c<mines[0].length; c++) {
        		System.out.print( (mines[r][c]==-1 ? "*" : mines[r][c]) +"  ");
        	}
        	System.out.println();
        }
        System.out.println();
	}
	
	// initialize minefield with a probability of 0.1
	// cell with a mine has value -1
	// returns number of mines placed
	public static int initMines(int[][] mines) {
        int count=0;
		for (int r = 0; r<mines.length; r++) {
        	for(int c=0; c<mines[0].length; c++) {
        		if(Math.random()<0.1) {
        			mines[r][c]=-1;
        			count++;
        		} 
        	}
        }
        return count;
	}
	
	// alternate initialization with fixed number of mines
	// cell with a mine has value -1
	public static void initMines2(int[][] mines, int NUM_MINES) {
	
	}

	// populate mines with hints
	// each cell that is not a mine in mines[][] is replaced with 
	// a number equal to number of mines in the 8 adjacent cells
	public static void putHints(int[][] mines) {
        for (int r=0; r<mines.length; r++) {
        	for(int c=0; c<mines[0].length; c++) {
        		// the following count is done for each cell
        		if ( mines[r][c]!=-1) {
            		mines[r][c] = mineCount(mines, r, c);
        		} 
        	}
        }
        
	}
	
	// returns number of mines in the cells around mines[r][c]
	// N NE E SE S SW W NW
	public static int mineCount(int[][] mines, int r, int c) {
		int count = 0;
		for(int i=r-1;i<=r+1;i++) {
			for(int j=c-1;j<=c+1;j++) {
				if(i>=0 && i<mines.length && j>=0 && j<mines[0].length && mines[i][j]==-1) {	// check if mines[i][j] is valid
					count++;
				}
			}
		}
		return count;
	}
	


}
