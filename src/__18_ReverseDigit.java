package fin;

public class __18_ReverseDigit {

	public static void main(String[] args) {

		int x = (int) (Math.random()*99999+11111);
		System.out.println("x = "+x);
		
		// reverse the integer x; i.e. 12345 => 54321
		// 543
		int r = 0;

		int N = x;
		while(N>0) {
			r = r*10 + N%10;
			N=N/10;
		}
		
		System.out.println(r);

		
		
	}

}
