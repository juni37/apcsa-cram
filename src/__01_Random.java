package fin;

public class __01_Random {

	public static void main(String[] args) {

		// variables
		double rand;
		int r, a, b, n;
		
		// understand Math.random()
		rand = Math.random();
		System.out.println(rand);
		
		// range of random integers: [0, n)
		// useful for producing a random index
		n = 10;
		r = (int) (Math.random() * n);
		System.out.println(r);
		
		// range of random integers: [a, b]
		a = 3;
		b = 5;
		int range = b - a + 1;
		r = (int) (Math.random() * range  ) + a ;
		System.out.println(r);
		
		// range of random numbers: [a, b)
		rand = (Math.random() * (b-a) + a );
		System.out.println(rand);
		
	}

}
