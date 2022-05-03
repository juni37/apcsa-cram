package fin;

import java.util.Scanner;

public class __22_Fibonacci {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("n? ");
		int N = in.nextInt();
		
		System.out.println(N+"th fibonacci number: "+fibonacci(N));
		
		for(int i=1; i<=10; i++) {
			System.out.println(fibonacci(i));
		}

	}
	
	public static int fibo(int n) {
		if(n==1 || n==2) {
			return 1;
		} else {
			return fibo(n-1)+fibo(n-2);
		}
	}
	
	public static int fibonacci(int N) {
		int f1 = 1;
		int f2 = 1;
		int fib = 1;
		int n=2;
		if(N==1 || N==2) {
			return fib;
		}
		while( n<N ) {
			fib = f1 + f2;
			n++;
			f1 = f2;
			f2 = fib;
		}
		return fib;
	}

}
