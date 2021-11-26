package myTest;

import lgpl3.o.O;
import lgpl3.shuffle.Shuffler;

/**
 * Insertion Sort.<br/>
 * Insertion Sort.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T755_InsertionSort" >T755_InsertionSort.java</a>
 *
 * @see T751_SelectionSort
 *
 * @see T753_BubbleSort
 *
 * @see T755_InsertionSort
 */
class T755_InsertionSort {

	static void swap(int[] a, int i, int j) {

		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;

	}

	static void insertionSort(int[] a) {

		int i, j;
		for (i = 1; i < a.length; i++) {

			for (j = i; j > 0; j--) {

				if (a[j] < a[j - 1])
					swap(a, j, j - 1);

			}
		}
	}

	public static void main(String[] sAry) {

		int[] ary = { 5, 6, 1, 2, 4, 3 };
		ary = Shuffler.shuffleByShift(ary);

		O.l("bef insertionSort:");
		O.l(ary);

		insertionSort(ary);

		O.l("aft insertionSort:");
		O.l(ary);

		// Arrays.sort(ary32);
		// Arrays.compare(ary32, );

	}
}