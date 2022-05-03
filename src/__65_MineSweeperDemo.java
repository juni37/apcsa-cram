package fin;

import java.util.Scanner;

public class __65_MineSweeperDemo {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		// init variables
        int[][] mines = new int[10][10];		// mined: -1, unmined: # of mines around it
        char[][] field = new char[10][10];		// init '-', 
        int num_mines;
        int round = 0;
        boolean isDone = false;
        int row, col;							// for the main play loop
		
        // populate mines
        num_mines = initMines(mines);
        System.out.println(num_mines+" mines in field.");
        
        // complete mines with proximity alert
        populateMines(mines);
        
        // initialize field (what the player sees)
        initField(field);
        
        // the main play loop
        do {
        	round++;
        	System.out.println("Round: "+round);
        	// show field
        	showField(field);
        	// take input
        	do {
                System.out.print("Enter Row: "); 
                row = console.nextInt();
                System.out.print("Enter Column: "); 
                col = console.nextInt();
        	}while(!(row>=0 && row<field.length && col>=0 && col<field[0].length && field[row][col]=='_'));

        	// make move
        		// if has mine, then isDone
        		// if no mine, then reveal
        	if(mines[row][col]==-1) {	// stepped on a mine
        		isDone=true;		
        	} else {
        		// change field to include new hints
        		updateField(mines,field,row,col);
        		// if everything is done then set isDone to true
        		if(haveWon(field, num_mines)) {
        			isDone=true;
        		}
        	}
        } while(!isDone);
        
        // the consequences..
        if(haveWon(field, num_mines)){
            System.out.println("Congratulations, you have found "+num_mines+" mines in "+round+" rounds");
            showMines(mines,field);
        } else {
            System.out.println("You stepped on a mine! Kaboom!");
            showMines(mines,field);
        }
        
        // display mines ( temporary )
        for (int r = 0; r<mines.length; r++) {
        	for(int c=0; c<mines[0].length; c++) {
        		System.out.print( (mines[r][c]==-1 ? "*" : mines[r][c]) +"  ");
        	}
        	System.out.println();
        }
        for (int r = 0; r<field.length; r++) {
        	for(int c=0; c<field[0].length; c++) {
        		System.out.print(field[r][c]+"  ");
        	}
        	System.out.println();
        }
        
		console.close();	
	}
	
	// initialize minefield with a probability of 0.1
	public static int initMines(int[][] mines) {
        int count=0;
		for (int r = 0; r<mines.length; r++) {
        	for(int c=0; c<mines[0].length; c++) {
        		if(Math.random()<0.1) {
        			mines[r][c]=-1;
        			count++;
        		} 
        		/*
        		else {				// unnecessary, since mines are already init to 0
        			mines[r][c]=0;
        		}
        		*/
        	}
        }
        return count;
	}
	
	// alternate initialization with fixed number of mines
	public static int initMines2(int[][] mines) {
		int NUM_MINES=10;		// change this for different number of mines
		boolean mined;
        int row, col;
        
        for(int i=0 ; i<NUM_MINES ; i++){		   	
        	do {
            	row = (int) ( mines.length * Math.random() );
            	col = (int) ( mines[0].length * Math.random() );
            	if ( mines[row] [col] == -1 ) {
            		mined=true;
            	} else {
            		mined=false;
            	}
        	}while(mined);
        	
        	mines[row][col]=-1;
        }
        return NUM_MINES;
	}

	// populate mines with hints
	public static void populateMines(int[][] mines) {
		
        for (int r=0; r<mines.length; r++) {
        	for(int c=0; c<mines[0].length; c++) {
        		// the following count is done for each cell
        		if ( mines[r][c]!=-1) {
            		for(int i=r-1;i<=r+1;i++) {
            			for(int j=c-1;j<=c+1;j++) {
            				if(i>=0 && i<mines.length && j>=0 && j<mines[0].length) {	// check if mines[i][j] is valid
            					if (mines[i][j]==-1) {
            						mines[r][c]++;
            					}
            				}
            			}
            		}
        		} 
        	}
        }
        
	}
	
	// initialize field
	public static void initField(char[][] field) {
        for (int r = 0; r<field.length; r++) {
        	for(int c=0; c<field[0].length; c++) {
        		field[r][c]='_';
        	}
        }
	}
	
	// show field
	public static void showField(char[][] field) {
		System.out.println("Row");
        for (int r = 0; r<field.length; r++) {
        	System.out.print(" "+r+"  ");
        	for(int c=0; c<field[0].length; c++) {
        		System.out.print(field[r][c]+"  ");
        	}
        	System.out.println();
        }
        System.out.println("Col "+"0  1  2  3  4  5  6  7  8  9");
	}
	
	// tests if game is won
	public static boolean haveWon(char[][] field, int num_mines) {
        int count=0;
        for(int r = 0 ; r < field.length ; r++)
            for(int c = 0 ; c < field[0].length ; c++)
                if(field[r][c]=='_')
                    count++;
        if(count == num_mines)
            return true;
        else
            return false;   
	}
	
	// shows field including mines
	public static void showMines(int[][] mines, char[][] field) {
        for (int r=0; r<field.length; r++) {
        	for(int c=0; c<field[0].length; c++) {
        		if(mines[r][c]==-1) {
        			field[r][c]='*';
        		}
        	}
        }
        showField(field);
	}
	
	// update field hint info
	public static void updateField(int[][] mines, char[][] field, int row, int col) {
		for(int i=row-1;i<=row+1;i++) {
			for(int j=col-1;j<=col+1;j++) {
				if(i>=0 && i<mines.length && j>=0 && j<mines[0].length && mines[i][j]!=-1) {
					field[i][j]=Character.forDigit(mines[i][j],10);
				}
			}
		}
	}

}
