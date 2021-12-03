package myTest;

import lgpl3.o.B;
import lgpl3.o.O;

/**
 * Test.<br/>
 * 高考普考.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R44_Sqst" >R44_Sqst.java</a>
 *
 */
class R44_Sqst {

	static boolean sqst(int[] ary, int n, int sum) {

		O.l("n=" + n + " sum=" + sum);

		if (sum == 0) {

			O.l("return 1");

			return B.I;

		}

		if (n < 0 || sum < 0) {

			O.l("return 0");

			return B.O;

		}

		O.l("ary[" + n + "]=" + ary[n]);

		boolean inclu = sqst(ary, n - 1, sum - ary[n]);
		boolean exclu = sqst(ary, n - 1, sum);

		// return B.I || exclu; // 單獨跑 exclu
		return inclu || exclu;

	}

	public static void main(String[] sAry) {

		int[] ary = { 7, 3, 2, 5, 8 };

		int sum = 14;

		if (sqst(ary, ary.length - 1, sum))

			O.l("Yes");
		else
			O.l("No");

	}
}