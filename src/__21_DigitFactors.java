package fin;

public class __21_DigitFactors {

	public static void main(String[] args) {

		int x = (int) (Math.random()*99999+11111);
		System.out.println("x = "+x);

		// of all digits of x, list the factors of x (watch out for 0)
		int xbackup = x;
		while(x>0) {
			int digit = x%10;
			if(digit!=0 && xbackup%digit==0) {
				System.out.println(digit);
			}
			x = x/10;
		}

		
		
	}

}
