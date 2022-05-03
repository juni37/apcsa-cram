package fin;

import java.util.Arrays;

public class __56_SelectionSort {

	public static void main(String[] args) {

		// create an array of 10 integers in range[1,99]
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 99 + 1);
		}
		System.out.println("Unsorted: \t" + Arrays.toString(arr));

		// write and use selectionSort() to sort arr
		selectionSort(arr);
		System.out.println("Sorted(ascending): \t" + Arrays.toString(arr));

	}

	/**
	 * sorts arr in ascending order
	 * @param arr
	 */
	public static void selectionSort(int[] arr) {
		int step = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
				// begin verbose inform
				System.out.print(step + ": " + Arrays.toString(arr));
				System.out.println("i=" + i + " j=" + j + " minIndex=" + minIndex);
				step++;
				// end verbose inform
			}
			// minIndex is the target
			// swap arr[i] with arr[minIndex]
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}



}
