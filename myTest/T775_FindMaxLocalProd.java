package myTest;

import static java.lang.System.out;

/**
 * To find max product.<br/>
 * To find max product.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=T775_FindMaxLocalProd" >
 *          T775_FindMaxLocalProd.java</a>
 *
 */
class T775_FindMaxLocalProd {

	static void findMaxLocalProd(int[] ary, int len) {

		int maxLocalProd = 0;

		int localI = 0;
		int localJ = 0;

		int valueI;
		int localProd = 0;
		for (int i = 0; i < (len - 1); i++) {

			valueI = ary[i];

			for (int j = i + 1; j < len; j++) {

				localProd = valueI * ary[j];

				if (localProd > maxLocalProd) {

					maxLocalProd = localProd;

					localI = i;
					localJ = j;

				}
			}
		}

		out.println("i=" + localI + " j=" + localJ);

		out.println("maxLocalProd=" + maxLocalProd);

	}

	public static void main(String[] sAry) {

		int[] ary = { 2, -3, 3, -2, -9, -1, -4, 8 };

		findMaxLocalProd(ary, ary.length);

	}
}