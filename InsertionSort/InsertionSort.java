package InsertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		InsertionSort sort = new InsertionSort();

		System.out.println("--- InsertionSort with For ---");
		int[] arrayBubbleFor = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.insertionSortFor(arrayBubbleFor);

		System.out.println("-- InsertionSort with While --");
		int[] arrayBubbleWhile = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.insertionSortWhile(arrayBubbleWhile);

		System.out.println("- InsertionSort with DoWhile -");
		int[] arrayBubbleDoWhile = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.insertionSortDoWhile(arrayBubbleDoWhile);
		System.out.println("------------------------------");
	}

	// InsertionSort with For
	public void insertionSortFor(int array[]) {

		System.out.println(Arrays.toString(array));
		int aux;

		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
				}
				System.out.println(Arrays.toString(array));
			}
		}
	}

	// InsertionSort with While
	public void insertionSortWhile(int array[]) {

		System.out.println(Arrays.toString(array));
		int aux;
		int i = 1;

		while (i < array.length) {
			int j = i;
			while (j > 0) {
				if (array[j] < array[j - 1]) {
					aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
				}
				j--;
				System.out.println(Arrays.toString(array));
			}
			i++;
		}
	}

	// InsertionSort with DoWhile
	public void insertionSortDoWhile(int array[]) {

		System.out.println(Arrays.toString(array));

		int i = 1;

		do {
			int j = i;
			int aux = array[i];

			do {
				if (array[j] < array[j - 1]) {
					aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
				}
				j--;
				System.out.println(Arrays.toString(array));
			} while (j > 0 && array[j - 1] > aux);
			i++;
		} while (i < array.length);
	}
}