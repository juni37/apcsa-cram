package fin;

import java.util.ArrayList;

public class __52_ProbabilitySimulation2 {

	public static void main(String[] args) {


		// there are three different types of collectible cards.
		// when you buy one, you don't know which type it is.
		// how many cards do you have to buy if you want to collect all three?
		// simulate your probability of collecting all three if you buy ten cards.

		int sim = 100000;
		int count = 0;
		for(int i=0; i<sim; i++) {
			if(complete(10,30)) {
				count++;
			}
		}
		System.out.println("Simulated probability: "+(double)count/sim);


	}
	
	// out of n cards, collection complete (true) or not in m purchases
	private static boolean complete(int n, int m) {
		int[] counts = new int[n];
		for(int i=0; i<m; i++) {
			int r = (int)(Math.random()*n);
			counts[r]++;
		}
		for(int i=0; i<counts.length; i++) {
			if(counts[i]==0) return false;
		}
		return true;
	}
	



}
