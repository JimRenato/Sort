package selectSort;

/** 
 * SelectionSort 
 * 
 * Version 1.1
 *  
 * Created 2016/04/10 and Updated 2016/04/26 
 * 
 * @author Renato Souto Maior 
 * 
 * Implementation of SelectionSort with For, While and DoWhlie.
 * 
 */ 

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		SelectionSort sort = new SelectionSort();

		System.out.println("--- SelectionSort with For ---");
		int[] arraySelectionFor = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.selectionSortFor(arraySelectionFor);

		System.out.println("-- SelectionSort with While --");
		int[] arraySelectionWhile = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.selectionSortWhile(arraySelectionWhile);

		System.out.println("- SelectionSort with DoWhile -");
		int[] arraySelectionDoWhile = { 6, 7, 2, 4, 9, 1, 0, 5, 3, 8 };
		sort.selectionSortDoWhile(arraySelectionDoWhile);
		System.out.println("------------------------------");
	}

	// SelectionSort with For
	public void selectionSortFor(int array[]) {

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

	// SelectionSort with While
	public void selectionSortWhile(int array[]) {

		System.out.println(Arrays.toString(array));
		int fewer, aux;
		int i = 0;

		while (i < array.length - 1) {
			fewer = i;
			int j = i + 1;

			while (j < array.length) {
				if (array[j] < array[fewer]) {
					fewer = j;
				}
				j++;
			}
			aux = array[fewer];
			array[fewer] = array[i];
			array[i] = aux;
			System.out.println(Arrays.toString(array));
			i++;
		}
	}

	// SelectionSort with DoWhile
	public void selectionSortDoWhile(int array[]) {

		System.out.println(Arrays.toString(array));
		int fewer, aux;
		int i = 0;

		do {
			fewer = i;
			int j = i + 1;
			do {
				if (array[j] < array[fewer]) {
					fewer = j;
				}
				j++;
			} while (j < array.length);
			aux = array[fewer];
			array[fewer] = array[i];
			array[i] = aux;
			i++;
			System.out.println(Arrays.toString(array));
		} while (i < array.length - 1);
	}
}