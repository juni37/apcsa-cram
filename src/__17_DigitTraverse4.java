package fin;

import java.util.ArrayList;

public class __17_DigitTraverse4 {

	public static void main(String[] args) {

		int x = (int) (Math.random()*99999+11111);
		System.out.println("x = "+x);
		
		// prints all digits
		// complete ithDigit() 
		for(int i=0; i<numDigits(x); i++) {
			System.out.println( ithDigit(x,i) );
		}

		
	}
	
	public static int ithDigit(int n, int i) {
		int digs = numDigits(n);
		int digit = 0;
		while(i<digs) {
			digit = n % 10;
			n /= 10;
			i++;
		}
		return digit;
	}
	
	// from __03_
	public static int numDigits(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	
}
