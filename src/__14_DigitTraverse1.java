package fin;

import java.util.Scanner;

public class __14_DigitTraverse1 {

	public static void main(String[] args) {
		
		int x = (int) (Math.random()*99999);
		System.out.println("x = "+x);
		
		// what is the first digit of x?
		while(x>=10) {
			x/=10;
		}
		System.out.println("first digit = "+x);
		
	}

}
