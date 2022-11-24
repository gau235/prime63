package myTest;

import static java.lang.System.out;

import lgpl3.o.O;

/**
 * To find max.<br/>
 * To find max.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=R01_FindMax" >R01_FindMax.java</a>
 *
 */
class R01_FindMax {

	static int findMax(int[] ary) {

		int max = ary[0];
		int curV;
		for (int i = 0; i != ary.length; i++) {

			curV = ary[i];
			if (curV > max)
				max = curV;

		}

		return max;

	}

	static int findMaxRecur(int[] ary, int idx) {

		if (idx == ary.length - 1)
			return ary[ary.length - 1];

		int curV = ary[idx];
		int newMax = findMaxRecur(ary, idx + 1);

		if (newMax > curV)
			return newMax;

		else
			return curV;

	}

	public static void main(String[] sAry) {

		int[] ary = { 4, 5, -1, 3, 2 };

		int max = findMaxRecur(ary, 0);

		O.eq(max, findMax(ary));

		out.printf("findMax=%d", max);

	}
}