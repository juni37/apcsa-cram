package fin;

import java.util.ArrayList;

public class __51_ProbabilitySimulation {

	public static void main(String[] args) {

		// verify that prob is working properly.
		
		int num = 100000;
		int count = 0;
		double p = 0.3;
		for(int i=0; i<num; i++) {
			if(prob(p)) {
				count++;
			}
		}
		System.out.println("Simulation of "+p+": "+(double)count/num);


	}
	
	// returns true with probability p, 
	// false with 1-p.
	// assume p = [0,1)
	private static boolean prob(double p) {
		double r = Math.random();
		if( r<p ) {
			return true;
		}
		return false;
//		return r<p;
	}
	


}
