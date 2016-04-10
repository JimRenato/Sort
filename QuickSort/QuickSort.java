package QuickSort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		QuickSort sort = new QuickSort();

		System.out.println("----- QuickSort with For -----");
		int[] arrayQuickFor = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.quickSortFor(arrayQuickFor, 0, arrayQuickFor.length - 1);

		System.out.println("---- QuickSort with While ----");
		int[] arrayQuickWhile = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.quickSortWhile(arrayQuickWhile, 0, arrayQuickWhile.length - 1);

		System.out.println("--- QuickSort with DoWhile ---");
		int[] arrayQuickDoWhile = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.quickSortDoWhile(arrayQuickDoWhile, 0, arrayQuickDoWhile.length - 1);
		System.out.println("------------------------------");
	}

	// QuickSort with For
	private void quickSortFor(int[] array, int begin, int end) {

		if (begin < end) {
			int positionPivot = separarFor(array, begin, end);
			quickSortFor(array, begin, positionPivot - 1);
			quickSortFor(array, positionPivot + 1, end);
		}
	}

	private int separarFor(int[] array, int begin, int end) {

		System.out.println(Arrays.toString(array));

		int pivot = array[begin];
		int e = end;

		for (int b = begin + 1; b <= e;) {
			if (array[b] <= pivot) {
				b++;
			} else if (pivot < array[e])
				e--;
			else {
				int swap = array[b];
				array[b] = array[e];
				array[e] = swap;
				System.out.println(Arrays.toString(array));
				b++;
				e--;
			}
		}
		array[begin] = array[e];
		array[e] = pivot;
		System.out.println(Arrays.toString(array));
		return e;
	}

	// QuickSort with While
	private void quickSortWhile(int[] array, int begin, int end) {

		if (begin < end) {
			int positionPivot = separarWhile(array, begin, end);
			quickSortWhile(array, begin, positionPivot - 1);
			quickSortWhile(array, positionPivot + 1, end);
		}
	}

	private int separarWhile(int[] array, int begin, int end) {

		System.out.println(Arrays.toString(array));

		int pivot = array[begin];
		int b = begin + 1;
		int e = end;

		while (b <= e) {
			if (array[b] <= pivot)
				b++;
			else if (pivot < array[e])
				e--;
			else {
				int swap = array[b];
				array[b] = array[e];
				array[e] = swap;
				System.out.println(Arrays.toString(array));
				b++;
				e--;
			}
		}
		array[begin] = array[e];
		array[e] = pivot;
		System.out.println(Arrays.toString(array));
		return e;
	}

	// QuickSort with DoWhile

	private void quickSortDoWhile(int[] array, int begin, int end) {

		if (begin < end) {
			int positionPivot = separarDoWhile(array, begin, end);
			quickSortWhile(array, begin, positionPivot - 1);
			quickSortWhile(array, positionPivot + 1, end);
		}
	}

	private int separarDoWhile(int[] array, int begin, int end) {

		System.out.println(Arrays.toString(array));

		int pivot = array[begin];
		int b = begin + 1;
		int e = end;

		do {
			if (array[b] <= pivot)
				b++;
			else if (pivot < array[e])
				e--;
			else {
				int swap = array[b];
				array[b] = array[e];
				array[e] = swap;
				System.out.println(Arrays.toString(array));
				b++;
				e--;
			}
		} while (b <= e);

		array[begin] = array[e];
		array[e] = pivot;
		System.out.println(Arrays.toString(array));

		return e;
	}
}
