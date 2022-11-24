package myTest;

import static java.lang.System.out;

import java.util.Arrays;

/**
 * Generic array.<br/>
 * To swap.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T120_SwapPosInAry" >T120_SwapPosInAry.java</a>
 *
 */
class T120_SwapPosInAry { // Generic

	static <T> T[] swap(T[] ary, int i, int j) {

		T tmp = ary[i];
		ary[i] = ary[j];
		ary[j] = tmp;

		return ary;

	}

	public static void main(String[] sAry) {

		Number[] ary = { 10, 20, 30, 40, 50, 60, 70 };

		out.println("bef=" + Arrays.toString(ary));
		swap(ary, 2, 6);
		out.println("aft=" + Arrays.toString(ary));

	}
}