package fin;

public class __20_GenerateFactors {
	
	public static void main(String[] args) {
		
		int x = (int) (Math.random()*99999+11111);
		System.out.println("x = "+x);

		int factor = 2;
		while(x>1) {
			factor = 2;
			while(x%factor!=0) {
				factor++;
			}
			x = x/factor;
			System.out.print(factor);
			if(isPrime(factor)) {
				System.out.print("(prime)");
			}
			System.out.println();
		}


	}
	
	// __11_
	public static boolean isPrime(int n) {
		for(int i=2; i<=n/2; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

}
