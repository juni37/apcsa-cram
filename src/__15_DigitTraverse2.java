package fin;

public class __15_DigitTraverse2 {

	public static void main(String[] args) {

		int x = (int) (Math.random()*99999);
		int r = (int) (Math.random()*5);
		x /= Math.pow(10, r);
		System.out.println("x = "+x);
		
		// how many digits does x have?
		System.out.println("number of digits of x : " + numDigits(x));
		
	}
	
	public static int numDigits(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

}
