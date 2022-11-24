package myTest;

import static java.lang.System.out;

/**
 * To print 2D array.<br/>
 * To print 2D array.
 *
 * @version 2021/05/15_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T150_PrintAryOfAry32" >T150_PrintAryOfAry32.java</a>
 *
 */
class T150_PrintAryOfAry32 {

	public static void main(String[] sAry) {

		// int[][] aryOfAry32 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] aryOfAry32 = { { 1, 3, 5 }, { 2, 4, 6 } };

		for (int x = 0; x != aryOfAry32.length; x++) {

			int[] ary = aryOfAry32[x];

			for (int y = 0; y != ary.length; y++)
				out.print(aryOfAry32[x][y]);

			out.println();

		}

		out.println("=======================");

		for (int y = 0; y != aryOfAry32[0].length; y++) {

			for (int x = 0; x != aryOfAry32.length; x++)
				out.print(aryOfAry32[x][y]);

			out.println();

		}

		out.println("=======================");

		for (int y = aryOfAry32[0].length - 1; y >= 0; y--) {

			for (int x = 0; x != aryOfAry32.length; x++)
				out.print(aryOfAry32[x][y]);

			out.println();

		}

		out.println("=======================");

		for (int y = 0; y != aryOfAry32[0].length; y++) {

			for (int x = aryOfAry32.length - 1; x >= 0; x--)
				out.print(aryOfAry32[x][y]);

			out.println();

		}
	}
}