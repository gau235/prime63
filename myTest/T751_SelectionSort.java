package myTest;

import lgpl3.o.O;

/**
 * Selection Sort.<br/>
 * Selection Sort.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T751_SelectionSort" >T751_SelectionSort.java</a>
 *
 * @see T751_SelectionSort
 *
 * @see T753_BubbleSort
 *
 * @see T755_InsertionSort
 */
class T751_SelectionSort {

	static void swap(int[] a, int i, int j) {

		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;

	}

	static void selectionSort(int[] a) {

		int step, i;
		int iMin;
		for (step = 0; step < (a.length - 1); step++) {

			iMin = step;

			for (i = step + 1; i < a.length; i++) {

				if (a[i] < a[iMin])
					iMin = i; // keep the index

			}

			// if (iMin != step) {

			swap(a, step, iMin);

			// }

		}
	}

	public static void main(String[] sAry) {

		int[] ary = { 5, 6, 1, 2, 4, 3 };

		O.l("befSort=");
		O.l(ary);

		selectionSort(ary);

		O.l("aftSort=");
		O.l(ary);

	}
}