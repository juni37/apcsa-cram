package fin;

public class __02_RandomSelection1 {

	public static void main(String[] args) {

		int[] arr = { 11, 22, 33, 44, 55 }; 
		
		int num = 10;
		// print num numbers randomly selected from arr(allow repetition)
		for(int i=0; i<num; i++) {
			int r = (int) (Math.random()*arr.length); 
			System.out.println( arr[r] );
		}

		
	}

}
