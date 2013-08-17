import java.util.Random;
import java.util.*;

public class main {

	public static final int OBJECTLIST_SIZE = 20;

	private static int[] unsortedArray;
	private static ObjectList unsortedList;


	public static void main (String[] args)
	{
		
		
		/** BubbleSort Algorithm **/

		System.out.println("BubbleSort Algorithm");
		System.out.println("--------------------\n");

		generateArray();
		BubbleSort bSort = new BubbleSort(unsortedArray);

		System.out.println("Before BubbleSort:");
		bSort.printArray();

		long startTime = System.nanoTime();
		bSort.sort();
		long endTime   = System.nanoTime();

		System.out.println("After BubbleSort:");
		bSort.printArray();

		long totalTime = (endTime - startTime) / 1000;
		System.out.println("\nBubbleSort runtime = " + totalTime + " microseconds\n");


		/*************************/	

		/** HeapSort Algorithm **/
		System.out.println("HeapSort Algorithm");
		System.out.println("--------------------\n");


		generateArray();
		HeapSort hsSort = new HeapSort(unsortedArray);

		System.out.println("Before HeapSort:");
		hsSort.printArray();

		startTime = System.nanoTime();
		hsSort.sort();
		endTime   = System.nanoTime();

		System.out.println("After HeapSort:");
		hsSort.printArray();

		totalTime = (endTime - startTime) / 1000;
		System.out.println("\n HeapSort runtime = " + totalTime + " microseconds\n");

		/*************************/		

		/** MergeSort Algorithm **/

		System.out.println("MergeSort Algorithm");
		System.out.println("--------------------\n");

		generateList();
		MergeSort msSort = new MergeSort(unsortedList);

		System.out.println("Before MergeSort: ");
		msSort.printList();

		startTime = System.nanoTime();
		msSort.sort();
		endTime   = System.nanoTime();

		System.out.println("After MergeSort:");
		msSort.printList();

		totalTime = (endTime - startTime) / 1000;
		System.out.println("\n HeapSort runtime = " + totalTime + " microseconds\n");


		/******************************/
	}

	static void generateArray() {

		unsortedArray = new int[OBJECTLIST_SIZE];
		int i = 0;
		Random r = new Random();
		while(i < OBJECTLIST_SIZE) {
			unsortedArray[i] = r.nextInt(100);
			i++;
		}
	}

	static void generateList() {

		unsortedList = new ObjectList();

		Random r = new Random();
		for (int i = 0; i < OBJECTLIST_SIZE; i++) {
			unsortedList.add(r.nextInt(50));
		}
	}

}