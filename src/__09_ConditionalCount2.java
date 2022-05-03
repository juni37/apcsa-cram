package fin;

public class __09_ConditionalCount2 {

	public static void main(String[] args) {

		int[] arr = {0,0,0,0,0,1,2,3,0,0,4,5,6,0,7,8,0,0}; 
		
		// how many zeroes are there in arr before the first nonzero number?
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if( arr[i]==0) {
				count++;
			} else {
				break;
			}
		}
		System.out.println("the answer is: "+count);
		
		
		int count3 = 0;
		while(count3<arr.length && arr[count3]==0) {
			count3++;
		}
		System.out.println("the answer is: "+count3);
		

	}

}
