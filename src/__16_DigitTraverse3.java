package fin;

public class __16_DigitTraverse3 {

	public static void main(String[] args) {

		int x = (int) (Math.random()*99999+11111);
		System.out.println("x = "+x);
		
		// print all digits of x, from units digit to higher.
		while(x>0) {
			int digit = x % 10;
			System.out.print(digit + " ");
			x /= 10;
		}
		
	}

}
