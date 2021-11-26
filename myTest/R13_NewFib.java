package myTest;

import lgpl3.o.O;

/**
 * Fibonacci number.<br/>
 * Fibonacci number.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R13_NewFib" >R13_NewFib.java</a>
 *
 */
class R13_NewFib {

	static int newFRec(int n) {

		if (n == 0)
			return 0;

		if (n == 1)
			return 1;

		if (n == 2)
			return 2;

		return newFRec(n - 1) + 2 * newFRec(n - 2) - newFRec(n - 3);

	}

	static int newF(int n) {

		if (n == 0)
			return 0;

		if (n == 1)
			return 1;

		if (n == 2)
			return 2;

		int f0 = 0;
		int f1 = 1;
		int f2 = 2;

		int ans = 0;
		for (int i = 3; i <= n; i++) { // i start from 3

			ans = f2 + 2 * f1 - f0;

			f0 = f1;
			f1 = f2;
			f2 = ans;

		}

		return ans;

	}

	public static void main(String[] sAry) {

		final int n = 3;

		O.l("newFRec=" + newFRec(n));
		O.l("newF=" + newF(n));

	}
}