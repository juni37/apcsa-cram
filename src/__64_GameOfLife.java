package fin;

public class __64_GameOfLife {

	public static void main(String[] args) {

		int[][] earth = new int[10][10];
		
		// 1. fill earth with values 0 or 1 (0: dead, 1:alive) 
		// complete method initialize()
		initialize(earth, 0.1);
		show(earth);
		
		// 2. write method next() that advances time
		// 3. write method isFull() that checks if earth is full(1)
		// 4. write method isEmpty() that checks if earth is empty(0)
		
		// 5. use next(), isFull(), and isEmpty() to simulate flow of time:
		// there can be 3 outcomes.
		// - all earth is devoid of life
		// - earth is filled with life
		// - a million years pass without earth becoming full or empty
		// show how many years have elapsed and the state of earth afterwards
		int ymax = 1_000_000;
		int year = 0;
		for(int i=0; i<ymax; i++) {
			year++;
			next(earth);
			if( isFull(earth) ) {
				System.out.println("Earth full!");
				break;
			}
			if( isEmpty(earth) ) {
				System.out.println("Earth empty!");
				break;
			}
		}
		System.out.println(year+" years have elapsed.");
		show(earth);
		
//		try this with values of p : 0.5, 0.3, 0.1

	}
	
	// key method : 
	// earth's population is reset according to the following principles:
	// if there are at least two life forms in North, South, East, West to any square, 
	// 		that square will be populated with a life form in the next year(become 1)
	// if not, the square will die out. (become 0)
	private static void next(int[][] earth) {
		int[][] old = new int[earth.length][earth[0].length];
		for(int r=0; r<earth.length; r++) {
			for(int c=0; c<earth[0].length; c++) {
				old[r][c] = earth[r][c];
			}
		} // if not copied, then it will be weird
		for(int r=0; r<earth.length; r++) {
			for(int c=0; c<earth[0].length; c++) {
				int count=0;
				if(r-1>=0) count+=old[r-1][c];
				if(r+1<earth.length) count+=old[r+1][c];
				if(c-1>=0) count+=old[r][c-1];
				if(c+1<earth[0].length) count+=old[r][c+1];
				if(count>=2) {
					earth[r][c]=1;
				}else {
					earth[r][c]=0;
				}
			}
		} 
	}

	// returns true if every number in earth[][] is 1
	private static boolean isFull(int[][] earth) {
		for(int r=0; r<earth.length; r++) {
			for(int c=0; c<earth[0].length; c++) {
				if(earth[r][c]==0) return false;
			}
		}
		return true;
	}
	
	// returns true if every number in earth[][] is 0
	private static boolean isEmpty(int[][] earth) {
		for(int r=0; r<earth.length; r++) {
			for(int c=0; c<earth[0].length; c++) {
				if(earth[r][c]==1) return false;
			}
		}
		return true;
	}

	// earth has a fixed probability p of having life
	private static void initialize(int[][] earth, double p) {
		for(int r=0; r<earth.length; r++) {
			for(int c=0; c<earth[0].length; c++) {
				if(Math.random()<p) {
					earth[r][c]=1;
				} else {
					earth[r][c]=0;
				}
			}
		}
	}

	public static void show(int[][] arr) {
		for ( int r=0; r<arr.length; r++ ) {
			System.out.print("|");
			for ( int c=0; c<arr[0].length-1; c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.print(arr[r][arr[0].length-1]);
			System.out.println("|");
		}
		System.out.println();
	}

}
