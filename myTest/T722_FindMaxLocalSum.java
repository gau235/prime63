package myTest;

import static java.lang.System.out;

/**
 * To find max sum.<br/>
 * To find max sum.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T722_FindMaxLocalSum">T722_FindMaxLocalSum.java</a>
 *
 */
class T722_FindMaxLocalSum {

	static void findMaxLocalSum(int[] ary, int len) {

		int maxLocalSum = 0;

		int localI = 0;
		int localJ = 0;
		int localSum = 0;
		for (int i = 0; i < len; i++) { // ex: len =4, 1~1 1~2 1~3 1~4 2~2 2~3 2~4 3~3 3~4

			for (int j = i; j < len; j++) {

				localSum += ary[j];

				if (localSum > maxLocalSum) {

					maxLocalSum = localSum;
					localI = i;
					localJ = j;

				}
			}

			localSum = 0;

		}

		out.println("localI=" + localI);
		out.println("localJ=" + localJ);

		out.println("maxLocalSum=" + maxLocalSum);

	}

	public static void main(String[] sAry) {

		int[] ary = { 2, -3, 3, -2, 6, -1, -4, 5 };

		findMaxLocalSum(ary, ary.length);

	}
}