package fin;

public class __19_BaseChange {

	public static void main(String[] args) {

		int n = 20;
		// complete binary() 
		for(int i=0; i<=n; i++) {
			System.out.println(i+" in binary: "+binary(i));
		}

	}

	// returns a string representation of binary version of decimal n.
	public static String binary(int n) {
		if(n==0) return "0";
		String bin = "";
		int base = 2;
		while(n>0) {
			int digit = n % base;
			bin = digit + bin;
			n /= base;
		}
		return bin;
	}
	
}
