package myTest;

import lgpl3.o.O;
import lgpl3.o.ary.Ary32va;
import lgpl3.recycle.Zw_BubbleSort;
import lgpl3.shuffle.Shuffler;

/**
 * Selection Sort.<br/>
 * Selection Sort.
 *
 * @version 2022/12/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T751_SelectionSort" >src</a>
 *
 * @see T751_SelectionSort
 *
 * @see Zw_BubbleSort
 *
 * @see T755_InsertionSort
 */
class T751_SelectionSort {

	static int[] selectionSort(int[] ary) {

		int step, i, iMin;

		for (step = 0; step < (ary.length - 1); step++) {

			iMin = step;

			for (i = step + 1; i < ary.length; i++)

				if (ary[i] < ary[iMin])

					iMin = i; // keep the index

			// if (iMin != step)

			Ary32va.swapV(ary, step, iMin);

		}

		return ary;

	}

	public static void main(String[] sAry) {

		int[] ary = { 10, 20, 30, 40, 50, 60 };

		O.l("bef===");
		O.l(Shuffler.shuffle(ary));

		O.l("aft===");
		O.l(selectionSort(ary));

	}
}