package Sort;

import java.util.Arrays;

/**
 * Sort
 * 
 * Version: 1.0
 * 
 * April 4, 2016
 * 
 * @author Renato Souto Maior 
 * 
 * Implementation and operation of BubbleSort, SelectionSort, InsertionSort e QuickSort.
 * 
 */

public class Sort {

	public static void main(String[] args) {

		Sort sort = new Sort();

		System.out.println("-------- Bubble Sort ---------");
		int[] arrayBubble = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.bubbleSort(arrayBubble);

		System.out.println("------ Selection Sort --------");
		int[] arraySelection = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.selectionSort(arraySelection);

		System.out.println("------ Insertion Sort --------");
		int[] arrayInsertion = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.insertionSort(arrayInsertion);

		System.out.println("-------- Quick Sort ----------");
		int[] arrayQuick = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.quickSort(arrayQuick, 0, arrayQuick.length - 1);

		System.out.println("------------------------------");
	}

	public void bubbleSort(int[] array) {

		System.out.println(Arrays.toString(array));
		int aux;

		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}

	public void selectionSort(int array[]) {

		System.out.println(Arrays.toString(array));
		int fewer, aux;

		for (int i = 0; i < array.length - 1; i++) {
			fewer = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[fewer]) {
					fewer = j;
				}
			}
			aux = array[fewer];
			array[fewer] = array[i];
			array[i] = aux;
			System.out.println(Arrays.toString(array));
		}
	}

	public void insertionSort(int array[]) {

		System.out.println(Arrays.toString(array));
		int aux;

		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
				} else {
					break;
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}

	private void quickSort(int[] array, int begin, int end) {

		if (begin < end) {
			int positionPivot = separar(array, begin, end);
			quickSort(array, begin, positionPivot - 1);
			quickSort(array, positionPivot + 1, end);
		}
	}

	private int separar(int[] array, int begin, int end) {

		System.out.println(Arrays.toString(array));

		int pivot = array[begin];
		int b = begin + 1, e = end;

		while (b <= e) {
			if (array[b] <= pivot)
				b++;
			else if (pivot < array[e])
				e--;
			else {
				int swap = array[b];
				array[b] = array[e];
				array[e] = swap;
				b++;
				e--;
			}
		}
		array[begin] = array[e];
		array[e] = pivot;
		return e;
	}
}
