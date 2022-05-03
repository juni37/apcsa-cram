package fin;

public class __10_Wraparound {

	public static void main(String[] args) {

		String[] arr = { "MON","TUE","WED","THU","FRI","SAT","SUN" }; 
		int num, now;
		
		// if today is a wednesday, and today is the 1st day of the month.
		// what day of week is it on the 4th day of the same month?
		now = 2;
		num = 4 - 1;
		System.out.println( arr[now+num] );
		
		
		// if today is a wednesday, and today is the 1st day of the month.
		// what day of week is it after 50 days have elapsed?
		now = 2;
		num = 50 - 1;
		System.out.println( arr[ (now+num) % arr.length ] );

		

	}

}
