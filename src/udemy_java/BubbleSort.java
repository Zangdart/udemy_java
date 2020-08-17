package udemy_java;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 20, 35, -15, 7, 55, 1, -22 };

		// loop from r->l and l->r and swap
		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {

				// check next to each other value
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}

		}
		// print the sorted array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	} // main

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
