import java.util.*;

public class BubbleSort {

	private int[] arr;

	public BubbleSort(int[] array){
		arr = array;

	}

	public void sort() {

		Boolean swapped = true;
		int temp;

		while(swapped == true) {

			swapped = false;
			for (int i = 1; i < arr.length; i++) {

				// check if two elements are arr
				if (arr[i - 1] > arr[i]) {

					temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					swapped = true;
				}
			}
		}
	}

	public void printArray() {

		int i = 0;
		while( i < arr.length) {
			if (i < arr.length - 1)
				System.out.print(arr[i] + ", ");
			else
				System.out.print(arr[i]);
			i++;
		}
		System.out.println();
		System.out.println();
	}

}