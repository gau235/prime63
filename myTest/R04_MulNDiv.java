package myTest;

import lgpl3.o.O;

/**
 * 除法是連續減法.<br/>
 * 哲學色彩的數學.
 *
 * @version 2021/05/13_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDocOfSrc.jsp?nameOfClass=R04_MulNDiv" >R04_MulNDiv.java</a>
 *
 */
class R04_MulNDiv {

	static int mul(int n, int k, int lv) { // pretty good

		if (k == 1)
			return n;

		return n + mul(n, k - 1, lv + 1);

	}

	static int mul(int n, int k, int prod, int lv) {

		if (k == 0)
			return prod;

		return mul(n, k - 1, prod + n, lv + 1);

	}

	static int mulByLoop(int n, int k) {

		int ans = 0;
		for (; k-- != 0;)
			ans += n;

		return ans;

	}

	static int div(int big, int small) {

		if (big < small)
			return 0;

		return 1 + div(big - small, small);

	}

	static int div(int big, int small, int q) { // pretty good

		if (big < small)
			return q;

		// O.l("q=" + q);
		return div(big - small, small, q + 1);

	}

	static int divByLoop(int big, int small) { // pretty good

		int q = 0;
		for (; big > small;) {

			big -= small;
			++q;

		}

		return q;

	}

	public static void main(String[] sAry) {

		int big = 21;
		int small = 5;

		O.l("mul=" + mul(big, small, 1));
		O.l("mul2=" + mul(big, small, 0, 1));
		O.l("mulByLoop=" + mulByLoop(big, small));

		O.l("div=" + div(big, small));
		O.l("div2=" + div(big, small, 0));
		O.l("divByLoop=" + divByLoop(big, small));

	}
}