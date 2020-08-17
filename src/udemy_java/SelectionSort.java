package udemy_java;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = { 20, 35, -15, 7, 55, 1, -22 };

		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			int largest = 0;
			
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if(array[i] > array[largest]) {
					largest = i;
				}
			}
			swap(array, largest,lastUnsortedIndex);
		}
		
		// print the sorted array
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}

	}// main

	public static void swap(int[] array, int i, int j) {

		if (i == j) {
			return;
		}

		// swap values from i to j and j to i
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
