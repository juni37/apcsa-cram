package fin;

public class __37_MaxThree {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 9 + 1) ;
		int b = (int) (Math.random() * 9 + 1) ;
		int c = (int) (Math.random() * 9 + 1) ;
		
		int max = -99;
		
		// set max so that it is the largest number of a, b, c
		if (a >= b && a >= c)
			max=a;
		else if (b >= a && b >= c)
			max=b;
		else
			max=c;

		System.out.println("Max of "+a+", "+b+", "+c+" is : "+max);

	}
	

}
