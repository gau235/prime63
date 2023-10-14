package myTest;

import java.util.Arrays;

import lgpl3.o.O;
import lgpl3.recycle.Zw_BubbleSort;
import lgpl3.shuffle.Shuffler;

/**
 * Insertion Sort.<br/>
 * Insertion Sort.
 *
 * @version 2022/12/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T755_InsertionSort" >src</a>
 *
 * @see T751_SelectionSort
 *
 * @see Zw_BubbleSort
 *
 * @see T755_InsertionSort
 */
class T755_InsertionSort {

	public static int[] insertionSort(int[] ary) {

		for (int i = 1; i < ary.length; i++) {

			int v = ary[i];

			int j = i - 1;

			for (; j >= 0 && v < ary[j]; j--)

				ary[j + 1] = ary[j];

			ary[j + 1] = v;

		}

		return ary;

	}

	public static void main(String[] sAry) {

		int[] ary = { 10, 20, 30, 40, 50, 60 };
		int[] clonedAry = ary.clone();

		O.l("bef===");
		O.l(Shuffler.shuffle(ary));

		O.l("aft===");
		O.l(insertionSort(ary));

		if (!Arrays.equals(ary, clonedAry))

			O.x(O.L + Arrays.toString(ary) + "=>ary" + O.L + Arrays.toString(clonedAry) + "=>clonedAry");

	}
}